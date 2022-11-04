package modele.lancement_jeu;

import modele.lancement_jeu.Piece;

public class Pion extends Piece {

    public Pion(int position_x, int position_y, String nom_piece_couleur ) {
        super(position_x, position_y, 1, nom_piece_couleur);
    }

    @Override
    public String getType_piece_couleur() {
        return super.getType_piece_couleur();
    }

    @Override
    public int getPosition_x() {
        return super.getPosition_x();
    }

    @Override
    public int getPosition_y() {
        return super.getPosition_y();
    }
}
