import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> peopleList = new ArrayList<>(); /* Creating an array list named peopleList */

	public ArrayList<Person> getPeopleList() {
		return peopleList;
	}
	
	public String namesearch (String search) {
		
		for (Person p : peopleList) {
			if (p.getName().equals(search)) {
				return p.getName();
			}
		}
		return "No one found";
	}
}
