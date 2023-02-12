package iterator;
/**
 * @author Jadon Cornish
 * allows the user to move through each song
 */
public class AlbumIterator implements Iterator {
    protected Song[] song;
    protected int position;

    public AlbumIterator(Song[] songs) {
        this.song = songs;
        this.position = -1;
    }
    /***
     * 
     * @return checks if the album has a another song in the list
     */
    public boolean hasNext() {
        if (this.song[this.position+1] != null) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * 
     * @return returns the next song then iterates the list upwards
     */
    public Song next() {
        Song songInList = this.song[this.position+1];
        this.position++;
        return songInList;
    }
}
