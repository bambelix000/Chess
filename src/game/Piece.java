package game;

import game.pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Piece extends JPanel {
    int SCREEN_WIDTH = GamePanel.SCREEN_WIDTH;
    int FIELD_SIZE = GamePanel.FIELD_SIZE;

    King king = new King();
    Queen queen = new Queen();
    Rook rook = new Rook();
    Bishop bishop = new Bishop();
    Knight knight = new Knight();
    Pawn pawn = new Pawn();

    public void uploadPieces() {
            queen.uploadQueen();
            rook.uploadRook();
            pawn.uploadPawn();
            knight.uploadKnight();
            bishop.uploadBishop();
            king.uploadKing();
    }


    public void drawBoard(Graphics g) {
        for(int i=0 ; i<SCREEN_WIDTH/FIELD_SIZE; i+=2){

            g.setColor(Color.WHITE);

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
        BufferedImage pawn = Pawn.whitePawn;
        BufferedImage rook = Rook.whiteRook;
        BufferedImage knight = Knight.whiteKnight;
        BufferedImage bishop = Bishop.whiteBishop;
        BufferedImage queen = Queen.whiteQueen;
        BufferedImage king = King.whiteKing;

        BufferedImage bPawn = Pawn.blackPawn;
        BufferedImage bRook = Rook.blackRook;
        BufferedImage bKnight = Knight.blackKnight;
        BufferedImage bBishop = Bishop.blackBishop;
        BufferedImage bQueen = Queen.blackQueen;
        BufferedImage bKing = King.blackKing;

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
