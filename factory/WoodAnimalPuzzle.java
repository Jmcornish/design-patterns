package factory;
import java.util.*;
public class WoodAnimalPuzzle extends Puzzle{
    public WoodAnimalPuzzle() {
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Horse","Sheep","Dog","Cat","Cow","Chicken")
        );
    }
}
