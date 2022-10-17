package Me10_접근한정자;

/*
 * 접근 한정자 [ 클래스 ]
 * 	public : 모두,전체 class 사용
 *  private : 현재 class에만 가능 
 *  protected : 동일패키지or상속관계인 하위class에만 가능
 *  default : 동일패키지[상단에 있는 package 명]에 속한 class만 접근
 */
 
class C01Person {
	public String name;
	private String id;
	private int pw;
	protected int master;
	public C01Person(String name, String id, int pw, int master) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.master = master;
	}
//	Setter 함수
	public void setId(String YD) {
//		private 지정된 변수
//		아래에서 hong.setId(매개체)정보를 받아
		this.id=YD;
	}
//	Getter 함수
	public String getId() {
//		setId의 정보로 리턴화
		return id;
	}
	
	
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public int getMaster() {
		return master;
	}
	public void setMaster(int master) {
		this.master = master;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+name+"\n"
				+"ID : "+id+"\n"
				+"PW : "+pw+"\n"
				+"Master : "+master;
	}
}

public class C01_접근클래스_setget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C01Person hong = new C01Person("홍길동","1111-1111",44,100);
		System.out.println(hong.toString());
		System.out.println();
		
//		public
		hong.name="변길동";
		System.out.println(hong.name);
		System.out.println();
		
//		private-ID
		hong.setId("222-222"); // <- setId함수로 보내고 
		System.out.println("Private ID : "+hong.getId()); // <- getId함수로 호출
		System.out.println();
		
//		private-PW
		hong.setPw(14456);
		System.out.println("Private PW : "+hong.getPw());
		System.out.println();
		
//		protected-master // 상송관계는 알아둬야함
		hong.setMaster(110022);
		System.out.println("Protected : "+hong.getMaster());
		System.out.println();
	}

}
