package chessgame.entities;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class Queen extends Piece {
    public Queen(int color, ImageView queenImage) {
        super(color, queenImage);
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
        
        moves.add(new Integer[]{-1, -1});
        moves.add(new Integer[]{-1, 1});
        moves.add(new Integer[]{1, -1});
        moves.add(new Integer[]{1, 1});
        
        return moves;
    }
}