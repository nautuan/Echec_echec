package modele.lancement_jeu;

import modele.lancement_jeu.Plateau;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String nom_joueur;
    private String couleur_joueur;
    private Plateau plateau;

    public List<Piece> liste_pieces = new ArrayList<>(); // NON ajouter dans classe joueur

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

/*Initialisation du Plateau avec pièces*/
/*
    public void initialisation_Plateau() {

        Pion p1_b =  new Pion(1,0,"Pion-B");
        liste_pieces.add(p1_b);
        Pion p2_b =  new Pion(1,1,"Pion-B");
        liste_pieces.add(p2_b);
        Pion p3_b =  new Pion(1,2,"Pion-B");
        liste_pieces.add(p3_b);
        Pion p4_b =  new Pion(1,3,"Pion-B");
        liste_pieces.add(p4_b);
        Pion p5_b =  new Pion(1,4,"Pion-B");
        liste_pieces.add(p5_b);
        Pion p6_b =  new Pion(1,5,"Pion-B");
        liste_pieces.add(p6_b);
        Pion p7_b =  new Pion(1,6,"Pion-B");
        liste_pieces.add(p7_b);
        Pion p8_b =  new Pion(1,7,"Pion-B");
        liste_pieces.add(p8_b);

        Pion p1_n =  new Pion(6,0,"Pion-N");
        liste_pieces.add(p1_n);
        Pion p2_n =  new Pion(6,1,"Pion-N");
        liste_pieces.add(p2_n);
        Pion p3_n =  new Pion(6,2,"Pion-N");
        liste_pieces.add(p3_n);
        Pion p4_n =  new Pion(6,3,"Pion-N");
        liste_pieces.add(p4_n);
        Pion p5_n =  new Pion(6,4,"Pion-N");
        liste_pieces.add(p5_n);
        Pion p6_n =  new Pion(6,5,"Pion-N");
        liste_pieces.add(p6_n);
        Pion p7_n =  new Pion(6,6,"Pion-N");
        liste_pieces.add(p7_n);
        Pion p8_n =  new Pion(6,7,"Pion-N");
        liste_pieces.add(p8_n);

        Tour t1_b = new Tour(0,0,"Tour-B");
        liste_pieces.add(t1_b);
        Tour t2_b = new Tour(0,7,"Tour-B");
        liste_pieces.add(t2_b);

        Tour t1_n = new Tour(7,0,"Tour-N");
        liste_pieces.add(t1_n);
        Tour t2_n = new Tour(7,7,"Tour-N");
        liste_pieces.add(t2_n);

        Cavalier c1_b = new Cavalier(0,1,"Cava-B");
        liste_pieces.add(c1_b);
        Cavalier c2_b = new Cavalier(0,6,"Cava-B");
        liste_pieces.add(c2_b);
        Cavalier c1_n = new Cavalier(7,1,"Cava-N");
        liste_pieces.add(c1_n);
        Cavalier c2_n = new Cavalier(7,6,"Cava-N");
        liste_pieces.add(c2_n);
        Fou f1_b = new Fou(0,2,"Fouu-B");
        liste_pieces.add(f1_b);
        Fou f2_b = new Fou(0,5,"Fouu-B");
        liste_pieces.add(f2_b);
        Fou f1_n = new Fou(7,2,"Fouu-B");
        liste_pieces.add(f1_n);
        Fou f2_n = new Fou(7,5,"Fouu-B");
        liste_pieces.add(f2_n);
        Roi r_b = new Roi(0,3,"Rooi_B");
        liste_pieces.add(r_b);
        Roi r_n = new Roi(7,4,"Rooi_N");
        liste_pieces.add(r_n);
        Reine R_b = new Reine(0,4,"Rein_B");
        liste_pieces.add(R_b);
        Reine R_n = new Reine(7,3,"Rein_N");
        liste_pieces.add(R_n);
        // String nom = "boonjour"; CharSequence bon = "-B"; nom.contains(bon);

    }*/


/*    public void deplacer_piece_plateau(int x_saisir, int y_saisir, int x_deplacement, int y_deplacement ) {
        //saisir une pièce puis dire ou tu veux déplacer
        for (Piece p: liste_pieces) {  // mettre toutes les pieces dans une seule liste
            // on rentre que si on est dans piece
            // System.out.println("FOR CASE");
            // System.out.println(p.getPosition_x()+", "+p.getPosition_y());
            // System.out.println(p.getType_piece_couleur());
            if (p.getPosition_x() == x_saisir && p.getPosition_y() == y_saisir ){
                // verif pas piece déja la ou on veux
                // verif portee deplacement possible
                System.out.println(p.getPosition_x()+", "+p.getPosition_y());
                System.out.println(y_deplacement+", "+x_deplacement);
                System.out.println(p.getType_piece_couleur());
                this.plateau.plateau[y_deplacement][x_deplacement]= p.getType_piece_couleur();
                p.setPosition_x(x_deplacement); // TODO erreur
                p.setPosition_y(y_deplacement);
                plateau.supprimer_piece_plateau(p.getPosition_y(),p.getPosition_x());
            }
        }
    }*/

}

