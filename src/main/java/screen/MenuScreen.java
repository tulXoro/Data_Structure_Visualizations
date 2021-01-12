package main.java.screen;

import main.java.Application;
import main.java.util.BufferedImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MenuScreen implements Screen{
    private BufferedImage image = new BufferedImage(Application.WIDTH, Application.HEIGHT, BufferedImage.TYPE_INT_RGB);

    public MenuScreen() throws IOException {
        init();
    }

    public void init() throws IOException {
        image = BufferedImageLoader.loadImage("../../res/image/testCircleImage.png");// throws exception if directory not found
    }

    public void render(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, Application.WIDTH/2, Application.HEIGHT);

        g.drawImage(image, 0, 0, 32, 32,null);
    }

    public void tick() {

    }
}
