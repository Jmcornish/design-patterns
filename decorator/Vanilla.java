package decorator;
/** the Vanilla Child class to ScoopDecorator
 * @author Jadon Cornish
 */
public class Vanilla extends ScoopDecorator {
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "vanilla";
        this.flavorCost = 1.25*numScoops;
    }
}
