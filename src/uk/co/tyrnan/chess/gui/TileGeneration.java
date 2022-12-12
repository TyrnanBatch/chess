package uk.co.tyrnan.chess.gui;

import uk.co.tyrnan.chess.Board;
import uk.co.tyrnan.chess.pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BandCombineOp;
import java.util.ArrayList;

public class TileGeneration {

    private static int[] previousClickPosition;
    private static final ChessPiece[][] boardArray = Board.getBoardArray();
    private static final Color WHITE = new Color(238, 238, 210);
    private static final Color BLACK = new Color(118, 150, 86);

    public static ArrayList<JLabel> generateTiles() {
        ArrayList<JLabel> squares = new ArrayList<>();

        String colour;
        ChessPiece pos;
        final String prefix = "/home/tyrnan/IdeaProjects/chess/src/uk/co/tyrnan/chess/sprites/";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                pos = boardArray[i][j];
                ImageIcon y = null;

                if (pos != null) {
                    if (pos.getColour() == 0) {
                        colour = "black";
                    } else {
                        colour = "white";
                    }

                    if (pos.getClass() == King.class) {
                        y = new ImageIcon(prefix + colour + "_king.png");
                    } else if (pos.getClass() == Queen.class) {
                        y = new ImageIcon(prefix + colour + "_queen.png");
                    } else if (pos.getClass() == Pawn.class) {
                        y = new ImageIcon(prefix + colour + "_pawn.png");
                    } else if (pos.getClass() == Knight.class) {
                        y = new ImageIcon(prefix + colour + "_knight.png");
                    } else if (pos.getClass() == Rook.class) {
                        y = new ImageIcon(prefix + colour + "_rook.png");
                    } else if (pos.getClass() == Bishop.class) {
                        y = new ImageIcon(prefix + colour + "_bishop.png");
                    }
                }

                JLabel x = new JLabel("", y, JLabel.CENTER);
                x.setBounds(i * 128, j * 128, 128, 128);
                x.setOpaque(true);
                if ((j + i) % 2 == 0) {
                    x.setBackground(WHITE);
                } else {
                    x.setBackground(BLACK);
                }

                int finalI = i;
                int finalJ = j;
                x.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (previousClickPosition != null) {
                            if (e.getSource() == x) {
                                handleClick(finalI, finalJ, previousClickPosition);
                                previousClickPosition = null;
                            }
                        } else {
                            previousClickPosition = new int[]{finalI, finalJ};
                        }
                    }
                });

                squares.add(x);
            }
        }

        return squares;
    }

    private static void handleClick(int i, int j, int[] previousClickPosition) {
        Board.setBoardArray(new int[]{i, j}, previousClickPosition);
        boardArray[i][j].setPosition(new int[]{i, j});
    }

}
