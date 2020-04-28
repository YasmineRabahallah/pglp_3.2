package fr.uvsq.exercice3;

/**
 * class Vendeur.
 * 
 * @author rabahallah yasmine.
 *
 */

public class Vendeur  implements salaire {
  /**
   * une commission d'un vendeur.
   */

  private double commission ;
  /**
   * annee_anc :année d’ancienneté.
   */

  private int annee_anc ;
  /**
   * salaire_base.
   */

  private double salaire_base =1500 ;
  /**
   * 
   * @param annee_anc année d’ancienneté.
   * @param commission une commission d'un vendeur.
   */

  public Vendeur (int annee_anc , double commission){
    this.annee_anc=annee_anc ;
    this.commission=commission;
  }

  /**
   *  methode pour calcule salaire d'un vendeur.
   */
  public double calcule_salaire() {
    return (salaire_base+(20*annee_anc))+commission;
  }


}
