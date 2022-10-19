package Me16_상속2_Overriding;
/*
 * 
 * Overriding [함수재정의]
 * 상속관게에서 상위클래스의 메서드를 하위클래스가 재정의(고쳐사용하기)하는 것을 허용하는 문법
 * 메서드의 헤더부분은 동일하나 바디{} 부분의 로직이 다를 수 가 있다.
 */
class Animal {
	public void Sound() {
		System.out.println("동물 울음소리");
	}
}

class DOG extends Animal {
	public void Sound() {
		System.out.println("개가 짓네요 으르르.. 멍!");
	}
}
class CAT extends Animal {
	public void Sound() {
		System.out.println("고양이가 우네요 냐옹");
	}
}

public class C01_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOG dog = new DOG();
		CAT cat = new CAT();
		
		dog.Sound();
		cat.Sound();
	}

}
