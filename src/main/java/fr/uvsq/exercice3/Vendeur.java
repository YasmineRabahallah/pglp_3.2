package fr.uvsq.exercice3;

/**
 * class Vendeur.
 * 
 * @author rabahallah yasmine.
 *
 */

public class Vendeur  implements Salaire {
  /**
   * une commission d'un vendeur.
   */

  private double commission;
  /**
   * anneAnc :année d’ancienneté.
   */

  private int anneeAnc;
  /**
   * salaireBase.
   */

  private double salaireBase = 1500;
  /**
   * constructeur Vendeur.
   * 
   * @param anneeAnc année d’ancienneté.
   * @param commission une commission d'un vendeur.
   */

  public Vendeur(int anneeAnc,double commission) {
    this.anneeAnc = anneeAnc;
    this.commission = commission;
  }

  /**
   *  methode pour calcule salaire d'un vendeur.
   */
  public double calcule_salaire() {
    return (salaireBase + (20 * anneeAnc)) + commission;
  }


}
