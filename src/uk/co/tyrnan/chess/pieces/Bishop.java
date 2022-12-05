package uk.co.tyrnan.chess.pieces;

import uk.co.tyrnan.chess.Board;

import java.util.ArrayList;

public class Bishop extends ChessPiece {
    public Bishop(int colour, int[] position) {
        super(colour, position);
    }

    public static Bishop black_bishop_qs = new Bishop(0, new int[]{0, 2});
    public static Bishop black_bishop_ks = new Bishop(0, new int[]{0, 5});

    public static Bishop white_bishop_qs = new Bishop(1, new int[]{7, 2});
    public static Bishop white_bishop_ks = new Bishop(1, new int[]{7, 5});

    public ArrayList<int[]> getPossibleMoves() {
        int[] currentPosition = getPosition();

        ArrayList<int[]> possibleMoves = new ArrayList<>();

        for (int i = currentPosition[0]; i < 8; i++) {
            if (Board.ascii_board[i][i] == null) {
                possibleMoves.add(new int[] {i, i});
            } else if (Board.ascii_board[i][i] != Board.ascii_board[currentPosition[0]][currentPosition[1]] && Board.ascii_board[i][i].getColour() != Board.ascii_board[currentPosition[0]][currentPosition[1]].getColour()) {
                possibleMoves.add(new int[] {i, i});
                i = 8;
            }
        }

        return possibleMoves;
    }
}
