package chessgame.entities;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Knight extends Piece {
    public Knight(int color, ImageView knightImage) {
        super(color, knightImage);
    }

    @Override
    public int tilesToSearch() {
        return 1;
    }

    @Override
    public ArrayList<Integer[]> getMoves() {
        ArrayList<Integer[]> moves = new ArrayList<>();

        moves.add(new Integer[]{-2, -1});
        moves.add(new Integer[]{-2, 1});
        moves.add(new Integer[]{-1, -2});
        moves.add(new Integer[]{-1, 2});
        moves.add(new Integer[]{1, -2});
        moves.add(new Integer[]{1, 2});
        moves.add(new Integer[]{2, -1});
        moves.add(new Integer[]{2, 1});
        
        return moves;
    }
}