package game.pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Rook {

    public static BufferedImage blackRook, whiteRook;

    public void uploadRook(){
        try {
            whiteRook = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Rook.png")));
            blackRook = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Brook.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
