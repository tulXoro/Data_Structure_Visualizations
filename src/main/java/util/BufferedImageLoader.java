package main.java.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BufferedImageLoader {
    public static BufferedImage loadImage(String path) throws IOException {
        return ImageIO.read(BufferedImageLoader.class.getResource(path));
    }
}
