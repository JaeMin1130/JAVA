package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import membership.MemberDTO;

public class ObjectMain {

	public void serialize(MemberDTO obj, String fileName) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { // 보조 스트림
			oos.writeObject(obj);
		}
	}

	public void serialize(List<MemberDTO> list, String fileName) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { // 보조 스트림
			for (MemberDTO m : list) {
				oos.writeObject(m);
			}
		}
	}

	public MemberDTO deserialize(String fileName) throws IOException, ClassNotFoundException {
		MemberDTO m = null;
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis);) { // 보조
			m = (MemberDTO) ois.readObject();
		}
		return m;
	}

	public List<MemberDTO> deserialize1(String fileName) throws IOException, ClassNotFoundException {
		MemberDTO m = null;
		List<MemberDTO> list = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis);) { // 보조
			while ((m = (MemberDTO)ois.readObject()) != null) {
				list.add(m);
			}
		}
		catch(Exception e) {
			return list;
		}
		return list;
	}

	public static void main(String[] args) throws Exception {

		ObjectMain om = new ObjectMain();

		List<MemberDTO> list = new ArrayList<>();
		list.add(new MemberDTO("100", "1234", "홍길동", "2023-05-31"));
		list.add(new MemberDTO("200", "1234", "김길동", "2023-05-31"));
		list.add(new MemberDTO("300", "1234", "박길동", "2023-05-31"));
		om.serialize(list, "testObjects.dat");
		MemberDTO m = (MemberDTO) om.deserialize1("testObject.dat");
		System.out.println(m);
	}
}
