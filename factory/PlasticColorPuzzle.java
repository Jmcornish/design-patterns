package factory;
import java.util.*;
public class PlasticColorPuzzle extends Puzzle {
    public PlasticColorPuzzle() {
        this.name = "Color Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Green Dog","Orange Dog","Red Dog","Blue Dog","Yellow Dog","Brown Dog")
        );
    }
}
