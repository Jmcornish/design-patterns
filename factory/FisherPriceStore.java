package factory;

public class FisherPriceStore implements ToyStore {
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
    public String orderPuzzle(String type) {
        String order = createPuzzle(type).assemble() +
        createPuzzle(type).boxPuzzle();
        return order;
    }
}
