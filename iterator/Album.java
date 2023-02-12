package iterator;
/**
 * @author Jadon Cornish
 * this class contains all of the songs and a name for itself
 */
public class Album {
    protected Song[] songs;
    protected int count;
    protected String name;

    public Album(String name) {
        this.name = name;
        this.songs = new Song[20];
        this.count = 0;
    }
/**
 * 
 * @param name
 * @param artist
 * @param length
 * @param genre
 * @return the following method adds a song to the array of songs and 
 * returns a boolean stating whether the song was added or not
 */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        Song newSong = new Song(name, artist, length, genre);
        if (count <= 19) {
            this.songs[this.count] = newSong;
            this.count++;
            return true;
        }
        else {
            return false;
        }

    }
    /**
     * 
     * @return creates an iterator for the albun
     * 
     */
    public AlbumIterator createIterator() {
        AlbumIterator newIterator = new AlbumIterator(this.songs);
        return newIterator;
    }
    /**
     * 
     * @return returns the name of the albyn
     */
    public String getName() {
        return this.name;
    }
}
