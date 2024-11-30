package comparator;

import java.util.Comparator;

public class SortedByempSal implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (o1.getEmpSalary()>o2.getEmpSalary()) 
		{
			return 1;
		}
		else if(o1.getEmpSalary()<o2.getEmpSalary()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	

}
