package org.teamA02.iso;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest { 
	//String name, int age, boolean isStudying, boolean islivingwithparents, boolean isEnrolledinUNI,
	//boolean isWorking /boolean startedWorking

	
	@Test 
	public void jump_out_of_the_Nest_case() {
		Costumer c = new Costumer(" ", 19, true, false, false, false, true);
		Costumer c1 = new Costumer(" ", 25, false, false, false, true, true);
		assertEquals( CustomerSolver.comprobador(c),"Jump out of the Nest");
		assertEquals( CustomerSolver.comprobador(c1),"Jump out of the Nest");
	}
	@Test 
	public void comfort_case() {
		Costumer c = new Costumer(" ", 16, true, true, false, false, true);
		Costumer c1 = new Costumer(" ", 16, true, true, false, true, false);
		assertEquals( CustomerSolver.comprobador(c),"Comfort");
		assertEquals( CustomerSolver.comprobador(c1),"Comfort");
	}
	@Test 
	public void come_on_you_can_case() {
		Costumer c = new Costumer(" ", 18, true, false, true, true,true);
		Costumer c1 = new Costumer(" ", 16, false, false, true, false,false);
		assertEquals( CustomerSolver.comprobador(c),"Come on, you can");
		assertEquals( CustomerSolver.comprobador(c1),"Come on, you can");
	}
	@Test 
	public void save_now_while_you_can_case() {
		Costumer c = new Costumer(" ", 25, false, true, true, true,true);
		Costumer c1 = new Costumer(" ", 25, true, true, false, false,true);
		Costumer c2 = new Costumer(" ", 18, false, true, true, true,true);
		assertEquals( CustomerSolver.comprobador(c),"Save Now While You Can");
		assertEquals( CustomerSolver.comprobador(c1),"Save Now While You Can");
		assertEquals( CustomerSolver.comprobador(c2),"Save Now While You Can");
	}
	@Test 
	public void become_independent_case() {
		Costumer c = new Costumer(" ", 26, true, true, false, true,true);
		Costumer c1 = new Costumer(" ", 26, true, true, false, true,false);
		Costumer c2 = new Costumer(" ", 26, false, true, false, true,true);
		assertEquals( CustomerSolver.comprobador(c),"Become independent, it's about time");
		assertEquals( CustomerSolver.comprobador(c1),"Become independent, it's about time");
		assertEquals( CustomerSolver.comprobador(c2),"Become independent, it's about time");
	}
	@Test 
	public void welcome_to_adult_life_case() {
		Costumer c = new Costumer(" ", 26, false, false, false, true,true);
		Costumer c1 = new Costumer(" ", 26, true, false, false, true,false);
		Costumer c2 = new Costumer(" ", 26, true, false, false, true,true);
		assertEquals( CustomerSolver.comprobador(c),"Welcome to Adult Life");
		assertEquals( CustomerSolver.comprobador(c1),"Welcome to Adult Life");
		assertEquals( CustomerSolver.comprobador(c2),"Welcome to Adult Life");
	}
	@Test 
	public void non_existing_valid_account_case() {
		Costumer c = new Costumer(" ", 15, false, false, false, true,true);
		Costumer c1 = new Costumer(" ", 15, false, false, false, true,true);
		Costumer c2 = new Costumer(" ", 15, false, false, false, true,true);
		assertEquals( CustomerSolver.comprobador(c),"NON-existing valid account");
		assertEquals( CustomerSolver.comprobador(c1),"NON-existing valid account");
		assertEquals( CustomerSolver.comprobador(c2),"NON-existing valid account");
	}

}
