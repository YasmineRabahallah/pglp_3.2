package fr.uvsq.exercice3;

public class vendeur  implements salaire {
	private double commission ;
	private int annee_anc ;
	private double salaire_base =1500 ;
    public vendeur (int annee_anc , double commission){
    	this.annee_anc=annee_anc ;
    	this.commission=commission;
    }
	public double calcule_salaire() {
		return (salaire_base+(20*annee_anc))+commission;
	}
	

}
