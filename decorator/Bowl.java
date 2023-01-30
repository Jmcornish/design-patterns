package decorator;
/** Bowl Child Class
 * @author Jadon Cornish
 */
public class Bowl extends IceCream {
    public Bowl() {
        this.description = "Bowl";
    }
    /**
     * @return cost of a bowl is nothing
     */
    public double getCost() {
        return 0;
    }
}
