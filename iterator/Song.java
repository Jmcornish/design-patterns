package iterator;

/**
 * @author Jadon Cornish
 * stores information about the songs
 */
public class Song {
    protected String name;
    protected String artist;
    protected double length;
    protected Genre genre;

    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }
    /**
     * @return this method returns all the song informaton in a string form
     */
    public String toString() {
        return this.name + " by " + 
        this.artist + " category: " + 
        this.genre + " length: " +
        this.length + " min";
    }
}
