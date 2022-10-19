package Me14_Static;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int len = a.length+b.length;
		int[] arr = new int[len];
		int i=0;
		while(i < a.length) {
			arr[i]=a[i];
			i++;
		}
		while(i < len) {
			arr[i] = b[i-a.length];
			i++;
		}
		return arr;
	}
	public static void print(int[] a) {
		for(int i=0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
	}
}

public class C02_Static_이해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
