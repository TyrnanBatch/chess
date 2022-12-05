package uk.co.tyrnan.chess.pieces;

public class King extends ChessPiece{
    public King(int colour, int[] position) {
        super(colour, position);
    }

    public static King black_king = new King(0, new int[] {0,4});
    public static King white_king = new King(1, new int[] {7,4});
}
