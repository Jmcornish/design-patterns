package factory;

public class MelissaAndDougStore implements ToyStore {
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
    public String orderPuzzle(String type) {
        String order = createPuzzle(type).assemble() +
        createPuzzle(type).boxPuzzle();
        return order;
    }
}
