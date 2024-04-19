package mediaplayer;

// Classe che rappresenta un'immagine
public class Image extends ElementoMultimediale {
    private static final int MAX_BRIGHTNESS = 10; // Luminosità massima

    private int brightness; // Luminosità dell'immagine

    // Costruttore della classe Image
    public Image(String title, int brightness) {
        super(title); // Chiama il costruttore della superclasse ElementoMultimediale
        // Imposta la luminosità dell'immagine, garantendo che sia compresa tra 0 e MAX_BRIGHTNESS
        this.brightness = Math.max(0, Math.min(brightness, MAX_BRIGHTNESS));
    }

    // Metodo per visualizzare l'immagine con la luminosità corrente
    public void show() {
        // Ciclo per stampare il carattere "*" per rappresentare la luminosità
        for (int i = 0; i < brightness; i++) {
            System.out.print("*");
        }
        // Stampa il titolo dell'immagine dopo la sequenza di "*"
        System.out.println(" " + title);
    }

    // Metodo per aumentare la luminosità
    public void setBrightnessUp() {
        // Incrementa la luminosità, ma non oltre il valore massimo MAX_BRIGHTNESS
        brightness = Math.min(brightness + 1, MAX_BRIGHTNESS);
    }

    // Metodo per diminuire la luminosità
    public void setBrightnessDown() {
        // Decrementa la luminosità, ma non al di sotto di 0
        brightness = Math.max(brightness - 1, 0);
    }

    // Metodo per eseguire la visualizzazione dell'immagine
    public void esegui() {
        show();
    }
}

