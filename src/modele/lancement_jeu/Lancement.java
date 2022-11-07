package modele.lancement_jeu;

import java.util.Scanner;

public class Lancement {
    public Lancement() {

    }
    /*public String demande_piece () {
        Scanner entre_clavier = new Scanner(System.in);
        // verif si saisi case_non_vide
        boolean case_vide = false;
        int x_piece_saisi, y_piece_saisi, x_piece_deplace, y_piece_deplace;
        do {
            do {
                System.out.println("Selectionne le X de ta piece mon pote:");
                x_piece_saisi = entre_clavier.nextInt();

            } while (x_piece_saisi < 1 || x_piece_saisi > 8 ||);
            do {
                System.out.println("Selectionne le Y de ta piece mon pote:");
                y_piece_saisi = entre_clavier.nextInt();
            } while (y_piece_saisi < 1 || y_piece_saisi > 8);
            plate
        }while (case_vide == true);
        do {
            System.out.println("Entre le X de deplacemen mon pote");
            x_piece_deplace = entre_clavier.nextInt();
        }while(x_piece_deplace<1 || x_piece_deplace>8);
        do {
            System.out.println("Entre le X deplacement mon pote");
            y_piece_deplace = entre_clavier.nextInt();
        }while(y_piece_deplace<1 || y_piece_saisi>8);

        String sum = ""+x_piece_saisi+x_piece_deplace+y_piece_deplace+y_piece_saisi;
        return sum;
    } */


    public void lancer_le_jeux() {
        System.out.println("\t\t\t\t**********\n");

        Joueur j1 = new Joueur("Joel");
        Joueur j2 = new Joueur("Nathan");
        Plateau plateau_Echec = new Plateau(j1,j2);

        plateau_Echec.initialisation_Plateau();
        plateau_Echec.affiche_plateau();

        boolean gagne = false;
        int tour = 1;
        Scanner entre_clavier = new Scanner(System.in);

//        plateau_Echec.deplacer_piece_plateau(1,2,2,4);

        int x_piece_saisi, y_piece_saisi, x_piece_deplace, y_piece_deplace;
        do {
            if (tour%2 == 1){
                // verif si saisi case_non_vide
                boolean case_vide = false;
                do {
                    do {
                        System.out.println("Selectionne le X de ta piece mon pote:");
                        x_piece_saisi = entre_clavier.nextInt();

                    } while (x_piece_saisi < 0 || x_piece_saisi > 7 );
                    do {
                        System.out.println("Selectionne le Y de ta piece mon pote:");
                        y_piece_saisi = entre_clavier.nextInt();
                    } while (y_piece_saisi < 0 || y_piece_saisi > 7);
                    case_vide = plateau_Echec.case_vide(x_piece_saisi, y_piece_saisi);
                }while (case_vide == false);

                do {
                    System.out.println("Entre le X de deplacemen mon pote");
                    x_piece_deplace = entre_clavier.nextInt();
                }while(x_piece_deplace<0 || x_piece_deplace>7);
                do {
                    System.out.println("Entre le X deplacement mon pote");
                    y_piece_deplace = entre_clavier.nextInt();
                }while(y_piece_deplace<0 || y_piece_saisi>7);


                plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,y_piece_deplace,x_piece_deplace);
                plateau_Echec.affiche_plateau();

            }
            else {
                System.out.println("Selectionne ta piece mon pote:");
                x_piece_saisi = entre_clavier.nextInt();
                y_piece_saisi = entre_clavier.nextInt();
                System.out.println("Ou veux tu le deplacer mon pote");
                x_piece_deplace = entre_clavier.nextInt();
                y_piece_deplace = entre_clavier.nextInt();

                plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,x_piece_deplace,y_piece_deplace);
                plateau_Echec.affiche_plateau();

            }
        }while(gagne==false);
//        plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,x_piece_deplace,y_piece_deplace);

    }
}
