package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import functinalInterfaces.Employee;

interface ThreadSupplier{
	Thread giveMeAThread();
}

public class MethodRefImpl {

	public static void main(String[] args) {
		
		//Static method
		Supplier<Thread> s1=Thread::currentThread;
		
		//Type is infer based on context, in this case ThreadSupplier
		ThreadSupplier ts=Thread::currentThread;
		
		Employee frank = new Employee("Frank",3000);
		Integer i=frank.getSalary();
		Supplier<Integer> s2 =frank::getSalary;
		
		System.out.println(s2.get());
		
		//A common instance method (instance specified)
		Consumer<String> c1=System.out::println;
		c1.accept("hello");
		
		//An instance method (instance not specified)
		Function<Employee,Integer> f1=Employee::getSalary;
		Integer frankSalary=f1.apply(frank);
		System.out.println("Frank salary is: "+frankSalary);
	}
}
