package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test_manager {
	@Test
	public void test1(){
	manager  m1 = new manager(5);
		assertEquals(m1.calcule_salaire(), 2000, 0) ;
	}
	public void test2(){
		manager m2 = new manager(8);
		assertEquals(m2.calcule_salaire(), 2300, 0) ;
	}
	

}
