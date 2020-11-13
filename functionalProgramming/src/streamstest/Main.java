package streamstest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		List<Person> people=getPeople();
		
		//Imperative approach/Old approach till Java 7
		List<Person> females=new ArrayList<Person>();
//		for(Person person:people) {
//			if(person.getGender().equals(Gender.FEMALE)) {
//				females.add(person);
//			}
//		}
		
		//females.forEach(System.out::println);
		
		//Declerative approach
		females=people.stream().filter(n->n.getGender().equals(Gender.FEMALE))
		.collect(Collectors.toList());
		// females.forEach(System.out::println);
		List<Person> sorted=people.stream().sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getGender).reversed())
		.collect(Collectors.toList());
		
		sorted.forEach(System.out::println);
		
		// All Match
		boolean allMatch=people.stream().allMatch(person->person.getAge()>15);
		System.out.println(allMatch);
		
		// any Match
		boolean anyMatch=people.stream().anyMatch(person->person.getAge()>15);
		System.out.println(anyMatch);
		
		//None Match
		boolean noneMatch=people.stream().noneMatch(person->person.getName().equals("Antanio"));
		System.out.println(noneMatch);
		
		//Max
		people.stream().max(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
		
		//Min
		people.stream().min(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
		
		//Group Information based on fields
		
		 Map<Gender, List<Person>> groupByGender=people.stream()
		.collect(Collectors.groupingBy(Person::getGender));
		 groupByGender.forEach((gender,person)->{
			 System.out.println(gender);
			 person.forEach(System.out::println);
		 });
	}
	
	private static List<Person> getPeople(){
		return List.of(
				new Person ("James bond",20,Gender.MALE),
				new Person ("Alina Smith",33,Gender.FEMALE),
				new Person ("Helen White",57,Gender.FEMALE),
				new Person ("Alex Boz",14,Gender.MALE),
				new Person ("Jamie Goa",99,Gender.MALE)
				);				
	}

}