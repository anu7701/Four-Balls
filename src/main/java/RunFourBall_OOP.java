import processing.core.PApplet;

import java.util.ArrayList;

public class RunFourBall_OOP extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static ArrayList<Ball> balls=new ArrayList<>();

    public static void main(String[] args)
    {
        PApplet.main("RunFourBall_OOP", args);

    }
    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup()
    {
        for(int factor=1;factor<=4;factor++)
        {
            balls.add(new Ball(0,factor*HEIGHT/5));
        }
    }
    @Override
    public void draw()
    {
        for(int i=0;i<4;i++)
        {
            Ball b=balls.get(i);
            b.drawBall(this);
            b.update(i+1);
        }
    }

}
