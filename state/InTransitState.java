package state;
/**
 * @author Jadon Cornish
 */
public class InTransitState extends State {
    protected int days;

    public InTransitState(Package pkg, int quantity) {
        super(pkg,quantity);
        this.days = 5;
    }
    /**
     * @return String representation of the packages' status
     */
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " out for delivery";
    }
    /**
     * @return String representation of the packages' ETA
     */
    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + this.days + " days";
    }
    /**
     * @return delay message
     */
    public String delay() {
        this.days = this.days + 3;
        return "The " + pkg.getName() + " " + getVerb("has", "have")+ " experienced a delay in shipping. The" +
        pkg.getName() + " should arrive within " + this.days + " days";
    }

}