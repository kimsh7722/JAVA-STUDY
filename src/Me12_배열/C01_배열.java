package Me12_배열;

public class C01_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		길이가 5인 int형 1차원 배월의 생성
		int[] ar1 = new int[5];
		ar1[0]=11;
		ar1[1]=12;
		ar1[2]=13;
		ar1[3]=14;
		ar1[4]=15;
		
		
//		길이가 7인 double형 1차원 배월의 생성
		double[] ar2 = new double[7];
		
//		배열의 참조변수와 인스턴스 생성분리
		float[] ar3;
		ar3=new float[9];
		
//		배열의 인스턴스변수 접근
		System.out.println("배열의 ar1길이: "+ar1.length);
		System.out.println("배열의 ar2길이: "+ar2.length);
		System.out.println("배열의 ar3길이: "+ar3.length);
	}

}
