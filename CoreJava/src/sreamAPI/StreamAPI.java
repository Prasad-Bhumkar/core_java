package sreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//store numbers in list using asList() fn of Arrays class
		List<Integer> numList = Arrays.asList(11,12,13,14,21,22,23,24,25,26,27,28,29,30,15,16,17,18,19,20);
		List<Integer> numList2 = Arrays.asList(11,12,13,14,21,22,23,24,25,26,27,28,29,30,15,16,17,18,19,20,11,12,13,14,21,22,23,24,25,26,27,28,29);
		System.out.println("Number List"+numList);
		System.out.println("=================================================");
		
		
		//convert list into stream for performing any operations
		Stream<Integer> numstream = numList.stream();
		
		//performing operation
		//even
		List<Integer> evenList =  numstream.filter(i->i%2==0).collect(Collectors.toList());
		
		for (Integer i:evenList)
		{
			System.out.println(i);
		}
		System.out.println("=================================================");
		
		
		//sorting
		
		List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());
		
		for (Integer j:sortedList)
		{
			System.out.println(j);
		}
		System.out.println("=================================================");
		
		//limit
		
		List<Integer> limitList = numList.stream().limit(4).collect(Collectors.toList());
		
		for(Integer k:limitList)
		{
			System.out.println(k);
		}
		System.out.println("=================================================");
		
		//remove duplicates
		
		List<Integer> duplist = numList2.stream().distinct().collect(Collectors.toList());
		
		for(Integer k:duplist)
		{
			System.out.println(k);
		}
		System.out.println("=================================================");
		
		// map function
		
		List<Integer> mapList = numList.stream().map(i->i*i).collect(Collectors.toList());
		
		for(Integer l:mapList)
		{
			System.out.println(l);
		}
		System.out.println("=================================================");
	}
}
