package mediaplayer;

// Classe che rappresenta una registrazione audio
public class Audio extends ElementoMultimediale implements ElementoRiproducibile {
    private int duration; // Durata della registrazione audio
    private static final int MIN_VOLUME = 0; // Volume minimo
    private static final int MAX_VOLUME = 10; // Volume massimo

    private int volume; // Livello di volume attuale

    // Costruttore della classe Audio
    public Audio(String title, int volume, int duration) {
        super(title);
        // Imposta il volume al valore compreso tra MIN_VOLUME e MAX_VOLUME
        this.volume = Math.min(Math.max(volume, MIN_VOLUME), MAX_VOLUME);
        this.duration = duration; //Imposta la durata della registrazione audio
    }

    // Metodo per ottenere la durata della registrazione audio
    @Override
    public int duration() {
        return duration;
    }

    // Metodo per riprodurre la registrazione audio
    @Override
    public void play() {
        // Ciclo per riprodurre la registrazione audio per la sua durata
        for (int i = 0; i < duration(); i++) {
            String output = title + " "; // Titolo della registrazione
            // Genera una stringa di "!" per rappresentare il livello di volume
            for (int j = 0; j < volume; j++) {
                output += "!";
            }
            System.out.println(output); // Stampa l'output
        }
    }

    // Metodo per aumentare il volume
    public void volumeUp() {
        if (volume > MIN_VOLUME) { // Se il volume non è al minimo
            volume--; // Diminuisci il volume
        } else {
            System.out.println("Volume a 0"); // Altrimenti, il volume è già al minimo
        }
    }

    // Metodo per diminuire il volume
    public void volumeDown() {
        if (volume < MAX_VOLUME) { // Se il volume non è al massimo
            volume++; // Aumenta il volume
        } else {
            System.out.println("Livello volume al massimo"); // Altrimenti, il volume è già al massimo
        }
    }

    // Metodo per ottenere il livello di volume attuale
    public void getVolume() {
        System.out.println("Livello volume a: " + volume);
    }

    // Metodo per eseguire la riproduzione della registrazione audio
    public void esegui() {
        play();
    }
}
