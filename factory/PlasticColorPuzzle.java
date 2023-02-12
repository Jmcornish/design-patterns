package factory;
import java.util.*;
/**
 * @Author Jadon Cornish
 */
public class PlasticColorPuzzle extends Puzzle {
    /**
     * @return Defines the class PlasticColorPuzzle which extends Puzzle
     */
    public PlasticColorPuzzle() {
        this.name = "Color Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Green Dog","Orange Dog","Red Dog","Blue Dog","Yellow Dog","Brown Dog")
        );
    }
}
