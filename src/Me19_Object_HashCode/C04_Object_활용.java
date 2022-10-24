package Me19_Object_HashCode;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.Objects;

class C01Simple {
	int x;
	int y;
	C01Simple(int x, int y) {this.x=x; this.y=y;}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		JAVA 6버전 이하
		int result = 17;
//		31은 소수로 사용되며 다음과 같이 더 나은 성능을 제공합니다.
//		31*result==(result << 5) - result
		result += 31 * result + x;
		result += 31 * result + y;
		
//		JAVA 6버전 이상
		return Objects.hash(this.x, this.y);

	}
	
}

public class C04_Object_활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C01Simple obj1 = new C01Simple(10,20);
		C01Simple obj2 = new C01Simple(10,20);
		
		System.out.println("Object 1: "+obj1);
		System.out.println("Object 2: "+obj2);
		System.out.println("----------------------");
		System.out.println("HachCode : "+obj1.hashCode());
		System.out.println("HachCode : "+obj2.hashCode());
		System.out.println("----------------------");
		System.out.println("Identity의 고유값 : "+System.identityHashCode(obj1));
		System.out.println("Identity의 고유값 : "+System.identityHashCode(obj2));
	}

}
