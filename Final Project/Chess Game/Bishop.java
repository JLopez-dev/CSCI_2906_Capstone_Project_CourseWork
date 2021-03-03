package chessgame.entities;

import java.util.ArrayList;
import javafx.scene.image.ImageView;


public class Bishop extends Piece {
    public Bishop(int color, ImageView bishopImage) {
        super(color, bishopImage);
    }

    @Override
    public int tilesToSearch() {
        return 7;
    }

    @Override
    public ArrayList<Integer[]> getMoves() {
        ArrayList<Integer[]> moves = new ArrayList<>();

        moves.add(new Integer[]{-1, -1});
        moves.add(new Integer[]{-1, 1});
        moves.add(new Integer[]{1, -1});
        moves.add(new Integer[]{1, 1});
        
        return moves;
    }
}