package main.java;

import java.awt.Canvas;
import java.awt.Dimension;
import java.io.Serial;

import javax.swing.JFrame;

public class Window extends Canvas{

    @Serial
    private static final long serialVersionUID = 6596273530124848110L;

    public Window(int width, int height, String title, Application app) {

        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes game when closed
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(app);
        frame.setVisible(true);
        app.start();
    }

}