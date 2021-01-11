package main.java;

import main.java.screen.MenuScreen;
import main.java.screen.Screen;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.nio.Buffer;
import java.util.HashMap;

public class Application extends Canvas implements Runnable {

    private State state = State.MENU;

    public final String title = "Data Structures Visualized";
    public static final int WIDTH = 640, HEIGHT = WIDTH/12 * 9; //used for pop out window

    private boolean isRunning = false;
    private Thread thread;

    private HashMap<State, Screen> screens;

    public void init() throws IOException {
        screens = new HashMap<>();
        screens.put(State.MENU, new MenuScreen());
    }

    /*
        Allows the program to run and render buffered images on the screen
     */
    public synchronized void start(){
        if(isRunning) return;
        thread = new Thread(this);
        thread.start();
        isRunning = true;
    }

    public synchronized void stop(){
        if(!isRunning) return;
        try{
            thread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }isRunning = false;
    }

    /*
        ----------------------------- MOUSE INTERACTIONS -----------------------------
     */

    // (don't worry about it)
    public void run(){
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        while(isRunning){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                delta--;
            }
            tick();
            render();
            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
            }
        }
        stop();
    }

    // Might delete, depends
    private void tick(){
        screens.get(state).tick();
    }

    // Renders buffered images
    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = ((BufferStrategy) bs).getDrawGraphics();

        screens.get(state).render(g);

        g.dispose();
        bs.show();
    }

    public Application() {
        new Window(WIDTH,HEIGHT,title,this);
    }

    public static void main(String[] args) {
        new Application();
    }


}
