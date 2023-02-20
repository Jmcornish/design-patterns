package singleton;
import java.util.*;

public class JukeBox {
    protected static JukeBox jukeBox;
    protected ArrayList<Song> songs;
    protected Queue<String> songQueue;

    public JukeBox() {
        this.songs = DataLoader.getSongs();
        System.out.println("Hello");
        System.out.println(this.songs.get(1).toString());
    }
    public static JukeBox getInstance() {
        return jukeBox;
    }
    public String playNextSong() {
        if (hasMoreSongs()) {
            return "Let's jam to " + this.songQueue.remove();
        }
        else {
            return "You need to add songs to the list";
        }
    }
    public String requestSong(String title) {
        for ( int i = 0; i<this.songs.size(); i++) {
            if ( this.songs.get(i).getTitle() == title ) {
                this.songQueue.add(this.songs.get(i).toString());
                return this.songs.get(i).getTitle() + " is now "
                + this.songQueue.size() + " on the list";
            } 
        }
        return "Sorry we do not have the song " + title;
    } 
    public Boolean hasMoreSongs() {
        if ( this.songQueue.size() == 0 ) {
            return false;
        }
        else {
            return true;
        }
    }
}
