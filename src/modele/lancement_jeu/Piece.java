package modele.lancement_jeu;


import java.util.ArrayList;

public class Piece {
    protected int position_x;
    protected int position_y;
    protected int portee_deplacement;
    protected String type_piece_couleur;

    protected ArrayList<Integer[]> deplacementsPossibles = new ArrayList<>(); // nouvelle variable ajoutée (en attendant une classe COORDONNES)
    public static Piece pieceNulle; // A VOIR SI ON GARDE

    public Piece(int position_x, int position_y, int portee_deplacement,String type_piece_couleur) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.portee_deplacement = portee_deplacement;
        this.type_piece_couleur = type_piece_couleur;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

    public void setPortee_deplacement(int portee_deplacement) {
        this.portee_deplacement = portee_deplacement;
    }

    public void setType_piece_couleur(String type_piece_couleur) {
        this.type_piece_couleur = type_piece_couleur;
    }

    public String getType_piece_couleur() {
        return type_piece_couleur;
    }

    public int getPosition_x() {

        return this.position_x;
    }

    public int getPosition_y() {

        return this.position_y;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "position_x=" + position_x +
                ", position_y=" + position_y +
                ", portee_deplacement=" + portee_deplacement +
                ", type_piece_couleur='" + type_piece_couleur + '\'' +
                '}';
    }

    // Nouvelles méthodes ajoutées

    public ArrayList<Integer[]> getTabTest() {
        return deplacementsPossibles;
    }

    public void setTabTest(ArrayList<Integer[]> tabTest) {
        this.deplacementsPossibles = tabTest;
    }

    public void calculMouvementsPossibles(){
        System.out.println("Calcul des mouvements possibles");
    }

    public void verifMouvementPossible(int x_piece_saisie, int y_piece_saisie){
        System.out.println("Calcul des mouvements possibles");
    }


/*    public Piece2 retrouverPiece(int x_piece_saisie, int y_piece_saisie){

        for (int i=0; i< this.liste_pieces.size(); i++){
            if(liste_pieces.get(i).getPosition_x() == x_piece_saisie && liste_pieces.get(i).getPosition_y() == y_piece_saisie){
                return liste_pieces.get(i);
            }
        }
        System.out.println("ERREUR - pièce non trouvée");
        return Piece2.pieceNulle; // A VOIR SI BIEN...
    }

    public void calculMouvementsPossibles(int x_piece_saisie, int y_piece_saisie){
        Piece2 piece_choisie = retrouverPiece(x_piece_saisie,y_piece_saisie);
        if (piece_choisie.equals(Piece2.pieceNulle)){

        }else{

        }
    }*/


}



