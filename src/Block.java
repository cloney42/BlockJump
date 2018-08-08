import java.awt.*;

public class Block {
    private final int length = 100;
    private final int height = 25;
    private int x;
    private int y;
    private boolean dir;
    private boolean dead;
    private Color color;


    public Block(){
        x = -100;
        y = 785;
        dir = true;
        color = Color.RED;
    }

    public int getX(){
        return x;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color col){
        color = col;
    }

    public int getY() {
        return y;
    }
    public int getHeight(){
        return height;
    }
    public int getLength(){
        return length;
    }
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean num){
        dead = num;
    }
    public void setX(int num){
        x = num;
    }
    public void setY(int num){
        y = num;
    }
    public boolean getDirection(){
        return dir;
    }
    public void setDirection(boolean direction){
        dir = direction;
    }
}
