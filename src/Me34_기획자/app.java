package Me34_기획자;

public class app {

	public static void main(String[] args) {

		Subject sub1 = new Subject(1010L,"이산수학");
		Subject sub2 = new Subject(2010L,"JAVA");
		Subject sub3 = new Subject(3010L,"Servlet");
		
		Student s1 = new Student("이수",25,"대구",20221010L,"컴공");
		s1.addSubject(sub1);
		s1.addSubject(sub2);
		System.out.println(sub1);
		System.out.println("-----------------------------------");
		System.out.println(s1);
	}

}
