package factory;
import java.util.*;

public class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;

    public String assemble() {
        return "Putting together a " + this.name + "\n" +
        "This puzzle is made out of " + this.material + "\n" +
        "Adding the following pieces" + "\n" +
        assembleList();
    }
    public String boxPuzzle() {
        return "Putting the " + this.name + " in a box\n";
    }
    private String assembleList() {
        String List = "";
        for (int i = 0; i<this.pieces.size(); i++) {
            List = List + "-  " + this.pieces.get(i) + "\n";
        }
        return List;
    }
}
