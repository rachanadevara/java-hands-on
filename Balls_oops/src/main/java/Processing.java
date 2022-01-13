import processing.core.PApplet;
public class Processing extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int START = 0;
    Ball ball1, ball2, ball3, ball4;


    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        super.setup();
        background(200);
        ball1 = new Ball(START, 1 * HEIGHT / 5, 50,1);
        ball2 = new Ball(START, 2 * HEIGHT / 5, 50, 2);
        ball3 = new Ball(START, 3 * HEIGHT / 5, 50, 3);
        ball4 = new Ball(START, 4 * HEIGHT / 5, 50, 4);
    }


    @Override
    public void draw() {
        ball1.draw();
        ball2.draw();
        ball3.draw();
        ball4.draw();
    }

    public class Ball {
        int init;
        int diam;
        int speed;
        int height;

        public Ball(int init, int height, int diam, int speed) {
            this.init = init;
            this.diam = diam;
            this.speed = speed;
            this.height = height;
        }

        void draw() {
            ellipse(init, height, diam, diam);
            init += speed;
        }
    }
}
