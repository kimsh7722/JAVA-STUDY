package Me33_기획자_Beilding;

import Me32_기획자_Unit.Unit;

public class Factory extends Building implements ICanFly {

	private FactoryAddOn extendOn;
	
	void ExtendFactory() {
		extendOn = new FactoryAddOn();
	}
	
	@Override
	void Construct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void UnderAttack(Unit unit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		
	}

	
	
}
