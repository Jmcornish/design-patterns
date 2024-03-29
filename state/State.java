package state;

public abstract class State {
    protected Package pkg;
    protected int quantity;
    
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }
    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();
    public String getVerb(String singular, String plural) {
        if (this.quantity == 1) {
            return singular;
        }
        else {
            return plural;
        }
    }
}
