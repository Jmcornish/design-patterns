package state;
/**
 * @author Jadon Cornish
 */
public class DeliveredState extends State {
    protected int days;

    public DeliveredState(Package pkg, int quantity) {
        super(pkg,quantity);
        this.days = 0;
    }
    /**
     * @return String reperesentation of the status of package
     */
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here for you";
    }
    /**
     * @return String representation of the ETA of the package
     */
    public String getETA() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here";
    }
    /**
     * @return delay message
     */
    public String delay() {
        return "The " + pkg.getName() + " " + getVerb("has", "have") + " already been delivered";
    }

}
