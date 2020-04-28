package fr.uvsq.exercice3;

/**
 * class Manager.
 * 
 * @author rabahallah yasmine.
 *
 */

public class Manager {
  /**
   * salaireBase d'un manager.
   */

  private double salaireBase = 1500;
  /**
   * nbEmp nombre des employés.
   */

  private int nbEmp;

  public Manager(int nbEmp) {
    this.nbEmp = nbEmp;
  }
  
  /**
   * methode pour calculer le salaire.
   * 
   * @return le salaire d'un manager.
   */
  public  double calcule_salaire() {
    return salaireBase + (100 * nbEmp);
  }

}
