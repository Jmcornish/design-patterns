package factory;
/** This Class implements ToyStore
 * @Author Jadon Cornish
 */
public class MelissaAndDougStore implements ToyStore {
    /**
     * @return returns the desired Puzzle based on the type
     */
    public Puzzle createPuzzle(String type) {
        switch(type) {
            case "color":
                Puzzle newColorPuzzle = new WoodColorPuzzle();
                return newColorPuzzle;
            case "animal":
                Puzzle newAnimalPuzzle = new WoodAnimalPuzzle();
                return newAnimalPuzzle;
        }
        return null;
    }
    /**
     * @return returns a String using the createPuzzle method and using
     * the assemble and boxPuzzle methods on it 
     */
    public String orderPuzzle(String type) {
        String order = createPuzzle(type).assemble() +
        createPuzzle(type).boxPuzzle();
        return order;
    }
}
