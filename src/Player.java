import java.awt.*;

public class Player {
    private final int length = 25;
    private int height = 50;
    private int y;
    private boolean inAir;
    private final int x = 190;
    private Color color;
    public Player(){
        y=760;
        color = Color.GREEN;
    }
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
    public void setY(int num){
        y = num;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color col){
        color = col;
    }
    public int getLength(){
        return length;
    }
    public int getHeight(){
        return height;
    }
    public boolean inAir(){
        return inAir;
    }
    public void jump(){
        //TODO
    }
}
