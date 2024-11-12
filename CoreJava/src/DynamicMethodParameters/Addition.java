package DynamicMethodParameters;

public class Addition {
	public double add(double a,double... b)
	{
		for(double temp:b)
		{
			a+=temp;
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		System.out.println(a1.add(22.5,500,600,925,345));
	}
}