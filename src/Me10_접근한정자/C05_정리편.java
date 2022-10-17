package Me10_접근한정자;



class Profile {

	


	private String name;
	private String addr;
	private String job;
	private String major;

	// 1 디폴트 생성자 삽입
	Profile() {}

	// 2 모든 인자를 받는 생성자 삽입
//	public Profile(String name, String addr, String job, String major) {
//		super();
//		this.name = name;
//		this.addr = addr;
//		this.job = job;
//		this.major = major;
//	}
	
	
	
	Profile(String all) {
		// ->all문자열 앞뒤 공백은 제거(trim())
		// ->, 단위로 잘라내기(split(","))하여 각각의 값을
		// name,addr,job,major에 저장할것(안되면 강사와 함께..배열을 사용..)
//		all=sc.nextLine();
		
		all=all.trim();
		String arr[] = all.split(",");
		for (int i = 0; i <= arr.length; i++) {
//			System.out.println("arr[" + i + "] = " + arr[i] + "\n");
			this.name=arr[0];
			this.addr=arr[1];
			this.job=arr[2];
			this.major=arr[3];
		}
	}


	// 4 toString() 재정의 코드 삽입
	@Override
	public String toString() {
		
		return "Profile [\n name=" + name + "\n"
				+ " addr=" + addr + "\n"
				+ " job=" + job + "\n"
				+ " major=" + major + "]";
	}

	// 5 Getter and Setter 코드 삽입W
	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getJob() {
		return job;
	}

	public String getMajor() {
		return major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	// 6 다음 멤버메서드 안 코드 처리
	boolean isContain(String findstr) {
//			findstr 의 문자열이 멤버인 name,addr,job,major 중 하나라도 
//			포함되면 true 리턴
//			아니면 false 리턴
//			this.name=findstr; // 이러면 매개체가 대입대서 문제가 생긴다
		
		if((name.contains(findstr))||(addr.contains(findstr))) {
			return true;
		}else if((job.contains(findstr))||(major.contains(findstr))){
			return true;		
		}else {
			return false;
		}
	}
	
	// 7 다음 멤버메서드 안 코드 처리
	boolean isequals(String all) {
		// all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		// name,addr,job,major 와 일치 하면 true
		// 아니면 false 를 리턴
		 all=all.trim();
		 String tmp[]=all.split(",");	
		if (name.equals(tmp[0])||addr.equals(tmp[1])) {
			return true;
		} else if(job.equals(tmp[2])||major.equals(tmp[3])) {
			return true;
		} else {
			return false;
		}
	}
}

public class C05_정리편 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile hong = new Profile(" 홍길동,대구,프로그래머,컴퓨터공학 ");

		System.out.println(hong.toString());
		System.out.println("길동 포함 여부 : " + hong.isContain("길동"));
		System.out.println("컴퓨터 포함 여부 : " + hong.isContain("컴퓨터"));
		System.out.println("프로필 일치 여부:"+hong.isequals("홍길동,대구,프로그래머,컴퓨터공학 "));
		System.out.println("프로필 일치 여부:"+hong.isequals(" 홍길동,울산,프로그래머,컴퓨터공학 "));
	}

}
