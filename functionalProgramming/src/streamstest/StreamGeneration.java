package streamstest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functinalInterfaces.Employee;

public class StreamGeneration {

	public static void main(String[] args) {
		
		
		//Use case 1: To print the top 2 employee with highest salaries
		Employee emp1 = new Employee("jon", 1000);
		Employee emp2 = new Employee("von", 2000);
		Employee emp3 = new Employee("lon", 1500);
		
		Employee[] emps= {emp1,emp2,emp3};
		
		Stream<Employee> empStream=Stream.of(emps);
		empStream.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(2).map(Employee::getName).forEachOrdered(System.out::println);
			
		//Use case 2: To count the number of distinct integer in a list
		
		List<Integer> list= Arrays.asList(1,2,3,1,4);
		long n=list.parallelStream().unordered().distinct().count();
		System.out.println("The number of distinct integer in a list: "+n);
		
		//Use Case 3: To summarize into a treeset
		Stream<Employee> empStream2=Stream.of(emps);
		TreeSet<Employee> tree=empStream2.collect(Collectors.toCollection(()->new TreeSet<Employee>(Comparator.comparingInt(Employee::getSalary))));
		tree.forEach(System.out::println);
		
		
		
	}
}
 