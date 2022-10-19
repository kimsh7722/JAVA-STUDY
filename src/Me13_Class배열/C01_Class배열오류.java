package Me13_Class배열;

class Person14 {
	String name;
	String age;
	String addr;
}

public class C01_Class배열오류 {

	public static void main(String[] args) {
		
//		클래스 지정 하지않으면 파일이 없다고 뜬다
		Person14 employee[]=new Person14[3];
		
		employee[0]=new Person14();
		employee[0].name="홍길동";
		employee[0].age="36";
		employee[0].addr="대구광역시~";
		
		employee[1]=new Person14();
		employee[1].name="이광수";
		employee[1].age="55";
		employee[1].addr="울산";
		
		employee[2]=new Person14();
		employee[2].name="서태지";
		employee[2].age="27";
		employee[2].addr="창원";
		
		for(int i=0; i<employee.length; i++) {
			System.out.println("이름 : "+employee[i].name);
			System.out.println("나이 : "+employee[i].age);
			System.out.println("주소 : "+employee[i].addr);
			System.out.println();
		}
	}

}
