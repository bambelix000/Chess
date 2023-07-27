package game.pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Bishop {
    public static BufferedImage blackBishop, whiteBishop;

    public void uploadBishop(){
        try {
            whiteBishop = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Bishop.png")));
            blackBishop = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Bbishop.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
