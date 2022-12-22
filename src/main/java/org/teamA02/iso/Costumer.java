package org.teamA02.iso;

import java.util.Objects;

public class Costumer {

    int age;
    boolean isStudying;
    boolean islivingwithparents;
    boolean isEnrolledinUNI;
    boolean isWorking;
    boolean startedworking;
	/**
	 * @param age
	 * @param isStudying
	 * @param islivingwithparents
	 * @param isEnrolledinUNI
	 * @param isWorking
	 * @param startedworking
	 */
	public Costumer(int age, boolean isStudying, boolean islivingwithparents, boolean isEnrolledinUNI,
			boolean isWorking, boolean startedworking) {
		super();
		this.age = age;
		this.isStudying = isStudying;
		this.islivingwithparents = islivingwithparents;
		this.isEnrolledinUNI = isEnrolledinUNI;
		this.isWorking = isWorking;
		this.startedworking = startedworking;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the isStudying
	 */
	public boolean isStudying() {
		return isStudying;
	}
	/**
	 * @return the isLivingwithparents
	 */
	public boolean isLivingwithparents() {
		return islivingwithparents;
	}
	/**
	 * @return the isEnrolledinUNI
	 */
	public boolean isEnrolledinUNI() {
		return isEnrolledinUNI;
	}
	/**
	 * @return the isWorking
	 */
	public boolean isWorking() {
		return isWorking;
	}
	/**
	 * @return the isStartedworking
	 */
	public boolean isStartedworking() {
		return startedworking;
	}


}