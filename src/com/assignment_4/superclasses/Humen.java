package com.assignment_4.superclasses;
/**
 * 
 * @author Mattias Svensson
 *
 */
public class Humen {
	
	private String name = "";
	private int age = 0;
	
	/**
	 * Constuctor to set name and age 
	 * @param name
	 * @param age
	 */
	public Humen(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * Get name method
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name method
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get age method
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Set age method
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
