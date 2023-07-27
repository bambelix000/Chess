package game.pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Queen {

    public static BufferedImage blackQueen, whiteQueen;

    public void uploadQueen(){
        try {
            blackQueen = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Bqueen.png")));
            whiteQueen = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Queen.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

