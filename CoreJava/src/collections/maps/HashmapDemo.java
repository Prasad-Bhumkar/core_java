package collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		//hashmap is not threadsafe
		Map<String , Long> phoneDirectory = new HashMap<String, Long>();
		
		//this is entry list containing keysets and their values
		//values can be null but keys cannot be null
		//keys cannot be redundant
		phoneDirectory.put("Sagar", 785459658574L); //entry
		phoneDirectory.put("Aditi", 912345678901L);
		phoneDirectory.put("Rahul", 998877665544L);
		phoneDirectory.put("Priya", 987654321012L);
		phoneDirectory.put("Vikram", 876543210987L);
		phoneDirectory.put("Neha", 765432109876L);
		phoneDirectory.put("Arjun", 654321098765L);
		phoneDirectory.put("Riya", 543210987654L);
		phoneDirectory.put("Karan", 432109876543L);
		phoneDirectory.put("Sneha", 321098765432L);
		
		//to return keyset
		System.out.println(phoneDirectory.keySet());
		System.out.println("================================================");
		
		//to return entryset
		System.out.println(phoneDirectory.entrySet());
		System.out.println("================================================");
		
		//check entryset if it contains a key
		System.out.println(phoneDirectory.containsKey("Sagar"));//will return true 
		System.out.println("================================================");
		
		//get value of key from entryset 
		System.out.println("Phone number of Neha :"+phoneDirectory.get("Neha"));//will return mobile number of neha
		System.out.println("================================================");
		
		//iterating
		//entryset() method is used to load entryset 
		for(Entry<String, Long> entry : phoneDirectory.entrySet())
		{
			System.out.println(entry);
		}
	}
}
