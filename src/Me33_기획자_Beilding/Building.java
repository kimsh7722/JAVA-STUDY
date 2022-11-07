package Me33_기획자_Beilding;

import Me32_기획자_Unit.Unit;

public abstract class Building {
	
	public int HP;
	public int Ammor;
	
	
	abstract void Construct();
	abstract void UnderAttack(Unit unit);
	

}
