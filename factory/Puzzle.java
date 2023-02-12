package factory;
import java.util.*;
/**
 * @Author Jadon Cornish
 */
public class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;
    /**
     * 
     * @return uses the previous variables to construct a String with the help of a
     * helper method
     */
    public String assemble() {
        return "Putting together a " + this.name + "\n" +
        "This puzzle is made out of " + this.material + "\n" +
        "Adding the following pieces" + "\n" +
        assembleList();
    }
    /**
     * uses the previous variable to construct a String
     * @return
     */
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
