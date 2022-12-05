package uk.co.tyrnan.chess.pieces;

public class Pawn extends ChessPiece{
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


}
