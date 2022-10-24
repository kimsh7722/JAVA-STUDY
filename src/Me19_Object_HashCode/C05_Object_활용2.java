package Me19_Object_HashCode;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

class C02Simple {
	int x;
	int y;
	C02Simple(int x, int y) {this.x=x; this.y=y;}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;
			return this.x == down.x && this.y==down.y;
		}
		return false;
	}
	@Override
	public String toString() {
		return "C02Simple [x=" + x + ", y=" + y + "]";
	}
	
	
	
}

public class C05_Object_활용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C02Simple obj1 = new C02Simple(10,20);
		C02Simple obj2 = new C02Simple(10,20);
		
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
