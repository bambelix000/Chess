package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class GamePanel extends Pieces implements ActionListener {

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
        uploadImages();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g) {
        /*board drawing*/
        for(int i=0 ; i<SCREEN_WIDTH/FIELD_SIZE; i+=2){

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
        BufferedImage image1 = whitePawn;
        BufferedImage image = blackPawn;

        for(int i=0 ; i<SCREEN_WIDTH/FIELD_SIZE; i++){
            g.drawImage(image1, i*FIELD_SIZE, 6*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
            g.drawImage(image, i*FIELD_SIZE, 1*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
        }

    }
    public void uploadImages(){
        try {
             whitePawn = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Pawn.png")));
             blackPawn = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bpawn.png")));
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
