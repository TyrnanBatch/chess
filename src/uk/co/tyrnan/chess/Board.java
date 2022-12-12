package uk.co.tyrnan.chess;

import uk.co.tyrnan.chess.pieces.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    protected static ChessPiece[][] boardArray = new ChessPiece[8][8];

    public static void show() {
        for (ChessPiece[] i : boardArray) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void populate() {
        //Black
        boardArray[0][0] = Rook.black_rook_qs;
        boardArray[0][1] = Knight.black_knight_qs;
        boardArray[0][2] = Bishop.black_bishop_qs;
        boardArray[0][3] = Queen.black_queen;
        boardArray[0][4] = King.black_king;
        boardArray[0][5] = Bishop.black_bishop_ks;
        boardArray[0][6] = Knight.black_knight_ks;
        boardArray[0][7] = Rook.black_rook_ks;

        boardArray[1][0] = Pawn.black_pawn_1;
        boardArray[1][1] = Pawn.black_pawn_2;
        boardArray[1][2] = Pawn.black_pawn_3;
        boardArray[1][3] = Pawn.black_pawn_4;
        boardArray[1][4] = Pawn.black_pawn_5;
        boardArray[1][5] = Pawn.black_pawn_6;
        boardArray[1][6] = Pawn.black_pawn_7;
        boardArray[1][7] = Pawn.black_pawn_8;

        //White
        boardArray[7][0] = Rook.white_rook_qs;
        boardArray[7][1] = Knight.white_knight_qs;
        boardArray[7][2] = Bishop.white_bishop_qs;
        boardArray[7][3] = Queen.white_queen;
        boardArray[7][4] = King.white_king;
        boardArray[7][5] = Bishop.white_bishop_ks;
        boardArray[7][6] = Knight.white_knight_ks;
        boardArray[7][7] = Rook.white_rook_ks;

        boardArray[6][0] = Pawn.white_pawn_1;
        boardArray[6][1] = Pawn.white_pawn_2;
        boardArray[6][2] = Pawn.white_pawn_3;
        boardArray[6][3] = Pawn.white_pawn_4;
        boardArray[6][4] = Pawn.white_pawn_5;
        boardArray[6][5] = Pawn.white_pawn_6;
        boardArray[6][6] = Pawn.white_pawn_7;
        boardArray[6][7] = Pawn.white_pawn_8;
    }

    public static ChessPiece[][] getBoardArray() {
        return boardArray;
    }

    public static void setBoardArray(int[] currentPosition, int[] newPosition) {
        ChessPiece x = boardArray[currentPosition[1]][currentPosition[0]];
        boardArray[currentPosition[0]][currentPosition[1]] = boardArray[newPosition[0]][newPosition[1]];
        boardArray[newPosition[0]][newPosition[1]] = x;
    }
}
