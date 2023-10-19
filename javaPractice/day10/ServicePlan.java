package day10;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	private double charges;

	private ServicePlan(int charges) {
		this.charges = charges;
	}

	public double getCharges() {
		return charges;
	}
	
	@Override
	public String toString()
	{
		return name()+" with charges "+ charges;
	}
}


