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
        boolean reverse = false;

        int a;
        int b;

        for (int j = 0; j < 2; j++) {
            for (int i = currentPosition[1]; i > -1; i += mutator) {

                if (reverse) {
                    a = currentPosition[0];
                    b = i;
                } else {
                    a = i;
                    b = currentPosition[1];
                }

                if (Board.ascii_board[a][b] == null) {
                    possibleMoves.add(new int[]{a, b});
                } else if (Board.ascii_board[a][b] != null && Board.ascii_board[a][b] != Board.ascii_board[currentPosition[0]][currentPosition[1]]) {
                    if (Board.ascii_board[currentPosition[0]][i].getColour() != Board.ascii_board[currentPosition[0]][currentPosition[1]].getColour()) {
                        possibleMoves.add(new int[]{currentPosition[0], i});
                    }
                    if (mutator == -1) {
                        i = -1;
                    } else {
                        i = currentPosition[1];
                    }
                    mutator = -1;
                }

                if (i == 7) {
                    i = currentPosition[1];
                    mutator = -1;
                }
            }
            mutator = 1;
            reverse = true;
        }

        return possibleMoves;
    }
}
