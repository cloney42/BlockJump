import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class main{

    private static int blockX = 0;
    public static void main(String[] args) {
        Block b = new Block();
        Player p = new Player();
        GameFrame gf = new GameFrame();
        gf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
        while (true){
            if (blockX >= 90 && !p.inAir()){
               blockX = 0;
            }
            blockX++;
            try {
                Thread.sleep(20);
                gf.update();
            }catch(Exception e){

            }
            if (b.isDead()){
                blockX=0;
                b.setDead(false);
            }
        }
    }
    public int getBlockX(){
        return blockX;
    }
}
