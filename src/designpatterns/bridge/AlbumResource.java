package designpatterns.bridge;

public class AlbumResource implements IResource {

    public Album album;

    public AlbumResource(Album album) {
        this.album = album;
    }

    @Override
    public String getTitle() {
        return this.album.title + " by " + this.album.performer;
    }

    @Override
    public String getBody() {
        return this.album.songList;
    }
}
