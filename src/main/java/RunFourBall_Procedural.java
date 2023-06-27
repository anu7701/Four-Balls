import processing.core.PApplet;

public class RunFourBall_Procedural extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 50;
    public static int x1=0;
    public static int x2=0;
    public static int x3=0;
    public static int x4=0;
    public static int y1=(int) ((1/5.0)*HEIGHT);
    public static int y2= (int)((2/5.0)*HEIGHT);
    public static int y3= (int)((3/5.0)*HEIGHT);
    public static int y4= (int)((4/5.0)*HEIGHT);

    public static void main(String[] args)
    {
        PApplet.main("RunFourBall_Procedural", args);

    }
    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw()
    {
        ellipse(x1,y1, DIAMETER, DIAMETER);
        ellipse(x2,y2, DIAMETER, DIAMETER);
        ellipse(x3,y3, DIAMETER, DIAMETER);
        ellipse(x4,y4, DIAMETER, DIAMETER);
        x1=x1+1;
        x2=x2+2;
        x3=x3+3;
        x4=x4+4;
    }
}
