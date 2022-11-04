package modele.lancement_jeu;

import modele.lancement_jeu.Piece;

public class Reine extends Piece {
    public Reine(int position_x, int position_y, String type_piece_couleur) {
        super(position_x, position_y, 8, type_piece_couleur);
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
