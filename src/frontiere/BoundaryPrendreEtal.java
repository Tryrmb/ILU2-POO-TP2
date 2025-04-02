package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println(" Je suis désolé "+nomVendeur+" mais il faut être un habitant du village pour commercer ici.");
			return ;
		}
		
		boolean etalDisponible = controlPrendreEtal.resteEtals();
		if (!etalDisponible) {
			System.out.println("Désolé " + nomVendeur + ", il n'y a plus d'étals disponibles.");
            return;
		}
		
	}
	
	private void installerVendeur(String nomVendeur) {
		System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver un étal.");
        System.out.println("C'est parfait, il me reste un étal pour vous !");
        
        System.out.println("Quel produit souhaitez vous vendre ? ");
        String produit = scan.nextLine(); 
        
        System.out.println("Combien souhaitez vous en vendre ?");
        int quantite = scan.nextInt();
        scan.nextLine();
        
        int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, quantite);
        
        if (numeroEtal != -1) {
            System.out.println("Le vendeur " + nomVendeur + " s'est installé à l'étal n°" + numeroEtal);
        } else {
            System.out.println("Désolé, une erreur s'est produite lors de l'installation.");
	}
	}
}
