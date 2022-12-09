package uk.co.tyrnan.chess;

import uk.co.tyrnan.chess.pieces.*;

import java.util.Arrays;

public class Board {
    public static ChessPiece[][] ascii_board = new ChessPiece[8][8];

    public static void show() {
        System.out.println(Arrays.deepToString(ascii_board));
    }

    public static void populate() {
        //Black
        ascii_board[0][0] = Rook.black_rook_qs;
        ascii_board[0][1] = Knight.black_knight_qs;
        ascii_board[4][5] = Bishop.black_bishop_qs;
        ascii_board[0][3] = Queen.black_queen;
        ascii_board[0][4] = King.black_king;
        ascii_board[0][5] = Bishop.black_bishop_ks;
        ascii_board[0][6] = Knight.black_knight_ks;
        ascii_board[0][7] = Rook.black_rook_ks;

        ascii_board[1][0] = Pawn.black_pawn_1;
        ascii_board[1][1] = Pawn.black_pawn_2;
        ascii_board[1][2] = Pawn.black_pawn_3;
        ascii_board[1][3] = Pawn.black_pawn_4;
        ascii_board[1][4] = Pawn.black_pawn_5;
        ascii_board[1][5] = Pawn.black_pawn_6;
        ascii_board[1][6] = Pawn.black_pawn_7;
        ascii_board[1][7] = Pawn.black_pawn_8;

        //White
        ascii_board[7][0] = Rook.white_rook_qs;
        ascii_board[7][1] = Knight.white_knight_qs;
        ascii_board[7][2] = Bishop.white_bishop_qs;
        ascii_board[7][3] = Queen.white_queen;
        ascii_board[7][4] = King.white_king;
        ascii_board[7][5] = Bishop.white_bishop_ks;
        ascii_board[7][6] = Knight.white_knight_ks;
        ascii_board[7][7] = Rook.white_rook_ks;

        ascii_board[6][0] = Pawn.white_pawn_1;
        ascii_board[6][1] = Pawn.white_pawn_2;
        ascii_board[6][2] = Pawn.white_pawn_3;
        ascii_board[6][3] = Pawn.white_pawn_4;
        ascii_board[6][4] = Pawn.white_pawn_5;
        ascii_board[6][5] = Pawn.white_pawn_6;
        ascii_board[6][6] = Pawn.white_pawn_7;
        ascii_board[6][7] = Pawn.white_pawn_8;
    }
}
