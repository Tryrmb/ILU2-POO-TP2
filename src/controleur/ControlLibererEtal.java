package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
    private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

    public ControlLibererEtal(ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
        this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
    }

    /**
     * Vérifie si un vendeur a un étal occupé
     * @param nomVendeur Nom du vendeur
     * @return true si le vendeur a un étal, false sinon
     */
    public boolean isVendeurOccupe(String nomVendeur) {
        return (controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur)) !=null;
    }

    /**
     * Libère l'étal du vendeur et retourne ses informations sous forme d'un tableau de chaînes.
     *
     * @param nomVendeur Nom du vendeur qui libère son étal.
     * @return donneesEtal un tableau contenant :
     *         [0] : "true" si l'étal était occupé, "false" sinon
     *         [1] : Nom du vendeur (si étal occupé)
     *         [2] : Produit vendu (si étal occupé)
     *         [3] : Quantité initiale mise en vente (si étal occupé)
     *         [4] : Quantité vendue (si étal occupé)
     */
    public String[] libererEtal(String nomVendeur) {
        // Récupérer l’étal du vendeur
        Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
        String[] donneesEtal = etal.etatEtal();
        etal.libererEtal();
        return donneesEtal;
    }
}

