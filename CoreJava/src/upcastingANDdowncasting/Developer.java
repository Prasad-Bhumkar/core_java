package upcastingANDdowncasting;

public class Developer extends Employee{
	
	private int nightAllowance;

	public Developer(int basicSal, int hra, int da, int nightAllowance) {
		super(basicSal, hra, da);
		this.nightAllowance = nightAllowance;
	}
	
	@Override
	public int calCulateSalary() {
		
		return super.calCulateSalary()+nightAllowance;
	}
}