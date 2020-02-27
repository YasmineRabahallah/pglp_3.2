package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test_entreprise {
	@Test
	public void test1(){
		Entreprise ent = new Entreprise() ;
		vendeur v1 = new vendeur(5,1500);
		vendeur v2 = new vendeur(10,2000);
		emp e1 = new emp(5);
		emp e2 = new emp(8);
		ent.ajoute_s(e1);
		ent.ajoute_s(e2);
		ent.ajoute_s(v1);
		ent.ajoute_s(v2);
		assertEquals(ent.somme_total(), 10060, 0) ;
		
		
	}
}
