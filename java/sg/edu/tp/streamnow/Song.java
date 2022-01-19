package sg.edu.tp.streamnow;

public class Song {
    //attributes
    private String id;
    private String title;
    private String artiste;
    private String fileLink;
    private String songLocation;
    private String songLength;
    private String mvLink;
    private int drawable;
    private String lyrics;

    //constructor
    public Song(String id, String title, String artiste, String fileLink, String songLength, String songLocation, int drawable, String mvLink, String lyrics) {
        this.id = id;
        this.title = title;
        this.artiste = artiste;
        this.fileLink = fileLink;
        this.songLength = songLength;
        this.songLocation = songLocation;
        this.mvLink = mvLink;
        this.drawable = drawable;
        this.lyrics = lyrics;
    }

    //methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public String getSongLocation() {
        return songLocation;
    }

    public void setSongLocation(String songLocation) {
        this.songLocation = songLocation;
    }

    public String getSongLength() {
        return songLength;
    }

    public void setSongLength(String songLength) {
        this.songLength = songLength;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getMvLink() {
        return mvLink;
    }

    public void setMvLink(String mvLink) {
        this.mvLink = mvLink;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
