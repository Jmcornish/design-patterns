public class Knight implements Observer {
    protected Subject watchman;
    /*
     * Initializes the Knight and adds it to the ArrayList
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /*
     * the Knight gets updated on the current danger and his action is printed
     */
    public void update(int warning) {
        switch(warning) {
            case 1:
                System.out.println("1 Trumpet Call: \"Knight: Helps everyone get home safe\"\n");
                break;
            case 2:
                System.out.println("2 Trumpet Calls: \"Knight: Prepares for battle\"\n");
                break;
        }
    }
}
