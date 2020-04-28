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

  ArrayList<Salaire>  salaire  = new ArrayList<Salaire>();

  public Entreprise(){
  }
  /**
   * methode pour ajouter un salaire.
   * 
   * @param s salaire
   */

  public void ajoute_s(Salaire s) {
    salaire.add(s);
  }

  /**
   * methode pour calculer le salaire total.
   * 
   * @return salaires total.
   */
  public double somme_total() {
    double sal = 0;
    for (Salaire b :salaire) {
      sal += b.calcule_salaire();
    }
    return sal;
  }
}
