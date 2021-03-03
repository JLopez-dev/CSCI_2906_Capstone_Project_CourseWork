package chessgame.entities;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

public class King extends Piece {
    public King(int color, ImageView kingImage) {
        super(color, kingImage);
    }

    @Override
    public int tilesToSearch() {
        return 1;
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

        if (!hasMoved()) {
            moves.add(new Integer[]{0, -2});
            moves.add(new Integer[]{0, 2});
        }
        
        return moves;
    }
}