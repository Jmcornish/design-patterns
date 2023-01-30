package decorator;
/** representation of an entire iceCream
 *  @author Jadon Cornish
 */
public abstract class IceCream {
    protected String description;
    /**
     * @return a string representation of the cone type
     */
    public String toString() {
        return this.description;
    }
    /**
     * @return the cost of nothing is nothing
     */
    public double getCost() {
        return 0;
    }
}