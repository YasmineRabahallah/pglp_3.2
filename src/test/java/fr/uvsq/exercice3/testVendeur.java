package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testVendeur {
	@Test
	public void test1(){
		vendeur v1 = new vendeur(5,1500);
		assertEquals(v1.calcule_salaire(), 3100, 0) ;
	}
	@Test
	public void test2(){
		vendeur v2 = new vendeur(10,2000);
		assertEquals(v2.calcule_salaire(), 3700, 0) ;
	}

}
