package uk.co.tyrnan.chess.pieces;

import uk.co.tyrnan.chess.Board;

import java.util.ArrayList;
import java.util.Arrays;

public class Bishop extends ChessPiece {
    public Bishop(int colour, int[] position) {
        super(colour, position);
    }

    public static Bishop black_bishop_qs = new Bishop(0, new int[]{4, 5});
    public static Bishop black_bishop_ks = new Bishop(0, new int[]{0, 5});

    public static Bishop white_bishop_qs = new Bishop(1, new int[]{7, 2});
    public static Bishop white_bishop_ks = new Bishop(1, new int[]{7, 5});

    private static final ChessPiece[][] boardArray = Board.getBoardArray();

    public ArrayList<int[]> getPossibleMoves() {
        final int[] currentPosition = getPosition();

        ArrayList<int[]> possibleMoves = new ArrayList<>();

        int mutator = 1;
        boolean reverse = false;

        final ChessPiece self = boardArray[currentPosition[0]][currentPosition[1]];

        int a;
        int b;

        ChessPiece checkingPos;

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 8; i++) {
                if (reverse) {
                    b = i * mutator + currentPosition[0];
                    a = (i * (mutator * -1)) + currentPosition[1];
                } else {
                    a = i * mutator + currentPosition[0];
                    b = i * mutator + currentPosition[1];
                }

                checkingPos = boardArray[a][b];

                if (a > 7 || b > 7) {
                    mutator = -1;
                    i = 0;
                } else {
                    if (checkingPos == null) {
                        possibleMoves.add(new int[]{a, b});
                    } else if (checkingPos != self) {
                        if (checkingPos.getColour() != self.getColour()) {
                            possibleMoves.add(new int[]{a, b});
                        }
                        if (mutator == -1) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        mutator = -1;
                    }
                }
            }
            reverse = true;
            mutator = 1;
        }

        return possibleMoves;
    }
}
