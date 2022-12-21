package org.teamA02.iso;

import java.util.Objects;

public class Costumer {

    String name;
    int age;
    boolean isStudying;
    boolean islivingwithparents;
    boolean isEnrolledinUNI;
    boolean isWorking;
    boolean startedworking;
	/**
	 * @param name
	 * @param age
	 * @param isStudying
	 * @param islivingwithparents
	 * @param isEnrolledinUNI
	 * @param isWorking
	 * @param startedworking
	 */
	public Costumer(String name, int age, boolean isStudying, boolean islivingwithparents, boolean isEnrolledinUNI,
			boolean isWorking, boolean startedworking) {
		super();
		this.name = name;
		this.age = age;
		this.isStudying = isStudying;
		this.islivingwithparents = islivingwithparents;
		this.isEnrolledinUNI = isEnrolledinUNI;
		this.isWorking = isWorking;
		this.startedworking = startedworking;
	}
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
	 * @return the isStudying
	 */
	public boolean isStudying() {
		return isStudying;
	}
	/**
	 * @param isStudying the isStudying to set
	 */
	public void setStudying(boolean isStudying) {
		this.isStudying = isStudying;
	}
	/**
	 * @return the islivingwithparents
	 */
	public boolean isIslivingwithparents() {
		return islivingwithparents;
	}
	/**
	 * @param islivingwithparents the islivingwithparents to set
	 */
	public void setIslivingwithparents(boolean islivingwithparents) {
		this.islivingwithparents = islivingwithparents;
	}
	/**
	 * @return the isEnrolledinUNI
	 */
	public boolean isEnrolledinUNI() {
		return isEnrolledinUNI;
	}
	/**
	 * @param isEnrolledinUNI the isEnrolledinUNI to set
	 */
	public void setEnrolledinUNI(boolean isEnrolledinUNI) {
		this.isEnrolledinUNI = isEnrolledinUNI;
	}
	/**
	 * @return the isWorking
	 */
	public boolean isWorking() {
		return isWorking;
	}
	/**
	 * @param isWorking the isWorking to set
	 */
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	/**
	 * @return the startedworking
	 */
	public boolean isStartedworking() {
		return startedworking;
	}
	/**
	 * @param startedworking the startedworking to set
	 */
	public void setStartedworking(boolean startedworking) {
		this.startedworking = startedworking;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, isEnrolledinUNI, isStudying, isWorking, islivingwithparents, name, startedworking);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Costumer other = (Costumer) obj;
		return age == other.age && isEnrolledinUNI == other.isEnrolledinUNI && isStudying == other.isStudying
				&& isWorking == other.isWorking && islivingwithparents == other.islivingwithparents
				&& Objects.equals(name, other.name) && startedworking == other.startedworking;
	}
	@Override
	public String toString() {
		return "Costumer [name=" + name + ", age=" + age + ", isStudying=" + isStudying + ", islivingwithparents="
				+ islivingwithparents + ", isEnrolledinUNI=" + isEnrolledinUNI + ", isWorking=" + isWorking
				+ ", startedworking=" + startedworking + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", isStudying()=" + isStudying() + ", isIslivingwithparents()=" + isIslivingwithparents()
				+ ", isEnrolledinUNI()=" + isEnrolledinUNI() + ", isWorking()=" + isWorking() + ", isStartedworking()="
				+ isStartedworking() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}