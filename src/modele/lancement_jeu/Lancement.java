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

/*        Plateau plateau_Echec = new Plateau();*/
        Joueur j1 = new Joueur("Joel");
        Joueur j2 = new Joueur("Nathan");

        Plateau plateau_Echec = new Plateau(j1, j2); // Affiche visuellement des pièces et lie les joueurs au plateau
        // ATTENTION : pièces juste du texte ET NON des objets Piece !

        plateau_Echec.setJoueurBlanc(j1); // DOUBLONS !!! déjà fait dans new Plateau(j1, j2)
        plateau_Echec.setJoueurNoir(j2); // DOUBLONS !!! déjà fait dans new Plateau(j1, j2)

        plateau_Echec.initialisation_Plateau(); // Créée les objets Pieces et les attribue aux joueurs correspondants
        // ATTENTION : les Pieces et les strings pieces sont 2 instances différentes !!!!
        plateau_Echec.affiche_plateau(); // Affiche le plateau[][], donc les strings pieces.


        boolean gagne = false;
        int tour = 1;
        Scanner entre_clavier = new Scanner(System.in);

//        plateau_Echec.deplacer_piece_plateau(1,2,2,4);

        int x_piece_saisi, y_piece_saisi, x_piece_deplace, y_piece_deplace;
        do {

            // A RETIRER - TEST
            System.out.println("Pieces restantes");
            /*plateau_Echec.affiche_plateau();*/
            for (Piece p: j1.liste_pieces) {
                System.out.println("1coord: y: " + p.getPosition_x() + " x: " + p.getPosition_y() + " statut " + p.getType_piece_couleur());
            }
            for (Piece p: j2.liste_pieces) {
                System.out.println("2coord: y: " + p.getPosition_x() + " x: " + p.getPosition_y() + " statut " + p.getType_piece_couleur());
            }
            // A RETIRER - TEST FIN

            if (tour%2 == 1){ // TOUR DU JOUEUR 01 ou joueur blanc ou J1
                System.out.println("YOYOYOOOYYOOYOYYYY TOUR JOUEUR 01");
                // verif si saisi case_non_vide
                boolean case_vide = false;
                do { // SELECTION D'UNE CASE
                    System.out.println("tour joueur 1");
                    do {
                        System.out.println("Selectionne le Y de ta piece mon pote:"); // ATTENTION le x est un y !
                        x_piece_saisi = entre_clavier.nextInt();

                    } while (x_piece_saisi < 0 || x_piece_saisi > 7 );
                    do {
                        System.out.println("Selectionne le X de ta piece mon pote:"); // ATTENTION le y est un x !
                        y_piece_saisi = entre_clavier.nextInt();
                    } while (y_piece_saisi < 0 || y_piece_saisi > 7);
                    case_vide = plateau_Echec.case_vide(x_piece_saisi, y_piece_saisi);
                }while (case_vide == true);

                // TODO utiliser string.contains pour interdire manger allier
                // DONE interdire deplacement meme position (FAIT)
                // TODO autoriser que les deplacements possible de la piece
                // TODO faire fonctionner methode deplacer_piece_plateau (afficher le deplacement)
                //do {
                do { // DEPLACEMENT DE LA PIECE SELECTIONNEE
                    do {
                        System.out.println("Entre le Y de deplacemen mon pote");
                        x_piece_deplace = entre_clavier.nextInt();
                    } while (x_piece_deplace < 0 || x_piece_deplace > 7);
                    do {
                        System.out.println("Entre le X deplacement mon pote");
                        y_piece_deplace = entre_clavier.nextInt();
                    } while (y_piece_deplace < 0 || y_piece_saisi > 7);
                }while(x_piece_deplace==x_piece_saisi && y_piece_deplace==y_piece_saisi);
                // TODO while(== true || == true || );

                plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,y_piece_deplace,x_piece_deplace, plateau_Echec.getJoueurBlanc());
                plateau_Echec.affiche_plateau();

            }
            else {
/*                System.out.println("YOYOYOOOYYOOYOYYYY TOUR JOUEUR 02");
                // System.out.println("Selectionne ta piece mon pote:");
                // x_piece_saisi = entre_clavier.nextInt();
                // y_piece_saisi = entre_clavier.nextInt();
                // System.out.println("Ou veux tu le deplacer mon pote");
                // x_piece_deplace = entre_clavier.nextInt();
                // y_piece_deplace = entre_clavier.nextInt();

                // verif si saisi case_non_vide
                boolean case_vide = false;
                do {
                    System.out.println("tour joueur 2");
                    do {
                        System.out.println("Selectionne le Y de ta piece mon pote:");
                        x_piece_saisi = entre_clavier.nextInt();

                    } while (x_piece_saisi < 0 || x_piece_saisi > 7 );
                    do {
                        System.out.println("Selectionne le X de ta piece mon pote:");
                        y_piece_saisi = entre_clavier.nextInt();
                    } while (y_piece_saisi < 0 || y_piece_saisi > 7);
                    case_vide = plateau_Echec.case_vide(x_piece_saisi, y_piece_saisi);
                }while (case_vide == true);

                // TODO utiliser string.contains pour interdire manger allier
                // DONE interdire deplacement meme position (FAIT)
                // TODO autoriser que les deplacements possible de la piece
                // TODO faire fonctionner methode deplacer_piece_plateau (afficher le deplacement)
                //do {
                do {
                    do {

                        System.out.println("Entre le Y de deplacemen mon pote");
                        x_piece_deplace = entre_clavier.nextInt();
                    } while (x_piece_deplace < 0 || x_piece_deplace > 7);
                    do {
                        System.out.println("Entre le X deplacement mon pote");
                        y_piece_deplace = entre_clavier.nextInt();
                    } while (y_piece_deplace < 0 || y_piece_saisi > 7);
                }while(x_piece_deplace==x_piece_saisi && y_piece_deplace==y_piece_saisi);
                // TODO while(== true || == true || );
                plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,x_piece_deplace,y_piece_deplace, plateau_Echec.getJoueurNoir());
                plateau_Echec.affiche_plateau();*/
                System.out.println("YOYOYOOOYYOOYOYYYY TOUR JOUEUR 02");
                // verif si saisi case_non_vide
                boolean case_vide = false;
                do { // SELECTION D'UNE CASE
                    System.out.println("tour joueur 1");
                    do {
                        System.out.println("Selectionne le Y de ta piece mon pote:");
                        x_piece_saisi = entre_clavier.nextInt();

                    } while (x_piece_saisi < 0 || x_piece_saisi > 7 );
                    do {
                        System.out.println("Selectionne le X de ta piece mon pote:");
                        y_piece_saisi = entre_clavier.nextInt();
                    } while (y_piece_saisi < 0 || y_piece_saisi > 7);
                    case_vide = plateau_Echec.case_vide(x_piece_saisi, y_piece_saisi);
                }while (case_vide == true);

                // TODO utiliser string.contains pour interdire manger allier
                // DONE interdire deplacement meme position (FAIT)
                // TODO autoriser que les deplacements possible de la piece
                // TODO faire fonctionner methode deplacer_piece_plateau (afficher le deplacement)
                //do {
                do { // DEPLACEMENT DE LA PIECE SELECTIONNEE
                    do {
                        System.out.println("Entre le Y de deplacemen mon pote");
                        x_piece_deplace = entre_clavier.nextInt();
                    } while (x_piece_deplace < 0 || x_piece_deplace > 7);
                    do {
                        System.out.println("Entre le X deplacement mon pote");
                        y_piece_deplace = entre_clavier.nextInt();
                    } while (y_piece_deplace < 0 || y_piece_saisi > 7);
                }while(x_piece_deplace==x_piece_saisi && y_piece_deplace==y_piece_saisi);
                // TODO while(== true || == true || );

                plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,y_piece_deplace,x_piece_deplace, plateau_Echec.getJoueurBlanc());
                plateau_Echec.affiche_plateau();
            }

/*            System.out.println("Pieces restantes");
            *//*plateau_Echec.affiche_plateau();*//*
            for (Piece p: j1.liste_pieces) {
                System.out.println("coord:" + " y: " + p.getPosition_x() + " x: " + p.getPosition_y() + " statut " + p.getType_piece_couleur());
            }
            for (Piece p: j2.liste_pieces) {
                System.out.println("coord:" + " y: " + p.getPosition_x() + " x: " + p.getPosition_y() + " statut " + p.getType_piece_couleur());
            }*/

            tour ++;
        }while(gagne==false);
//        plateau_Echec.deplacer_piece_plateau(x_piece_saisi,y_piece_saisi,x_piece_deplace,y_piece_deplace);

    }
}
