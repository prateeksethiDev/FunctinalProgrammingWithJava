package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {

	public GenericTest() {
		
	}
		//Generic Method keeps method flexible
	public static <T>List<T> getList(T[]arr) {
		return Arrays.asList(arr);
	}

	public static void main(String[] args) {
		//This non generic form can accept any type, therefore type-casting is required at retrieval
		List names = new ArrayList();
		names.add("Ally");
		names.add(123);
		String name=(String) names.get(0);
		System.out.println("First Name: "+name);
		
		//Compiler restrict to allow only String type, no typecasting required also prevents Class Cast exception
		List<String> names2 = new ArrayList<>();
		names2.add("Ally");
		String name2= names2.get(0);
		System.out.println("First Name: "+name2);
		
		
		Character[] charArray= {'h','e','l','l','o'};
		Integer[] intArray= {1,2,3,4,5,6};
		
		List<Character> charList=getList(charArray);
		List<Integer> intList=getList(intArray);
		System.out.println(intList.get(0));
	}
}
