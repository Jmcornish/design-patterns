package decorator;
/** the Strawberry Child class to ScoopDecorator
 * @author Jadon Cornish
 */
public class Strawberry extends ScoopDecorator{

    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4*numScoops;
    }
    
}
