
public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Dani", 23, "Farmer", 16081996 );

		Person p2 = new Person("Greg", 45, "Builder", 16021992 );

		PersonManager pm1 = new PersonManager();

		pm1.getPeopleList().add(p1);

		pm1.getPeopleList().add(p2);

		for (Person p : pm1.getPeopleList()) {
			System.out.println(p);
		}
		
		System.out.println(pm1.namesearch("Greg"));

	}

}
