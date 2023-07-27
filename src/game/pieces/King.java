package game.pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class King {
    public static BufferedImage blackKing, whiteKing;

    public void uploadKing(){
        try {
            whiteKing = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/King.png")));
            blackKing = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Bking.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
