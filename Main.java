package lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Create person objects
		Person ian = new Person(1, "Ian", "Brooks", "Red", 30, true);
		Person gina = new Person(2, "Gina", "James", "Green", 19, false);
		Person mike = new Person(3, "Mike", "Briscoe", "Blue", 45, true);
		Person mary = new Person(4, "Mary", "Beals", "Yellow", 28, true);
		
		//Display Gina's Info
		gina.displayPersonInfo();
		
		//Display Mike's info
		System.out.println(mike);
		
		//Change Ian's favorite colour and display 
		ian.changeFavoriteColour();
		ian.displayPersonInfo();
		
		//Display Mary's age in 10 years
		System.out.println("Mary Beals's Age in 10 years is: "  + mary.getAgeInTenYears());
		
		//Creates Relationships
		Relation sisters = new Relation("Sisterhood");
		Relation brothers = new Relation("Brotherhood");
		
		sisters.showRelationship(gina, mary);
		brothers.showRelationship(ian, mike);
		
		//Adding people to the list
		List<Person> people = new ArrayList<>();
		people.add(ian);
		people.add(gina);
		people.add(mike);
		people.add(mary);
		
		//Calculates the average age
		double totalAge = 0;
		for (Person p : people) {
			totalAge += p.getAge();
		}
		System.out.println("Average age is: " + (totalAge / people.size()));
		
		//Finding the Youngest and the oldest 
		Person youngest = people.get(0);
		Person oldest = people.get(0);
		
		for (Person p : people) {
			if (p.getAge() < youngest.getAge()) {
				youngest = p;
			}
			if (p.getAge() > oldest.getAge()) {
				oldest = p;
			}
		}
		System.out.println("The youngest person is: " + youngest.getFirstName());
		System.out.println("The oldest person is: " + oldest.getFirstName());
		
		//Names that start with the letter M
		for (Person p : people) {
			if (p.getFirstName().startsWith("M")) {
				System.out.println(p);
			}
		}
		//The person who's favorite colour is blue
		for (Person p :people) {
			if (p.getFavoriteColour().equalsIgnoreCase("Blue")) {
				System.out.println(p);
			}
		}
	}
}
