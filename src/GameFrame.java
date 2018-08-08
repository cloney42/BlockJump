import javax.swing.*;
import java.awt.*;
public class GameFrame extends JPanel {
Block b = new Block();
Player p = new Player();
main m = new main();
private int spaceCount = 0;
    public GameFrame(){
        this.setBackground(Color.BLACK);
        setPreferredSize(new Dimension(390,800));
        setFocusable(true);
        JFrame frame = new JFrame();
        frame.add(this);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(b.getColor());
        g.fillRect(m.getBlockX(),b.getY(),b.getLength(),b.getHeight());
        g.setColor(p.getColor());
        g.fillRect(p.getX(),p.getY(),p.getLength(),p.getHeight());
    }
    public void update(){
        repaint();
    }
}
