package org.teamA02.iso;

import java.util.Scanner;

public class CustomerSolver {
	static Scanner sn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String bnktype = comprobador(scandata());
	       System.out.println(bnktype);
	}
	public static String comprobador(Costumer c) {
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

    public static Costumer scandata(){
        String name;
        int age;
        boolean isStudying;
        boolean islivingwithparents;
        boolean isEnrolledinUNI;
        boolean isWorking;
        boolean startedworking;

        System.out.println("Itroduce name of customer :");
        name = sn.nextLine();
        System.out.println("Itroduce age of customer :");
        age = sn.nextInt();

        System.out.println("Itroduce if the customer is Studying (TRUE,FALSE):");
        //try {
            isStudying = sn.nextBoolean();
        //}
        //catch(Exception e) {
            //  Block of code to handle errors
        //}
        System.out.println("Itroduce if the customer is living with his parents (TRUE,FALSE):");
        islivingwithparents = sn.nextBoolean();
        System.out.println("Itroduce if the customer is enrolled in the UNIVERSITY (TRUE,FALSE):");
        isEnrolledinUNI = sn.nextBoolean();
        System.out.println("Itroduce if the customer is Working (TRUE,FALSE):");
        isWorking = sn.nextBoolean();
        System.out.println("Itroduce if the customer has started Working (TRUE,FALSE):");
        startedworking = sn.nextBoolean();

        Costumer c = new Costumer(name, age,isStudying,islivingwithparents,isEnrolledinUNI,isWorking,startedworking);
        return c;

    }

}
