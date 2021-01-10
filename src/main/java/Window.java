package main.java;

import main.java.Application;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;

public class Window extends Canvas{

    private static final long serialVersionUID = 6596273530124848110L;

    public Window(int width, int height, String title, Application app) throws IOException {

        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes game when closed
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}