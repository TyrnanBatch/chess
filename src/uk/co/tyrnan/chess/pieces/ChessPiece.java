package uk.co.tyrnan.chess.pieces;

public abstract class ChessPiece {
    private final int colour;
    private int[] position;

    public ChessPiece(int colour, int[] position) {
        this.colour = colour;
        this.position = position;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getColour() {
        return colour;
    }
}
