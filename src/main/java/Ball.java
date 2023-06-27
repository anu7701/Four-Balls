import processing.core.PApplet;

public class Ball extends PApplet {
    public int x;
    public int y;
    public static final int diameter=50;
    public Ball(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void drawBall(PApplet pApplett)
    {
        pApplett.ellipse(this.x,this.y, diameter, diameter);
    }
    public void update(int factor) {
        this.x+=factor;
    }
}
