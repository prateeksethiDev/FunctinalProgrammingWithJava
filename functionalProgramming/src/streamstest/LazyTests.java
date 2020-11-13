package streamstest;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LazyTests {

	public static void main(String[] args) {
		final Random random = new Random();
		Supplier<Integer>supp=()->{
			Integer result=random.nextInt();
			System.out.println("(Supplying"+result+")");
			return result;
		};
		System.out.println("\n Test1");
		
		Stream<Integer>  randoms=Stream.generate(supp);
		System.out.println("First stream built");
		randoms.filter(n->n>=0).limit(3).forEach(System.out::println);
	}
}
