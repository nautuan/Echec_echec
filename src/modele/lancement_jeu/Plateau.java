package modele.lancement_jeu;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
     //int nbre_pieces_blanc;
     //int nbre_pieces_noir;
    public List<Piece> liste_pieces = new ArrayList<>(); // NON ajouter dans classe joueur
    public String plateau [][] = new String[8][8];;
    private Joueur joueurBlanc;
    private Joueur joueurNoir;

    public Plateau(Joueur j1, Joueur j2) {
        this.joueurBlanc = j1;
        this.joueurNoir = j2;

        //initialisation du tableau
        for(int i=0; i<=7; i++) {
            for (int j = 0; j <=7; j++) {
                // Attribution des Pions
                if(i == 1 ){plateau[i][j] = "Pion-B";}
                if(i == 6 ){ plateau[i][j] = "Pion-N";}
                // Attribution des Tours
                if (i == 0 && j ==0 || i==0 && j == 7 ) {plateau[i][j] = "Tour_B";}
                if (i == 7 && j ==0 || i==7 && j == 7 ) {plateau[i][j] = "Tour_N";}
                // Attribution des cavalier
                if (i == 0 && j ==1 || i==0 && j == 6 ){ plateau[i][j] = "Cava_B";}
                if (i == 7 && j ==1 || i==7 && j == 6 ){ plateau[i][j] = "Cava_N";}
                // Attribution des Fou
                if (i == 0 && j ==2 || i==0 && j == 5 ){ plateau[i][j] = "Foou_B";}
                if (i == 7 && j ==2 || i==7 && j == 5 ) {plateau[i][j] = "Foou_N";}
                // Attribution des Roi
                if (i == 0 && j ==3  ){ plateau[i][j] = "Rooi_B";}
                if (i == 7 && j ==4  ) {plateau[i][j] = "Rooi_N";}
                // Attribution des Reine
                if (i == 0 && j ==4 ){ plateau[i][j] = "Rein_B";}
                if (i == 7 && j ==3 ) {plateau[i][j] = "Rein_N";}

                if (i == 2 || i ==3 || i ==4 || i==5 ) plateau[i][j] = "      ";
            }
        }
    }

    /*
     * Initialisation du Plateau
     */
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


    }
    /*
     * Méthode qui affiche le tableau
     */
    public void affiche_plateau () {
        // affiche Plateau

        for (int i =0; i<8; i++) {
            System.out.print("\t\t"+(i+1));
        }
        System.out.println();
        for(int i=0; i<=7; i++) {
            System.out.print(i+1+" ");
            for(int j=0; j<=7; j++) {
                System.out.print("| "+plateau[i][j]);
            }
            System.out.println(" |");
        }
    }

    // va s'activer quand manger
    public void supprimer_piece_plateau(int i, int j ) {
        this.plateau[i][j] = "      ";
        affiche_plateau();
    }

    public void deplacer_piece_plateau(int x_saisir, int y_saisir, int x_deplacement, int y_deplacement ) {
        //saisir une pièce puis dire ou tu veux déplacer
        for (Piece p: liste_pieces) {  // mettre toutes les pieces dans une seule liste
            // on rentre que si on est dans piece
            if (p.getPosition_x() == x_saisir-1 && p.getPosition_y() == y_saisir-1 ){
                 // verif pas piece déja la ou on veux

                // verif portee deplacement possible

                    plateau[x_deplacement-1][y_deplacement-1]= p.getType_piece_couleur();
                    p.setPosition_x(x_saisir);
                    p.setPosition_y(y_saisir);
                    supprimer_piece_plateau(p.getPosition_x(),p.getPosition_y());
             }
        }
    }

    public String[][] getPlateau() {
        return plateau;
    }

    public void setPlateau(String[][] plateau) {
        this.plateau = plateau;
    }
}
