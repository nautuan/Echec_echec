package modele.lancement_jeu;

import modele.lancement_jeu.Piece;

public class Cavalier extends Piece {
    public Cavalier(int position_x, int position_y, String type_piece_couleur) {
        super(position_x, position_y, 3, type_piece_couleur);
    }
}
