package fr.uvsq.exercice3;

/**
 * class Emp.
 * 
 * @author rabahallah yasmine.
 *
 */

public  class Emp  implements Salaire {
  /**
   * anneeAnc : année d’ancienneté.
   */
  private int anneeAnc;

  /**
   * salairebase Le salaire d’un employé.
   */

  private double salaireBase = 1500;

  /**
   * constructeur Emp.
   * 
   * @param anneeAnc  année d’ancienneté.
   */

  public Emp(int anneeAnc) {
    this.anneeAnc = anneeAnc;
  }

  /**
   * methose pour calculer le salaire.
   */

  public  double calcule_salaire() {
    return salaireBase + (20 * anneeAnc);

  }
}
