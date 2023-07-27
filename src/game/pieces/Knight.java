package game.pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Knight {
    public static BufferedImage blackKnight, whiteKnight;

    public void uploadKnight(){
        try {
            whiteKnight = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Knight.png")));
            blackKnight = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Bknight.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
