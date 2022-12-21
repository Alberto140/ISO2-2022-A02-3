package org.teamA02.iso;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest { 
	//String name, int age, boolean isStudying, boolean islivingwithparents, boolean isEnrolledinUNI,
	//boolean isWorking /boolean startedWorking
	@Test
	public void comprobador() {
		Costumer c = new Costumer(" ", 25, true, false, false, true,true);
		Costumer c1 = new Costumer(" ", 18, true, false, true, false,false);
		Costumer c2 = new Costumer(" ", 25, false, false, true, true,true);
		Costumer c3 = new Costumer(" ", 25, false, false, false, false,false);
		Costumer c4 = new Costumer(" ", 25, false, false, false, true,true);
		Costumer c5 = new Costumer(" ", 18, true, false, false, false,false);
		Costumer c6 = new Costumer(" ", 18, true, false, true, true,true);
		Costumer c7 = new Costumer(" ", 25, false, false, false, true,true);
		Costumer c8 = new Costumer(" ", 18, false, false, true, false,false);
		Costumer c9 = new Costumer(" ", 25, true, false, false, false,false);
		Costumer c10 = new Costumer(" ", 18, false, false, true, true,true);
		Costumer c11 = new Costumer(" ", 18, true, true, false, false,false);
		Costumer c12 = new Costumer(" ", 25, true, true, true, true,true);
		Costumer c13 = new Costumer(" ", 18, false, true, true, false,false);
		
		assertEquals( CustomerSolver.comprobador(c),"Jump out of the Nest");
		assertEquals( CustomerSolver.comprobador(c1),"Come on, you can");
		assertEquals( CustomerSolver.comprobador(c2),"Jump out of the Nest");
		assertEquals( CustomerSolver.comprobador(c3),"NON-existing valid account");
		assertEquals( CustomerSolver.comprobador(c4),"Jump out of the Nest");
		assertEquals( CustomerSolver.comprobador(c5),"NON-existing valid account");
		assertEquals( CustomerSolver.comprobador(c6),"Come on, you can");
		assertEquals( CustomerSolver.comprobador(c7),"Jump out of the Nest");
		assertEquals( CustomerSolver.comprobador(c8),"Come on, you can");
		assertEquals( CustomerSolver.comprobador(c9),"NON-existing valid account");
		assertEquals( CustomerSolver.comprobador(c10),"Come on, you can");
		assertEquals( CustomerSolver.comprobador(c11),"NON-existing valid account");
		assertEquals( CustomerSolver.comprobador(c12),"Save Now While You Can");
		assertEquals( CustomerSolver.comprobador(c13),"NON-existing valid account");
	}

}
