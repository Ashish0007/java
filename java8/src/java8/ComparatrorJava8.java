package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatrorJava8 {

	public static void printSorted(List<Person> people ,Comparator<Person> comparator){
		
		people.stream()
				.sorted(comparator)
				.forEach(System.out :: println);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = Arrays.asList(
				new Person("kris",22),
				new Person("shakal",17),
				new Person("Drubv",19),
				new Person("Doga",28),
				new Person("Doga",35)
				);
		
		printSorted(people, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
	}

}

class Person{
	
	private String name;
	
	private int age ;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +"---" + this.age;
	}
}