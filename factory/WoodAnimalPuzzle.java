package factory;
import java.util.*;
/** defines the class WoodAnimalPuzzle which extends Puzzle
 * @author Jadon Cornish
 */
public class WoodAnimalPuzzle extends Puzzle{
    public WoodAnimalPuzzle() {
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Horse","Sheep","Dog","Cat","Cow","Chicken")
        );
    }
}
