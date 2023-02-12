package factory;
import java.util.*;
/** defines the class WoodColorPuzzle which extends Puzzle
 * @author Jadon Cornish
 */
public class WoodColorPuzzle extends Puzzle{
    public WoodColorPuzzle() {
        this.name = "Color Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Red Fish","Yellow Fish","Green Fish","Purple Fish","Pink Fish"
            ,"Orange Fish","Brown Fish","White Fish","Black Fish")
        );
    }
}