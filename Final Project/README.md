
# Chess Game

## Synopsis
This is my project and is used to convert play chess.

## Motivation
This game can show how to play chess without knowing the rules or how to play the actual game board.

## How to Run
First you need a program or app that can run Java.

## Code Example
```private ArrayList<Tile> validatePawn(final int startingRow, final int startingColumn, final int ruleRow, final int ruleColumn) {
        ArrayList<Tile> moves = new ArrayList<>();
        
        Tile pawnTile;
        final Tile startingTile = tiles[startingRow][startingColumn];
        
        try {
            if (startingColumn - ruleColumn == startingColumn) {
                pawnTile = tiles[startingRow + ruleRow][startingColumn];
                
                if (pawnTile.isEmpty()) {
                    moves.add(pawnTile);
                    
                    if (!startingTile.getPiece().hasMoved()) {
                        pawnTile = tiles[startingRow + ruleRow * 2][startingColumn];
                        if (pawnTile.isEmpty()) {
                            moves.add(pawnTile);
                        }
                    }
                }
            }
            else {
                pawnTile = tiles[startingRow + ruleRow][startingColumn + ruleColumn];
                if (collisionOccured(pawnTile)) {
                    if (pawnTile.getPiece().getColor() != startingTile.getPiece().getColor()) {
                        moves.add(pawnTile);
                    }
                }
            }
        }
        catch(Exception ee) {
        }
        
        return moves;
    }
