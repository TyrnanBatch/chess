package uk.co.tyrnan.chess.pieces;

public class Knight extends ChessPiece {
    public Knight(int colour, int[] position) {
        super(colour, position);
    }

    public static Knight black_knight_qs = new Knight(0, new int[]{0, 1});
    public static Knight black_knight_ks = new Knight(0, new int[]{0, 6});

    public static Knight white_knight_qs = new Knight(1, new int[]{7, 1});
    public static Knight white_knight_ks = new Knight(1, new int[]{7, 6});
}
