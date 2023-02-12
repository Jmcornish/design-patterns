package factory;
import java.util.*;
/**
 * @Author Jadon Cornish
 */
public class PlasticAnimalPuzzle extends Puzzle{
    /**
     *  @return Defines the class PlasticAnimalPuzzle which extends Puzzle
     */
    public PlasticAnimalPuzzle() {
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces = new ArrayList<String>(
            Arrays.asList("Fox","Elephant","Giraffe","Owl","Monkey")
        );
    }
}
