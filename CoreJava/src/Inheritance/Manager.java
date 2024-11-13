package Inheritance;

public class Manager extends Employee{
	
	public Manager(int basicSal, int hra, int da,int incentive) {
		super(basicSal, hra, da);
		this.incentive=incentive;
	}

	private int incentive=3446;
	
	public int getIncentive()
	{
		return incentive;
	}
	
}
