package MethodeAgile.Arme.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MethodeAgile.Arme.src.Gun;
import MethodeAgile.Arme.src.Proprietaire;

/**
 * Classe-test ArmeTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class ArmeTest
{
    private Gun Carcano;
    private Proprietaire Lee_Harvey_Oswald;

    @BeforeEach
    public void setUp()
    {
        Carcano = new Gun();
        Lee_Harvey_Oswald = new Proprietaire();
        
        Carcano.setCategorie(2);
        Carcano.getNumeroSerie();
        Carcano.setNumeroSerie(1963);
        Carcano.addProprietaire(Lee_Harvey_Oswald);
        
        Lee_Harvey_Oswald.setHabilitation(true);
        Lee_Harvey_Oswald.setArme(Carcano);
    }

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    
    @Test
    public void testPresence()
    {
        assertTrue(Carcano.isProprietaire(Lee_Harvey_Oswald));
    }
    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }


}




