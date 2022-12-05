package uk.co.tyrnan.chess;

import uk.co.tyrnan.chess.pieces.Rook;

public class Main {
    public static void main(String[] args) {
        Board.populate();
        Board.show();
        Rook.black_rook_qs.getPossibleMoves();
    }
}