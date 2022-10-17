package Me05_IF조건;

import java.util.Scanner;

public class C01_2회차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 90 = A
		 * 80 이상 90 미만
		 * 70 이상 80 미만 
		 * */
		Scanner sc = new Scanner(System.in);
		
//		int kor=sc.nextInt(), eng=sc.nextInt(), mat=sc.nextInt();
//		double avg = (double)(kor+eng+mat)/3;
//		if(kor < 40) {
//			System.out.println("불합격");
//		}else if(eng < 40) {
//			System.out.println("불합격");
//		}else if(mat < 40) {
//			System.out.println("불합격");
//		}else if(avg < 60) {
//			System.out.println("현재점수 : "+avg+" 불합격");
//		}else {
//			System.out.println("합격");
//		}
		
//		시험
//		문제 : 90~ 100 A, 80 ~ 70 B, 60~69 F
//		int n1=sc.nextInt();
//		int n2=sc.nextInt(), n3=sc.nextInt();
//		int sum=n1+n2+n3;
//		double avg=sum/3;
//		if(n1 <= 100 && n1 >= 90) {
//			System.out.println("A");
//			
//		}else if(n1 <= 89 && n1 >= 80) {
//			System.out.println("B");
//			
//		}else if(n1 <= 79 && n1 >= 70) {
//			System.out.println("C");
//			
//		}else if(n1 <= 69 && n1 >= 60){
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
//		문제 2
		int age=sc.nextInt();
		if(age <= 8) {
			System.out.println("1000");
		}else if(age <= 14) {
			System.out.println("2000");
		}else if(age <= 20) {
			System.out.println("3000");
		}else  {
			System.out.println("성인");
		}
	
	}

}
