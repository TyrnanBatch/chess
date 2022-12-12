package uk.co.tyrnan.chess;

import uk.co.tyrnan.chess.gui.Display;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Board.populate();
        Display.board().setVisible(true);
//        Display.refreshBoard();
    }
}