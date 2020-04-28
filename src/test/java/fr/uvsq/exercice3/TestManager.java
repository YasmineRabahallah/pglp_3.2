package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestManager {
	@Test
	public void test1(){
	Manager  m1 = new Manager(5);
		assertEquals(m1.calcule_salaire(), 2000, 0) ;
	}
	public void test2(){
		Manager m2 = new Manager(8);
		assertEquals(m2.calcule_salaire(), 2300, 0) ;
	}
	

}
