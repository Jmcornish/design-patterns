package factory;
import java.util.*;
public class PlasticAnimalPuzzle extends Puzzle{
    public PlasticAnimalPuzzle() {
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Fox","Elephant","Giraffe","Owl","Monkey")
        );
    }
}
