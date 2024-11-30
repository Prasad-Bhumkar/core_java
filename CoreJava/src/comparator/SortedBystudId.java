package comparator;

import java.util.Comparator;

public class SortedBystudId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		
		if (o1.getStudId()>o2.getStudId()) 
		{
			return 1;
		}
		else if (o1.getStudId()<o2.getStudId())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
		
	}

}
