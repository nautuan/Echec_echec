package modele.lancement_jeu;

import modele.lancement_jeu.Plateau;

public class Joueur {

    private String nom_joueur;
    private String couleur_joueur;

    private Plateau plateau;

    public Joueur(String nom_joueur, String couleur_joueur, Plateau plateau) {
        this.nom_joueur = nom_joueur;
        this.couleur_joueur = couleur_joueur;
        this.plateau=plateau;
    }

    public Joueur(String nom_joueur) {
        this.nom_joueur = nom_joueur;
        this.couleur_joueur= "pas_encore_attribuee";
    }

    public void deplacerPiece(int x, int y) {

    }

}

