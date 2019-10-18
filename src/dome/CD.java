package dome;

public class CD {
    private String title;
    private String artist;
    private int numOfTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numOfTracks = numOfTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public static void main(String[] args) {

    }

    public void print() {
        System.out.println("CD: "+title+" : "+artist);
    }
}
