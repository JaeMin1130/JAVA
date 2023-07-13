package membership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.JDBCconnect;

public class MemberDAO extends JDBCconnect {
	public MemberDAO() {}
	public MemberDAO(String driver, String connectUrl, String id, String pwd) {
		super(driver, connectUrl, id, pwd);
	}

	public MemberDTO getMemberDTO(String uid, String upwd) {
		MemberDTO dto = new MemberDTO();
		Connection con = getConnection();
		if (con == null)
			return null;

		PreparedStatement psmt = null;
		ResultSet rs = null;
		String query = "select * from member where id = ? and pwd = ?";

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upwd);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		} catch (Exception e) {
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
				e.printStackTrace();
			}
		}
		return dto;
	}

	public ArrayList<MemberDTO> getAllMemberDTO() {
		ArrayList<MemberDTO> list = null;
		Connection con = getConnection();
		if (con == null)
			return null;

		PreparedStatement psmt = null;
		ResultSet rs = null;
		String query = "select * from member";

		try {
			list = new ArrayList<MemberDTO>();
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
				list.add(dto);
			}

		} catch (Exception e) {
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
				e.printStackTrace();
			}
		}
		return list;
	}
	public void insert(MemberDTO dto) {
		Connection con = getConnection();
		PreparedStatement psmt = null;
		String sql = "insert into member (id, pwd, name) values(?, ?, ?)";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			psmt.setString(3, dto.getName());
			psmt.executeUpdate();
			System.out.println("데이터가 입력되었습니다.");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(MemberDTO dto) {
		Connection con = getConnection();
		PreparedStatement psmt = null;
		String sql = "delete from member where id = ?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.executeUpdate();
			System.out.println("데이터가 삭제되었습니다.");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(MemberDTO dto1, MemberDTO dto2) {
		Connection con = getConnection();
		PreparedStatement psmt = null;
		String sql = "update member set pwd = ? where id = ?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto2.getPwd());
			psmt.setString(2, dto1.getId());
			psmt.executeUpdate();
			System.out.println("데이터가 수정되었습니다.");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
