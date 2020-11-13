package lambdaExpressions;

import java.util.Comparator;

import functinalInterfaces.Employee;

public class Lambda1 {
	
	
	public static void main(String[] args) {
		
		Comparator<Employee> byName=new Comparator<Employee>() {
			@Override
			public int compare(Employee a, Employee b) {
				return a.getName().compareTo(b.getName());
			}
		};
		
		//our first lambda expression
		Comparator<Employee> byNameLambda1=(Employee a, Employee b) ->{
			return a.getName().compareTo(b.getName());
		};
		
		//Removing parameter types
		Comparator<Employee> byNameLambda2=(a, b) ->{
			return a.getName().compareTo(b.getName());
		};
		
		//Removing braces and 'return'
		Comparator<Employee> byNameLambda3=(a, b) -> a.getName().compareTo(b.getName());
		
		//Expressions with no parameters
		
		Runnable r= () ->{System.out.println("A compact Runnable!");};
		Thread t1 =new Thread(r);
			
	}
}
