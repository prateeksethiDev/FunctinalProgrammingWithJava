package lambdaExpressions;

import java.util.function.Consumer;

public class LambdaImplementation {

	public static void main(String[] args) {
		System.out.println("Anonymous Class Multiple instance:");
		for(int i=0;i<5;i++) {
			Consumer<String> myPrinter1=new Consumer<>() {

				@Override
				public void accept(String msg) {
					System.out.println("Consuming: "+msg);
				}				
			};	
			myPrinter1.accept(myPrinter1.toString());
		}
		
		System.out.println("Non-capturing lambda,one instance:");
		for(int i=0;i<5;i++) {
			Consumer<String> myPrinter2=msg->System.out.println("Consuming: "+msg);
			myPrinter2.accept(myPrinter2.toString());
		}
		
		
		System.out.println("constant capturing lambda, one instance:");
		final int secret=42;
		for(int i=0;i<5;i++) {
			Consumer<String> myPrinter2=msg->System.out.println("Consuming: "+msg+","+secret);
			myPrinter2.accept(myPrinter2.toString());
		}
new LambdaImplementation().foo();
	}
	
	private int id=1;
	public void foo() {
		System.out.println("Instance capturing lambda,multiple instance:");
		for(int i=0;i<5;i++) {
			Consumer<String> myPrinter2=msg->System.out.println("Consuming: "+msg+","+id);
			myPrinter2.accept(myPrinter2.toString());
		}
	}

}
