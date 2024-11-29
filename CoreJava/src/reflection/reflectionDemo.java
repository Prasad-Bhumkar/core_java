package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionDemo {
		
	public static void main(String[] args) {
		
		try {
			//loading and storing class in empClass variable of 'Class' class
			Class empClass = Class.forName("reflection.Employee");
			
			System.out.println("Class Name : "+empClass.getName());
			System.out.println("Super Class : "+empClass.getSuperclass());
			
			System.out.println("============================================");
			
			System.out.println("Fiels of Employee : ");
			
			Field [] fields = empClass.getDeclaredFields();
			for(Field field:fields)
			{
				System.out.println("Field Name : "+field.getName()+"\tData Type : "+field.getType());
				System.out.println("-----------------------------------------------------");
			}
			
			Method [] methods = empClass.getDeclaredMethods();
			for(Method method:methods)
			{
				System.out.println("Method Name : "+method.getName()+"\tReturn Type : "+method.getReturnType());
				System.out.println("----------------------------------------------------");
			}
			
			Constructor [] constructors = empClass.getDeclaredConstructors();
			for(Constructor constructor:constructors)
			{
				System.out.println("Constructor Name : "+constructor.getName());
				System.out.println("Number of Parameters : "+constructor.getParameterCount());
				System.out.println("-----------------------------------------------------");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
