public class Teacher implements Observer {
    protected Subject watchman;
    /*
     * Initializes the teacher and adds it to the ArrayList
     */
    public Teacher(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /*
     * the Teacher gets updated on the current danger and his action is printed
     */
    public void update(int warning) {
        switch(warning) {
            case 1:
                System.out.println("1 Trumpet Call: \"Teacher:Helps get every kid home safe\"\n");
                break;
            case 2:
                System.out.println("2 Trumpet Calls: \"Teacher: Brings all students to the underground shelter\"\n");
                break;
        }
    }
}
