
import processing.core.PApplet;

public class Processing extends PApplet{
public static final int WIDTH=600;
    public static final int HEIGHT=600;
    int x=0;
    int y=0;
    int z=0;
    int a=0;
    
    public static void main(String[] args)
    {
        PApplet.main("Processing",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
@Override
    public void draw(){
        ellipse(x,HEIGHT*1/5,30,30);
        x+=1;
    ellipse(y,HEIGHT*2/5,30,30);
    y+=2;
    ellipse(z,HEIGHT*3/5,30,30);
    z+=3;
    ellipse(a,HEIGHT*4/5,30,30);
    a+=4;

}
}