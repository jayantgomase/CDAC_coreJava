package day10;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	private int charges;

	private ServicePlan(int charges) {
		this.charges = charges;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}
	
	public String toString()
	{
		return name()+" with charges "+ charges;
	}
}


