public class ShopOwner implements Observer{
    protected Subject watchman;
    /*
     * initializes each new ShopOwner
     */
    public ShopOwner(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /*
     * the Shopowner gets updated on the current danger and his action is printed
     */
    public void update(int warning) {
        switch(warning) {
            case 1:
                System.out.println("1 Trumpet Call: \"Shop Owner: Close down shop and head home\"\n");
                break;
            case 2:
                System.out.println("2 Trumpet Calls: \"Shop Owner: Drops everything and find nearest hideout\"\n");
                break;
        }
    }
}
