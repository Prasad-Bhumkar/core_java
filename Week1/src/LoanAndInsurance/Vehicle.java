
package LoanAndInsurance;

public class Vehicle implements IssueLoan,Insurance
{
	
	private int vehicleNo;
	private String modelName;
	private String vehicleType;
	private double price;
	public double loanAmount;


	public Vehicle(int vehicleNo, String modelName, String vehicleType, double price) 
	{
		super();
		this.vehicleNo = vehicleNo;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}



	@Override
	public double takeInsurance() {
		
		return 0;
	}



	@Override
	public void issueLoan() {
		if (vehicleType=="4 Wheeler") {
			    
		} else if(vehicleType=="3 Wheeler") {

		}
		
	}

	
}
