package fr.uvsq.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
ArrayList<salaire>  salaire  = new ArrayList<salaire>();

public Entreprise(){
	
}
public void ajoute_s(salaire s)
{
   salaire.add(s)	;
}
public double somme_total(){
	double sal=0 ;
for ( salaire b :salaire ){
     sal += b.calcule_salaire();
     }
return sal;
}
}
