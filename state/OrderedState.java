package state;
/**
 * @author Jadon Cornish
 */
public class OrderedState extends State {
    protected int days;

    public OrderedState(Package pkg, int quantity) {
        super(pkg,quantity);
    }
    /**
     * @return String representation of the packages' status
     */
    public String getStatus() {
        return "The " + this.pkg.getName() + " " + getVerb("was", "were") + " ordered";
    }
    /**
     * @return String representation of the packages' ETA
     */
    public String getETA() {
        return "The " + this.pkg.getName() + " will be shipped within " + this.days + " business days";
    }
    /**
     * @return delay message
     */
    public String delay() {
        this.days = this.days + 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing. The " +
        pkg.getName() + " will be shipped within " + this.days + " business days";
    }

}