package fr.uvsq.exercice3;

public class manager {
	private double salaire_base =1500 ;
	private int nb_emp ;
	public manager ( int nb_emp){
		this.nb_emp=nb_emp;
	}
	public  double calcule_salaire(){
		
		return salaire_base+(100*nb_emp) ;
		
	}

}
