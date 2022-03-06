import processing.core.PApplet;

public class Ball{

    PApplet p;
    int xPos=0;

    public void moveBall(PApplet p,int height,int size,int n,int speed) {
        this.p=p;
        p.ellipse(xPos,height/n,size,size);
        xPos = xPos + speed;
    }


}

