package Me32_기획자_Unit;

public abstract class Gun {
	int bulletCnt;
	int power;
	
	abstract void fire(Unit unit);

	abstract void reload();

}
