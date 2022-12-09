package modele.lancement_jeu;

import modele.lancement_jeu.Piece;

public class Cavalier extends Piece {

    public Cavalier(int position_x, int position_y, String type_piece_couleur) {
        super(position_x, position_y, 3, type_piece_couleur);
    }

    // Nouvelles méthodes

    public void calculMouvementsPossiblesInitial(){
        super.calculMouvementsPossibles();

        if(this.deplacementsPossibles.size() != 0){
            this.deplacementsPossibles.clear();
        }

        Integer coordNouvelles[] = new Integer[2];

        int x = this.position_x + 2;
        int y = this.position_y + 1;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x + 2;
        y = this.position_y - 1;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x - 2;
        y = this.position_y + 1;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x - 2;
        y = this.position_y - 1;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x + 1;
        y = this.position_y + 2;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x + 1;
        y = this.position_y - 2;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x - 1;
        y = this.position_y + 2;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);

        x = this.position_x - 1;
        y = this.position_y - 2;
        coordNouvelles[0] = x;
        coordNouvelles[1] = y;
        this.deplacementsPossibles.add(coordNouvelles);
    }
    







}
