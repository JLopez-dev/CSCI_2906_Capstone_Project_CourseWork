package chessgame.entities;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Rook extends Piece {
    public Rook(int color, ImageView rookImage) {
        super(color, rookImage);
    }

    @Override
    public int tilesToSearch() {
        return 7;
    }

    @Override
    public ArrayList<Integer[]> getMoves() {
        ArrayList<Integer[]> moves = new ArrayList<>();

        moves.add(new Integer[]{-1, 0});
        moves.add(new Integer[]{1, 0});
        moves.add(new Integer[]{0, 1});
        moves.add(new Integer[]{0, -1});
        
        return moves;
    }
}