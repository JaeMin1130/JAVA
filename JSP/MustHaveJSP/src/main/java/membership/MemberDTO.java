package membership;
import java.io.Serializable; // mark 인터페이스 : 메서드 없이 이름만 있는 인터페이스
public class MemberDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String pwd;
	private String name;
	private String regidate;
	
	MemberDTO(){}
	
	MemberDTO(String id){
		this.id = id;
	}

	MemberDTO(String id, String pwd, String name){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public MemberDTO(String id, String pwd, String name, String regidate){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", regidate=" + regidate + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegidate() {
		return regidate;
	}
	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}
}
