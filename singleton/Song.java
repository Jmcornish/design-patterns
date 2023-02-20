package singleton;

public class Song {
    protected String title;
    protected String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public String getTitle() {
        return this.title;
    }
    public String toString() {
        return this.title + " by " + this.artist;
    }
}
