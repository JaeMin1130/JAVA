package chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList <String> Arr = new ArrayList<String>();
		Arr.add("Iru");
		Arr.add("is");
		Arr.add("cute");
		
		Iterator<String> iter = Arr.iterator();	
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		HashMap <String, String> map = new HashMap<String, String>();
		map.put("cat1", "Iru");
		map.put("cat2", "Jinjin");
		map.put("dog2", "Mimi");
		map.put("dog1", "Coco");
		System.out.println(map.entrySet());
		Iterator <String> iter1 = map.keySet().iterator();
		while(iter1.hasNext()) {
			System.out.println(map.get(iter1.next()));
		}
//		for(Map.Entry<String, String> dic : map.entrySet()) {
//			System.out.println(dic.getKey());
//		}
	}

}
