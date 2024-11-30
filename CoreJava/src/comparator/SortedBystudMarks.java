package comparator;

import java.util.Comparator;

public class SortedBystudMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if (o1.getStudMarks()>o2.getStudMarks()) 
		{
			return 1;
		}
		else if (o1.getStudMarks()<o2.getStudMarks())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
		
	}
	
	
}
