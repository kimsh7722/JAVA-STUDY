package Me22_제네릭_중요;

class caramel {
	public String toString() {
		return "캬라멜";
	}
}
class onion {
	public String toString() {
		return "어니언";
	}
}

class PopCorn <t> {
	private t meterial;
	
	
	public t getMeterial() {
		return meterial;
	}


	public void setMeterial(t meterial) {
		this.meterial = meterial;
	}


	void Fry() {
		System.out.println(meterial+"맛 팝콘을 만들었다");
	}
}

public class C04_Generic_실습 {

	public static void main(String[] args) {
		
		PopCorn<caramel> corn1 = new PopCorn<caramel>();
		corn1.setMeterial(new caramel());
		corn1.Fry();
		
		System.out.println();
		
		PopCorn<onion> corn2 = new PopCorn<onion>();
		corn2.setMeterial(new onion());
		corn2.Fry();
	}

}
