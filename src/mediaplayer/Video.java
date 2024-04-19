package mediaplayer;

public class Video extends ElementiMultimediali implements ElementiRiproducibili {
    int volume;
    int brightnes;

    public Video(String titolo, int volume, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.brightnes = luminosita;
    }

    public int duration() {
        return 20;
    }

    public void play() {
        for (int i = 0; i < duration(); i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < brightnes; j++) {
                System.out.print("*");
            }
            System.out.println(" " + title);
        }
    }

    public void luminosityUp() {
        brightnes++;
    }

    public void luminosityDown() {
        if (brightnes > 0) {
            brightnes--;
        }
    }
    public void esegui() {
        play();
    }
}
