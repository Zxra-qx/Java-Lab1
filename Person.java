package lab1;

public class Person {
	//Attributes
	private int personId;
	private String firstName;
	private String lastName;
	private String favoriteColour;
	private int age;
	private boolean isWorking;
	
	//Constructor
	public Person(int personId, String firstName, String lastName, String favoriteColour, int age, boolean isWorking) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.favoriteColour = favoriteColour;
		this.age = age;
		this.isWorking = isWorking;	
	}
	//Displays the persons information as a sentence
	public void displayPersonInfo() {
		System.out.println(personId + ": " + firstName + " " + lastName + "'s favorite colour is " + favoriteColour);
	}
	
	//Changes favorite colour to white
	public void changeFavoriteColour() {
		this.favoriteColour = "White";
	}
	//Returns age after 10 years
	public int getAgeInTenYears() {
		return age + 10;
	}
	//Main and relation
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getFavoriteColour() {
		return favoriteColour;
	}
	//toString method
	@Override
	public String toString() {
		return "PersonId: " + personId + "\n" + "FirstName: " + firstName + "\n" + "LastName: " + lastName + "\n" + "FavoriteColour: " + favoriteColour +"\n" + "Age: " + age + "\n" + "IsWorking: " + isWorking;
	}
}
