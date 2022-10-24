package Me21_예외처리;

class Animal {}
class Cat extends Animal{}
class Dog extends Animal{}

public class C03_다양한예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String str = null;
			System.out.println(str.toString()); 
			int arr[] = new int[3];
			arr[4]=100;
			System.out.println(10/0);
			Animal cat = new Cat(); 
			Dog dog = (Dog)cat;
			
		}catch(Exception e) {
			System.out.println("원인 : "+e.getCause());
			e.printStackTrace();
		}
		
		
	}

}
