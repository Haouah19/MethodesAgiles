package MethodeAgile.Arme.src;

/**
 * Décrivez votre classe Proprietaire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Proprietaire
{
    private static final int categorie_autorisee = 2;
	// variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Gun gun;
    private boolean habilitation;

    /**
     * Constructeur d'objets de classe Proprietaire
     */
    public Proprietaire()
    {
        // initialisation des variables d'instance
        
    }
    
    public void setArme (Gun arme){
        this.gun = arme;
        arme.addProprietaire(this);
    }
    
    public void setHabilitation(boolean habilitation){
        this.habilitation = habilitation;
    }
    
    public boolean authorise(){
        
		if ((this.habilitation == true) && (this.gun.getCategorie() == categorie_autorisee))
            return true; 
        return false;
   }
    
    public boolean getHabilitation ()
    {
    	return this.habilitation;
    }

   
}
