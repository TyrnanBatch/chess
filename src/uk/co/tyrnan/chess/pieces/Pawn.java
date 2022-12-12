package uk.co.tyrnan.chess.pieces;

import uk.co.tyrnan.chess.Board;

import java.util.ArrayList;
import java.util.Arrays;

public class Pawn extends ChessPiece {
    public Pawn(int colour, int[] position) {
        super(colour, position);
    }

    public static Pawn black_pawn_1 = new Pawn(0, new int[]{1, 0});
    public static Pawn black_pawn_2 = new Pawn(0, new int[]{1, 1});
    public static Pawn black_pawn_3 = new Pawn(0, new int[]{1, 2});
    public static Pawn black_pawn_4 = new Pawn(0, new int[]{1, 3});
    public static Pawn black_pawn_5 = new Pawn(0, new int[]{1, 4});
    public static Pawn black_pawn_6 = new Pawn(0, new int[]{1, 5});
    public static Pawn black_pawn_7 = new Pawn(0, new int[]{1, 6});
    public static Pawn black_pawn_8 = new Pawn(0, new int[]{1, 7});

    public static Pawn white_pawn_1 = new Pawn(1, new int[]{6, 0});
    public static Pawn white_pawn_2 = new Pawn(1, new int[]{6, 1});
    public static Pawn white_pawn_3 = new Pawn(1, new int[]{6, 2});
    public static Pawn white_pawn_4 = new Pawn(1, new int[]{6, 3});
    public static Pawn white_pawn_5 = new Pawn(1, new int[]{6, 4});
    public static Pawn white_pawn_6 = new Pawn(1, new int[]{6, 5});
    public static Pawn white_pawn_7 = new Pawn(1, new int[]{6, 6});
    public static Pawn white_pawn_8 = new Pawn(1, new int[]{6, 7});

    private static final ChessPiece[][] boardArray = Board.getBoardArray();


    public ArrayList<int[]> getPossibleMoves() {
        final int[] currentPosition = getPosition();

        ArrayList<int[]> possibleMoves = new ArrayList<>();

        final ChessPiece self = boardArray[currentPosition[0]][currentPosition[1]];

        int mutator;

        if (self.getColour() == 0) {
            mutator = 1;
        } else {
            mutator = -1;
        }

        int a;
        int b;

        for (int i = 1; i < 3; i++) {

            if (currentPosition[0] + (i * mutator) < 7) {
                if (boardArray[currentPosition[0] + (i * mutator)][currentPosition[1]] == null) {
                    possibleMoves.add(new int[]{currentPosition[0] + (i * mutator), currentPosition[1]});
                } else {
                    i = 3;
                }
            }

            a = currentPosition[0] + mutator;
            b = currentPosition[1] - 1;

            if (a < 7 && a > 0) {
                if (b >= 0 && boardArray[a][b] != null
                        && boardArray[a][b].getColour() != self.getColour()) {
                    possibleMoves.add(new int[]{a, b});
                }

                b = currentPosition[1] + 1;

                if (currentPosition[1] + 1 <= 7 && boardArray[a][b] != null
                        && boardArray[a][b].getColour() != self.getColour()) {
                    possibleMoves.add(new int[]{a, b});
                }
            }

        }

        for (int[] i : possibleMoves) {
            System.out.println(Arrays.toString(i));
        }

        return possibleMoves;
    }
}
