package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestVendeur {
	@Test
	public void test1(){
		Vendeur v1 = new Vendeur(5,1500);
		assertEquals(v1.calcule_salaire(), 3100, 0) ;
	}
	@Test
	public void test2(){
		Vendeur v2 = new Vendeur(10,2000);
		assertEquals(v2.calcule_salaire(), 3700, 0) ;
	}

}
