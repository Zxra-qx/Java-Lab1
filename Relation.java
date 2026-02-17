package lab1;

public class Relation {
	private String relationshipType;

	//Constructor
	public Relation(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	
	//Displays relationship between the two people
	public void showRelationship(Person p1, Person p2) {
		System.out.println("Relatinship between " + p1.getFirstName() + " and " + p2.getFirstName() +  " is: " + relationshipType);
	}
}
