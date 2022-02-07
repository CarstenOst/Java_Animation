import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 1920;
    final int PANEL_HEIGHT = 1080;
    Image bil;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        bil = new ImageIcon("OpelAstra.jpg").getImage();
        timer = new Timer(1000, this);
        timer.start();

    }
    public void paint(Graphics g){

        super.paint(g); // paint bg
        Graphics g2D = (Graphics2D) g;
        g2D.drawImage(bil, x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(bil.getWidth(null));
        x += xVelocity;
        repaint();
    }
}