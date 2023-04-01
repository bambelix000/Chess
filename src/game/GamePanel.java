package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int FIELD_SIZE = 100;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.white);
        this.setFocusable(true);
        startGame();
    }
    public void startGame() {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g) {
    /*board drawing*/for(int i=0 ; i<SCREEN_WIDTH/FIELD_SIZE; i+=2){

                g.setColor(Color.GRAY);

                g.drawRect(i*FIELD_SIZE,0,FIELD_SIZE,FIELD_SIZE);
                g.fillRect(i*FIELD_SIZE,0,FIELD_SIZE,FIELD_SIZE);

                g.drawRect((i+1)*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect((i+1)*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);

                g.drawRect(i*FIELD_SIZE,2*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect(i*FIELD_SIZE,2*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);

                g.drawRect((i+1)*FIELD_SIZE,3*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect((i+1)*FIELD_SIZE,3*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);

                g.drawRect(i*FIELD_SIZE,4*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect(i*FIELD_SIZE,4*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);

                g.drawRect((i+1)*FIELD_SIZE,5*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect((i+1)*FIELD_SIZE,5*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);

                g.drawRect(i*FIELD_SIZE,6*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect(i*FIELD_SIZE,6*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);

                g.drawRect((i+1)*FIELD_SIZE,7*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
                g.fillRect((i+1)*FIELD_SIZE,7*FIELD_SIZE,FIELD_SIZE,FIELD_SIZE);
            }

    }
}
