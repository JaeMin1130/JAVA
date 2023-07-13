package fileupload;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import common.JDBCconnect;

public class MyfileDAO extends JDBCconnect {
	public int insertFile(MyfileDTO dto) {
		int applyResult = 0;
		String query = "insert into myfile (name, title, cate, ofile, sfile) values(?, ?, ?, ?, ?)";
		Connection con = getConnection();
		PreparedStatement psmt = null;
		try {
			psmt = con.prepareStatement(query);

			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());

			applyResult = psmt.executeUpdate();
			System.out.println("데이터가 입력되었습니다.");
		} catch (Exception e) {
			System.out.println("INSERT 중 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
			}
		}
		return applyResult;
	}

	public List<MyfileDTO> myFileList() {
		List<MyfileDTO> fileList = new Vector<MyfileDTO>();

		String query = "select * from myfile order by idx desc";
		Connection con = getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {
				MyfileDTO dto = new MyfileDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setCate(rs.getString(4));
				dto.setOfile(rs.getString(5));
				dto.setSfile(rs.getString(6));
				dto.setPostdate(rs.getString(7));

				fileList.add(dto);
			}
		} catch (Exception e) {
			System.out.println("SELECT 시 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
			}
		}

		return fileList;
	}

	public static void main(String[] args) {
		MyfileDAO testDAO = new MyfileDAO();
//		MyfileDTO testDTO = new MyfileDTO();
//		testDTO.setName("Iru");
//		testDTO.setTitle("Iru1");
//		testDTO.setCate("0");
//		testDTO.setOfile("1");
//		testDTO.setSfile("2");
//		testDAO.insertFile(testDTO);
		List<MyfileDTO> fileList = testDAO.myFileList();
		for (int i = 0; i < fileList.size(); i++) {
			System.out.println(fileList.get(i).toString());
		}
		
	}
}
