package uk.co.tyrnan.chess.gui;

import uk.co.tyrnan.chess.Main;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    public Display() {
        this.setLayout(new GridLayout(8, 8));
        for (JLabel square : TileGeneration.generateTiles()) {
            this.add(square);
        }
    }

    public static JFrame board() {
        JFrame frame = new JFrame("");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(new Display(), BorderLayout.CENTER);
        frame.setSize(1024, 1024);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
