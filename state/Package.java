package state;
/**
 * @author Jadon Cornish
 */
public class Package {
    protected String name;
    protected int quantity;
    protected State state;
    protected State orderedState;
    protected State inTransitState;
    protected State deliveredState;

    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.orderedState = new OrderedState(this, quantity);
        this.inTransitState = new InTransitState(this, quantity);
        this.deliveredState = new DeliveredState(this, quantity);
    }
    /**
     * sets the state to ordered then returns the status and ETA
     * @return Status + ETA
     */
    public String order() {
        setState(orderedState);
        return this.state.getStatus() + "\n" + this.state.getETA();
    }
    /**
     * sets the state to inTransit then returns the status and ETA
     * @return Status + ETA
     */
    public String mail() {
        setState(inTransitState);
        return this.state.getStatus() + "\n" + this.state.getETA();
    }
    /**
     * sets the state to Delivered then returns the status
     * @return Status
     */
    public String received() {
        setState(deliveredState);
        return this.state.getStatus();
    }
    /**
     * 
     * @return delay message
     */
    public String delay() {
        return this.state.delay();
    }
    /**
     * 
     * @param state
     * sets the state to the param
     */
    public void setState(State state) {
        this.state = state;
    }
    /**
     * 
     * @return the name of the package
     */
    public String getName() {
        return this.name;
    }
}