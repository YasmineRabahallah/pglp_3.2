package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class test_emp {
	@Test
	public void test1(){
		emp e1 = new emp(5);
		assertEquals(e1.calcule_salaire(), 1600, 0) ;
	}
	public void test2(){
		emp e2 = new emp(8);
		assertEquals(e2.calcule_salaire(), 1660, 0) ;
	}
	

}
