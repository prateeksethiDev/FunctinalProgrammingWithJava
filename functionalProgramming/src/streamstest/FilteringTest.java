package streamstest;

import java.util.Random;
import java.util.stream.Stream;

public class FilteringTest {

	public static void main(String[] args) {
		//Select 10 random positive distinct integers
		final Random rand=new Random();
		Stream<Integer> randoms=Stream.generate(rand::nextInt);
		randoms.filter(n->n>0).distinct().limit(10).forEach(System.out::println);

	}
}
