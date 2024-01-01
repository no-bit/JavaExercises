import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    private String name;
    private String artist;
    private ArrayList <Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration){
        Song song = new Song(name, duration);
        if (findSong(song.getTitle()) == null){
            songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String song){
        for (Song a : songs){
            if (a.getTitle().equals(song)){
                return a;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList <Song> playlist){
        try {
            if (songs.get(trackNumber-1) != null){
                playlist.add(songs.get(trackNumber - 1));
                return true;
            }
        } catch (Exception ignored) {

        }
        return false;
    }

    public boolean addToPlayList(String songName, LinkedList <Song> playlist){
        try {
            if (findSong(songName) != null){
                playlist.add(songs.get(songs.indexOf(findSong(songName))));
                return true;
            }
        } catch (Exception ignored) {
        }
        return false;
    }
}
