package lambdaExpressions;

import java.util.function.Consumer;

public class LambdaInference {

	public static void main(String[] args) {
		
		//Standard -syntax
		Consumer<String> c1=msg ->System.out.println(msg.length());
		
		//Object x1=msg ->System.out.println(msg.length());
		
		//Object x2=(String msg) ->System.out.println(msg.length());
		
		Object x3=(Consumer<String>)((String msg) ->System.out.println(msg.length()));
		

	}

}
