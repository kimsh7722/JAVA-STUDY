package Me12_배열;

import java.util.Arrays;

public class C02_배열_이해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[9];
		arr[0]=20;arr[5]=30;
		arr[1]=50;arr[6]=35;
		arr[2]=60;arr[7]=90;
		arr[3]=20;arr[8]=25;
		arr[4]=40;
		
		int sum=0; double avg=0.0;
//		for(int i=0; i < arr.length; i++) {
//			System.out.println("배열의 을 불러 : "+arr[i]);
//			sum+=arr[i];
//			System.out.println("전체합 : "+sum);
//		}
//		System.out.println("전체합 : "+sum);
		
//		평균값
//		avg = sum/arr.length;
//		System.out.println("평균값 : "+avg);
		
//		최소, 최대
//		이건안만바도 if 인대 ㅡㅡ
//		int amax=0;
//		int amin=999999;
//		
//		for(int i=0; i<arr.length; i++) {
//			amax = Math.max(arr[i], amax);
//			amin = Math.min(arr[i], amin);
//				재대입		비교값   몇번째
//		}
//		System.out.println("MAX : "+amax);
//		System.out.println("MIN : "+amin);
		
		
//		단축값
//		for(int sum1 : arr) {
//			
//			System.out.println(sum1);
//			sum1+=sum1;
//			System.out.println("전체합 : "+sum1);
//		}
		
		
		
//		다른 max, min
		int imax = arr[0]; 
		int imin = arr[0];
		int max,min;
		for(int i=0; i<arr.length;i++) {
			if(imax < arr[i]) {
				imax = arr[i];
			}
			if(imin > arr[i]) {
				imin = arr[i];
			}
		}
		System.out.println(imax+","+imin);
		System.out.println();
		
//		1방법
		int gmax=arr[0],gmin=arr[0];
		for(int num : arr) {
			if(gmax<num) {
				gmax=num;
			}
			if(gmin>num) {
				gmin=num;
			}
		}
		System.out.println(gmax+","+gmin);
//		2방법
		int fmax,fmin;
		fmax=arr[0];
		fmin=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>fmax) {
				fmax=arr[i];
			}
			if(arr[i]<fmin) {
				fmin=arr[i];
			}
		}
		System.out.println("최대 : "+fmax);
		System.out.println("최대 : "+fmin);
		
		int max1=Arrays.stream(arr).max().getAsInt();
		int min1=Arrays.stream(arr).min().getAsInt();
	}

}
