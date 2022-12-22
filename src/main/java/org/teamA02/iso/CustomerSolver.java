package org.teamA02.iso;


public class CustomerSolver {
	public static void main(String[] args) {
        data();
	}
	public static void data() {
		int age = 18;
		boolean isStudying = true;
        boolean islivingwithparents = true;
        boolean isEnrolledinUNI = true;
        boolean isWorking = true;
        boolean startedworking = true;
			Costumer c = new Costumer(age, isStudying, islivingwithparents, isEnrolledinUNI, isWorking, startedworking);
		    String bnktype = comprobador(c);
		    System.out.println(bnktype);

	}
	public static String comprobador(Costumer c) {
        if (c.getAge() < 0  || c.getAge() == 0 ) {
            return "You cannot have a negative age";
        }
        if (c.getAge() >= 18 && c.getAge() < 25) {
        	if(c.getAge() < 25 && c.isEnrolledinUNI() && !c.isLivingwithparents()){
                return "Come on, you can";
                }
            if(c.getAge() >= 18 && c.isStartedworking() && !c.isLivingwithparents() && !c.isEnrolledinUNI()){
                return "Jump out of the Nest";
            }
        }
		if(c.getAge() < 18 && c.isStudying() && c.isLivingwithparents()){
        return "Comfort";
        }
        if(c.getAge() < 25 && c.isEnrolledinUNI() && !c.isLivingwithparents()){
        return "Come on, you can";
        }
        if(c.getAge() >= 18 && c.getAge() <= 25 && c.isStartedworking() && c.isLivingwithparents()){
            return "Save Now While You Can";
        }
        if(c.getAge() >= 18 && c.getAge() <= 25 && c.isStartedworking() && !c.isLivingwithparents()){
            return "Jump out of the Nest";
        }
        if(c.getAge() > 25 && c.isWorking() && c.isLivingwithparents()){
            return "Become independent, it's about time";
        }
        if(c.getAge() > 25 && c.isWorking() && !c.isLivingwithparents()){
            return "Welcome to Adult Life";
        }
        return "NON-existing valid account";
    }


}
