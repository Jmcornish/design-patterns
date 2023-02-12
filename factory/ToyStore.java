package factory;
/** An interface that is implemented by FisherPrice and MelissaAndDoug classes
 * @Author Jadon Cornish
 */
public interface ToyStore {
    public String orderPuzzle(String type);
    public Puzzle createPuzzle(String tpye);
}
