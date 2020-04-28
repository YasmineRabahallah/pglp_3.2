package fr.uvsq.exercice3;

/**
 * class Manager.
 * 
 * @author rabahallah yasmine.
 *
 */

public class Manager {
  /**
   * salaire_base d'un manager.
   */
  private double salaire_base =1500 ;
  /**
   * nb_emp nombre des employés.
   */

  private int nb_emp ;
  public Manager ( int nb_emp){
    this.nb_emp=nb_emp;
  }
  
  /**
   * 
   * @return le salaire d'un manager.
   */
  public  double calcule_salaire(){
    return salaire_base+(100*nb_emp) ;
  }

}
