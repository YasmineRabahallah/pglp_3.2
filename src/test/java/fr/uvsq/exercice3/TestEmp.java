package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TestEmp {
	@Test
	public void test1(){
		Emp e1 = new Emp(5);
		assertEquals(e1.calcule_salaire(), 1600, 0) ;
	}
	public void test2(){
		Emp e2 = new Emp(8);
		assertEquals(e2.calcule_salaire(), 1660, 0) ;
	}
	

}
