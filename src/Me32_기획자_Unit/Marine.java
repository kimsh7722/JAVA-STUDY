package Me32_기획자_Unit;

public class Marine extends Unit{

	Gun myGun;
	
	public Marine(Gun gun,String name){
		myGun=gun;
		HP=1000;
		this.name = name;
	}
	
	@Override
	void move() {
		if (isalive) {
			System.out.println(name + " 이 이동합니다.");
		}
	}

	void Attack(Unit unit) {
		System.out.println(name + " 이 공격합니다.");
		myGun.fire(unit);
	}
}
