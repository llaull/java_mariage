package mariage;

/**
 *
 * @author moi
 */
public class Mariage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Amoureux a1 = new Amoureux("Farid");
        Amoureux a2 = new Amoureux("tata");
        
        a1.unir(a2);
        a1.status();
        a2.status();
        
        a1.separer(a2);
        a1.status();
        a2.status();
    }
    
}
