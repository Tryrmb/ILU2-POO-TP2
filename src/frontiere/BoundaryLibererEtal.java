package frontiere;

import java.util.Scanner;
import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
    private ControlLibererEtal controlLibererEtal;
    private Scanner scan = new Scanner(System.in);

    public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
        this.controlLibererEtal = controlLibererEtal;
    }

    public void libererEtal(String nomVendeur) {
        // Vérifier si le vendeur possède un étal
        String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);

        if (donneesEtal[0].equals("false")) {
            System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !");
            return;
        }

        // Afficher les informations de libération
        System.out.println("Vous avez vendu " + donneesEtal[4] + " sur " + donneesEtal[3] + " " + donneesEtal[2] + ".");
        System.out.println("En revoir " + donneesEtal[1] + ", passez une bonne journée.");
    }
}
