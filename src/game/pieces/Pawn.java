package game.pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Pawn {
    public static BufferedImage blackPawn, whitePawn;

    public void uploadPawn(){
        try {
            whitePawn = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Pawn.png")));
            blackPawn = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/piecespng/Bpawn.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
