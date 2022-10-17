package Me12_배열;

import java.util.Arrays;

public class C03_배열_이해2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		얕은 복사 
		int arr[]= {10,20,30};
		int arr2[]=arr;
		
		arr2[0]=100; arr2[1]=200; arr2[2]=300;
		
//		for(int n : arr) {
//			증가값 : 조건값
//			System.out.println(n);
//		}
		
//		int arr3[][];
//		for(int i=0; i < arr3.length; i++) {
//			arr3=arr[i]; 
//			System.out.println(arr3);
//		}
		
		// 깊은 복사(데이터값)
		int arr4[]=Arrays.copyOf(arr, arr.length);
		System.out.println("arr4 : "+arr4);
		for(int n : arr4) {
//		증가값 : 조건값
		System.out.println(n);
		}
		
		
	}

}
