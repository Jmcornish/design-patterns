package decorator;
/**  An employee at a IceCream Shop
 *  @author Jadon Cornish
 */
public class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }
    /**
     * takes toString of IceCream and create a representation of iceCream
     * @return A string representation of the IceCream
     */
    public String toString() {
        if(this.numScoops >= 2) {
            return iceCream.toString() + ", " + 
            this.numScoops +" scoops of "+ this.flavor
            + " ice cream";
        }
        else {
            return iceCream.toString() +", a scoop of "
            + this.flavor + " ice cream";
        }
    }
    /**
     * takes getCost of IceCream and adds it to the cost
     * @return cost of the entire IceCream all scoops and cone
     */
    public double getCost() {
        return iceCream.getCost() + this.flavorCost;
    }
}