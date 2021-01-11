package main.java.screen;

import java.awt.*;
import java.io.IOException;

public interface Screen {
    public void init() throws IOException;
    public void render(Graphics g);
    public void tick();
}
