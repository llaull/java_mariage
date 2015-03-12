package mariage;

/**
 *
 * @author moi
 */
public class Amoureux {
    
    static boolean etat;
    private String nom;

    public Amoureux(String nom) {
        this.nom = nom;
        this.etat = false;
        System.out.println("creation de " + nom);
        
    }
    
    void status(){
        System.out.println(this.nom + " -> " + this.etat);
    }
    
    void unir(Amoureux a){
        this.etat = true; 
        a.etat = true;
        System.out.println(this.nom + " et " + a.nom +" s'unissent");
    }
        
    void separer(Amoureux a){
        
        System.out.println(this.nom + " et " + a.nom +" se separent");
        
        this.etat = false; 
        a.etat = false;
        
    }
}
