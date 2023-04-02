package game;

import javax.imageio.ImageIO;
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
        uploadPieces();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        drawPieces(g);
    }

    public void uploadPieces(){
        try {
            whitePawn = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Pawn.png")));
            whiteRook = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Rook.png")));
            whiteKnight = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Knight.png")));
            whiteBishop = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bishop.png")));
            whiteQueen = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Queen.png")));
            whiteKing = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/King.png")));

            blackPawn = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bpawn.png")));
            blackRook = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Brook.png")));
            blackKnight = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bknight.png")));
            blackBishop = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bbishop.png")));
            blackQueen = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bqueen.png")));
            blackKing = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/pieces/Bking.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void drawBoard(Graphics g) {
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

    }
    public void drawPieces(Graphics g){
        BufferedImage pawn = whitePawn;
        BufferedImage rook = whiteRook;
        BufferedImage knight = whiteKnight;
        BufferedImage bishop = whiteBishop;
        BufferedImage queen = whiteQueen;
        BufferedImage king = whiteKing;

        BufferedImage bPawn = blackPawn;
        BufferedImage bRook = blackRook;
        BufferedImage bKnight = blackKnight;
        BufferedImage bBishop = blackBishop;
        BufferedImage bQueen = blackQueen;
        BufferedImage bKing = blackKing;

        for(int i=0 ; i<SCREEN_WIDTH/FIELD_SIZE; i++){
            g.drawImage(pawn, i*FIELD_SIZE, 6*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
            g.drawImage(bPawn, i*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
        }
        for(int i=0 ; i<SCREEN_WIDTH/FIELD_SIZE; i+=7){
            g.drawImage(rook, i*FIELD_SIZE, 7*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
            g.drawImage(bRook, i*FIELD_SIZE, 0, FIELD_SIZE, FIELD_SIZE, null);
        }
        for(int i=1 ; i<SCREEN_WIDTH/FIELD_SIZE; i+=5){
            g.drawImage(knight, i*FIELD_SIZE, 7*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
            g.drawImage(bKnight, i*FIELD_SIZE, 0, FIELD_SIZE, FIELD_SIZE, null);
        }
        for(int i=2 ; i<SCREEN_WIDTH/FIELD_SIZE; i+=3){
            g.drawImage(bishop, i*FIELD_SIZE, 7*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
            g.drawImage(bBishop, i*FIELD_SIZE, 0, FIELD_SIZE, FIELD_SIZE, null);
        }
        g.drawImage(queen, 3*FIELD_SIZE, 7*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);
        g.drawImage(king, 4*FIELD_SIZE, 7*FIELD_SIZE, FIELD_SIZE, FIELD_SIZE, null);

        g.drawImage(bQueen, 3*FIELD_SIZE, 0, FIELD_SIZE, FIELD_SIZE, null);
        g.drawImage(bKing, 4*FIELD_SIZE, 0, FIELD_SIZE, FIELD_SIZE, null);
    }

}
