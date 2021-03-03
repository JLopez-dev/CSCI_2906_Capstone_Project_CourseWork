package chessgame.entities;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Pawn extends Piece {
    public Pawn(int color, ImageView pawnImage) {
        super(color, pawnImage);
    }
    
    @Override
    public int tilesToSearch() {
        return 1;
    }

    @Override
    public ArrayList<Integer[]> getMoves() {
        ArrayList<Integer[]> moves = new ArrayList<>();

        moves.add(new Integer[]{-1 * this.getColor(), 0});
        moves.add(new Integer[]{-1 * this.getColor(), -1});
        moves.add(new Integer[]{-1 * this.getColor(), 1});
        
        return moves;
    }
}