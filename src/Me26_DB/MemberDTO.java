package Me26_DB;

public class MemberDTO {
	private String email;
	private String addr;
	private String phone;
	
	MemberDTO(String email,String addr, String phone) {
		this.email=email;
		this.addr=addr;
		this.phone=phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemberDTO [email=" + email + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
}
