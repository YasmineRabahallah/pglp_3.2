package fr.uvsq.exercice3;

/**
 * class Emp.
 * 
 * @author rabahallah yasmine.
 *
 */

public  class Emp  implements salaire {
  /**
   * annee_anc : année d’ancienneté.
   */
  private int annee_anc ;

  /**
   * salaire_base Le salaire d’un employé.
   */

  private double salaire_base =1500 ;

  /**
   * 
   * @param annee_anc  année d’ancienneté.
   */

  public Emp (int annee_anc){
    this.annee_anc=annee_anc ;
  }

  /**
   * methose pour calculer le salaire.
   */

  public  double calcule_salaire(){
    return salaire_base+(20*annee_anc) ;

  }
}
