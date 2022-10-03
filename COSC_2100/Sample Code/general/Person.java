package sample_code;

/**
 * COSC 2100 - Fall 2022
 * A simple class to create Person objects
 * @author Dr. Jain
 */
public class Person {
	private String name;
	private int age;
	//Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return name,age Name and Age of Person objects
	 */
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
	
	
	
	
