package MethodeAgile.Arme.src;
import java.util.ArrayList;

/**
 * Décrivez votre classe Arme ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Gun
{

    private int numeroSerie;
    private int categorie;
    private ArrayList<Proprietaire> proprietaires; 
    

    /**
     * Constructeur d'objets de classe Arme
     */
    public Gun()
    {
        // initialisation des variables d'instance
        this.numeroSerie = 0;
        this.categorie = 0;
        this.proprietaires = new ArrayList<Proprietaire>();
    }
    /**
     * Permets d'assigner un propri�taire � la liste des propri�taires de ce mod�le d'arme
     * @param pr : nouveau propir�taire de l'arme
     */
    public void addProprietaire(Proprietaire pr)
    {
    	this.proprietaires.add(pr);
    }
    
    
    /**
     * Permets de retirer un propri�taire de la liste des propri�taires de ce mod�le d'arme
     * @param pr : nouveau propir�taire de l'arme
     */
    public void removeProprietaire(Proprietaire pr)
    {
    	this.proprietaires.remove(pr);
    }

     /**
     * 
     * Retourne le numéro de série de l'arme
     * @return    le numéro de série : numeroSerie
     */
    public int getNumeroSerie()
    {
        // Insérez votre code ici
        return this.numeroSerie;
    }
    
       /**
     * 
     * Ajoute un numéro de série de l'arme
     * @param   le numéro de série : numeroSerie
     */
    public void setNumeroSerie(int numeroSerie)
    {
        // Insérez votre code ici
        this.numeroSerie = numeroSerie;
    }
    
      /**
     * 
     * Retourne la catégorie à l'arme
     * @return    le numéro de la catégorie
     */
    public int getCategorie()
    {
        // Insérez votre code ici
        return this.categorie;
    }
    
       /**
     * 
     * Ajoute une catégorie à l'arme
     * @param   le numéro de la catégorie 
     */
    public void setCategorie(int categorie)
    {
        // Insérez votre code ici
        this.categorie = categorie;
    }
    
   
    public boolean equals(Object anObject) {
        if (anObject instanceof Gun) {
            Gun g = (Gun)anObject;
            return g.getCategorie() == this.getCategorie()
                && g.getNumeroSerie() == this.getNumeroSerie() ;
        }
        return false;
    }
    
    
    public boolean isProprietaire(Proprietaire p) {
    	if (proprietaires.contains(p)) {
			return true;
		}
    	return false;
    }
    
    public static void main(String [] args) {
		Gun gun1 = new Gun();
		Gun gun2 = new Gun();
		
		System.out.println(gun1.equals(gun2));
    }
}
