package modele.lancement_jeu;


public class Piece {
    private int position_x;
    private int position_y;
    private int portee_deplacement;

    private String type_piece_couleur;
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

        return position_x;
    }

    public int getPosition_y() {

        return position_y;
    }
}



