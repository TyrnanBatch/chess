package uk.co.tyrnan.chess.pieces;

public class Queen extends ChessPiece{
    public Queen(int colour, int[] position) {
        super(colour, position);
    }

    public static Queen black_queen = new Queen(0, new int[] {0,3});
    public static Queen white_queen = new Queen(1, new int[] {7,3});
}
