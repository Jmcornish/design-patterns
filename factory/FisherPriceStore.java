package factory;
/** This class implements ToyStore
 * @Author Jadon Cornish
 */
public class FisherPriceStore implements ToyStore {
    /**
     * @return the desired puzzle based on the type of toy wanted
     */
    public Puzzle createPuzzle(String type) {
        switch(type) {
            case "color":
                Puzzle newColorPuzzle = new PlasticColorPuzzle();
                return newColorPuzzle;
            case "animal":
                Puzzle newAnimalPuzzle = new PlasticAnimalPuzzle();
                return newAnimalPuzzle;
        }
        return null;
    }
    /**
     * @return calls createPuzzle and constructs a String using the assemble and boxPuzzle methods
     */
    public String orderPuzzle(String type) {
        String order = createPuzzle(type).assemble() +
        createPuzzle(type).boxPuzzle();
        return order;
    }
}
