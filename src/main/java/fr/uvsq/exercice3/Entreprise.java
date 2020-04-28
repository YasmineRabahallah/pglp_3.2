package fr.uvsq.exercice3;

import java.util.ArrayList;
import java.util.List;

/**
 * class Entreprise.
 * 
 * @author rabahallah yasmine.
 *
 */

public class Entreprise {
  /**
   * liste des salaires.
   */

  ArrayList<salaire>  salaire  = new ArrayList<salaire>();

  public Entreprise(){
  }
  /**
   * methode pour ajouter un salaire.
   * 
   * @param s salaire
   */
  public void ajoute_s(salaire s) {
    salaire.add(s)	;
  }

  /**
   * methode pour calculer le salaire total.
   * 
   * @return salaires total.
   */
  public double somme_total(){
    double sal=0 ;
    for ( salaire b :salaire ){
      sal += b.calcule_salaire();
    }
    return sal;
  }
}
