package main;

public class Application {

    public final String title = "Data Structures Visualized";
    public static final int WIDTH = 640, HEIGHT = WIDTH/12 * 9; //used for pop out window

    public Application() {
        new Window(WIDTH,HEIGHT,title,this);
    }

    public static void main(String[] args) {
        new Application();
    }
}
