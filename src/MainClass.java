import processing.core.PApplet;


public class MainClass extends PApplet {

    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;
    private static final int SIZE = 30;

    Ball ball1,ball2,ball3,ball4;
    public static void main(String[] args) {

        PApplet.main("MainClass");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }
    @Override

    public void setup(){
    ball1=new Ball();
    ball2=new Ball();
    ball3=new Ball();
    ball4=new Ball();
    }


    @Override

    public void draw(){



        ball1.moveBall(this,HEIGHT*1,SIZE,5,1);
        ball2.moveBall(this,HEIGHT*2,SIZE,5,2);
        ball3.moveBall(this,HEIGHT*3,SIZE,5,3);
        ball3.moveBall(this,HEIGHT*4,SIZE,5,4);




    }



}