package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEntreprise {
	@Test
	public void test1(){
		Entreprise ent = new Entreprise() ;
		Vendeur v1 = new Vendeur(5,1500);
		Vendeur v2 = new Vendeur(10,2000);
		Emp e1 = new Emp(5);
		Emp e2 = new Emp(8);
		ent.ajoute_s(e1);
		ent.ajoute_s(e2);
		ent.ajoute_s(v1);
		ent.ajoute_s(v2);
		assertEquals(ent.somme_total(), 10060, 0) ;
		
		
	}
}
