package mediaplayer;

public class Video extends ElementoMultimediale implements ElementoRiproducibile {
    private static final int DURATION = 20;
    private static final int MAX_BRIGHTNESS = 10;

    private int volume;
    private int brightness;

    public Video(String titolo, int volume, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.brightness = Math.max(0, Math.min(luminosita, MAX_BRIGHTNESS));
    }

    public int duration() {
        return DURATION; // Restituisce la durata del video
    }

    public void play() {
        StringBuilder sb = new StringBuilder(); // Inizializza un StringBuilder per il livello di volume

        // Costruisce la stringa del livello di volume utilizzando "!"
        for (int i = 0; i < volume; i++) {
            sb.append("!"); // Aggiunge un carattere "!" al livello di volume
        }

        StringBuilder luminosityBuilder = new StringBuilder(); // Inizializza un StringBuilder per il livello di luminosità

        // Costruisce la stringa del livello di luminosità utilizzando "*"
        for (int i = 0; i < brightness; i++) {
            luminosityBuilder.append("*"); // Aggiunge un carattere "*" al livello di luminosità
        }

        // Stampa il video per la durata specificata
        for (int i = 0; i < duration(); i++) {
            // Stampa il livello di volume, il livello di luminosità e il titolo del video
            System.out.println(sb.toString() + " " + luminosityBuilder.toString() + " " + title);
        }
    }

    public void luminosityUp() {
        brightness = Math.min(brightness + 1, MAX_BRIGHTNESS); // Aumenta la luminosità, ma non oltre il valore massimo
    }

    public void luminosityDown() {
        brightness = Math.max(brightness - 1, 0); // Diminuisce la luminosità, ma non al di sotto di 0
    }

    public void esegui() {
        play(); // Esegue la riproduzione del video
    }
}
