package decorator;
/** the Chocolate Child class to ScoopDecorator
 * @author Jadon Cornish
 */
public class Chocolate extends ScoopDecorator {
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "chocolate";
        this.flavorCost = 1.5*numScoops;
    }
}