import java.util.*;

/**
 *  A Watchman like from Game of Thrones
 *  @author Jadon Cornish
 * 
 */

public class Watchman implements Subject{
    protected ArrayList<Observer> observers;
    protected int warning;
    /*
     * Initiallizes the observers Array
     */
    public Watchman() {
        observers = new ArrayList<Observer>();
    }
    /*
     * adds an observer to the Array list
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /*
     * removes an observer from the Array List
     */
    public void removeObserver(Observer observer) {
        observers.add(observer);
    }
    /*
     * calls the update command for all the observers
     * essentially notifying all the townspeople of all danger
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(warning);
        }
    /*
     * prints the warning based on the number of trumpets player
     */
    }
    public void issueWarning(int warning) {
        switch(warning) {
            case 1:
                System.out.println("\"WARNING: 1 trumpet was played!\"");
                break;
            case 2:
                System.out.println("\"WARNING: 2 trumpets were played!\"");
                break;
        }
        this.warning = warning;
        notifyObservers();
    }
}
