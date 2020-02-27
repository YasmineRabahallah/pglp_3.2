package fr.uvsq.exercice3;

public  class emp  implements salaire {
private int annee_anc ;
private double salaire_base =1500 ;
public emp (int annee_anc){
	this.annee_anc=annee_anc ;
}
public  double calcule_salaire(){
	
	return salaire_base+(20*annee_anc) ;
	
}
}
