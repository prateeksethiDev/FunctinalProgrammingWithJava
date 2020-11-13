package streamstest;

import java.util.Arrays;
import java.util.stream.Stream;
import functinalInterfaces.Employee;

public class StreamTesting {
	public static void main(String[] args) {
		//of is static method of stream class and is variadic method
		Stream<Integer> fib=Stream.of(1,1,2,3);
		//fib.forEach(System.out::println);
		fib.limit(2).forEach(System.out::println);
		
		Employee emp1 = new Employee("charles",111);
		Employee emp2 = new Employee("Karls",111);
		
		//Stream created from arrays are ordered and sequential
		Employee[] emps= {emp1,emp2};
		Stream<Employee> empStream=Arrays.stream(emps);
	}
}
