package main.java.screen;

import main.java.Application;
import main.java.util.BufferedImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MenuScreen implements Screen{
    private BufferedImage image;

    public MenuScreen() throws IOException {
        init();
    }

    public void init() throws IOException {
        image = BufferedImageLoader.loadImage("../res/image/test.png");//throws exception if directory not found
    }

    public void render(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, Application.WIDTH, Application.HEIGHT);

        g.drawImage(image, 0, 0, 32, 32,null);
    }

    public void tick() {

    }
}
