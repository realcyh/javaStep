package dome;

public class CD extends Item {
    private String artist;
    private int numOfTracks;

    public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numOfTracks = numOfTracks;
    }

    public static void main(String[] args) {
        CD cd = new CD("right time", "jj lin", 5, 20, "excellent");
        cd.print();

    }

    public void print() {
        System.out.print("CD: ");
        super.print();
        System.out.print(" : "+artist+"\n");
    }
}
