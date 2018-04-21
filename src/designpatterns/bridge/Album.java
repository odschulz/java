package designpatterns.bridge;

public class Album {
    public String performer;
    public String title;
    public String songList;

    public Album(String performer, String title, String songList) {
        this.performer = performer;
        this.title = title;
        this.songList = songList;
    }
}
