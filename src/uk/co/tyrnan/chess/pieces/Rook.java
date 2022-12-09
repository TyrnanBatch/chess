package uk.co.tyrnan.chess.pieces;

import uk.co.tyrnan.chess.Board;

import java.util.ArrayList;
import java.util.Arrays;

public class Rook extends ChessPiece {
    public Rook(int colour, int[] position) {
        super(colour, position);
    }

    public static Rook black_rook_qs = new Rook(0, new int[]{0, 0});
    public static Rook black_rook_ks = new Rook(0, new int[]{0, 7});

    public static Rook white_rook_qs = new Rook(1, new int[]{7, 0});
    public static Rook white_rook_ks = new Rook(1, new int[]{7, 7});

    public ArrayList<int[]> getPossibleMoves() {
        int[] currentPosition = getPosition();

        ArrayList<int[]> possibleMoves = new ArrayList<>();

        int mutator = 1;

        // X
        for (int i = currentPosition[1]; i > -1; i += mutator) {
            if (Board.ascii_board[currentPosition[0]][i] == null) {
                possibleMoves.add(new int[]{currentPosition[0], i});
            } else if (Board.ascii_board[currentPosition[0]][i] != null && i != currentPosition[1]) {
                if (Board.ascii_board[currentPosition[0]][i].getColour() != Board.ascii_board[currentPosition[0]][currentPosition[1]].getColour()) {
                    possibleMoves.add(new int[]{currentPosition[0], i});
                }
                if (mutator == -1) i = -1;
                else i = currentPosition[1];

                mutator = -1;
            }

            if (i == 7) {
                i = currentPosition[1];
                mutator = -1;
            }
        }

        mutator = 1;

        // Y
        for (int i = currentPosition[0]; i > -1; i += mutator) {
            if (Board.ascii_board[i][currentPosition[1]] == null) {
                possibleMoves.add(new int[]{i, currentPosition[1]});
            } else if (Board.ascii_board[i][currentPosition[1]] != null && i != currentPosition[0]) {
                if (Board.ascii_board[i][currentPosition[1]].getColour() != Board.ascii_board[currentPosition[0]][currentPosition[1]].getColour()) {
                    possibleMoves.add(new int[]{i, currentPosition[1]});
                }
                if (mutator == -1) i = -1;
                else i = currentPosition[0];
                mutator = -1;
            }
            if (i == 7) {
                i = currentPosition[0];
                mutator = -1;
            }
        }

        return possibleMoves;
    }
}
