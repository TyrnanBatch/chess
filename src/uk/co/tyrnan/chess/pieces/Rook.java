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

    private static final ChessPiece[][] boardArray = Board.getBoardArray();


    public ArrayList<int[]> getPossibleMoves() {
        final int[] currentPosition = getPosition();

        ArrayList<int[]> possibleMoves = new ArrayList<>();

        final ChessPiece self = boardArray[currentPosition[0]][currentPosition[1]];

        int mutator = 1;
        boolean reverse = false;

        ChessPiece checkingPos;

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

                checkingPos = boardArray[a][b];

                if (checkingPos == null) {
                    possibleMoves.add(new int[]{a, b});
                } else if (checkingPos != self) {
                    if (checkingPos.getColour() != self.getColour()) {
                        possibleMoves.add(new int[]{a, b});
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
