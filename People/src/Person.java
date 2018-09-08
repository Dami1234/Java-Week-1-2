
public class Person {

	private String name;
	private int age;
	private String jobTitle;
	private int DOB;

	public Person(String name, int age, String jobTitle, int DOB) /* Constructor */ {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.DOB = DOB;

	}

	public String getName() { /* Getters */
		return name;

	}

	public int getage() {
		return age;

	}

	public String getjobTitle() {
		return jobTitle;
	}

	public int getDOB() {
		return DOB;
	}

	public void setName(String name) { /* Setters */
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setDOB(int DOB) {
		this.DOB = DOB;
	}
	
	@Override
	public String toString () {
		return "name:" + "age" + "jobTitle" + "DOB";
	}
}
