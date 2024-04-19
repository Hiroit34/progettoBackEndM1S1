package program;

import mediaplayer.Audio;
import mediaplayer.ElementoMultimediale;
import mediaplayer.Image;
import mediaplayer.Video;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Creazione di un array per memorizzare gli elementi multimediali
        ElementoMultimediale[] elements = new ElementoMultimediale[5];

        // Ciclo per la creazione di ogni elemento multimediale
        for (int i = 0; i < elements.length; i++) {
            System.out.println("Inserisci il titolo per l'elemento " + (i + 1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Seleziona il tipo di elemento (1=Registrazione Audio, 2=Video, 3=Immagine):");
            int sceltaTipo = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline dopo l'input dell'utente

            switch (sceltaTipo) {
                case 1:
                    System.out.println("Inserisci il volume per la registrazione audio:");
                    int volumeAudio = scanner.nextInt();
                    System.out.println("Inserisci la durata dell'audio (in secondi):");
                    int durataAudio = scanner.nextInt();
                    // Creazione di un oggetto Audio e inserimento nell'array
                    elements[i] = new Audio(titolo, volumeAudio, durataAudio);
                    break;
                case 2:
                    System.out.println("Inserisci il volume per il video:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità per il video:");
                    int luminositaVideo = scanner.nextInt();
                    // Creazione di un oggetto Video e inserimento nell'array
                    elements[i] = new Video(titolo, volumeVideo, luminositaVideo);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosità per l'immagine:");
                    int luminositaImmagine = scanner.nextInt();
                    // Creazione di un oggetto Image e inserimento nell'array
                    elements[i] = new Image(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non valido. Riprova.");
                    i--; // Decrementa l'indice per ripetere l'iterazione
            }

            scanner.nextLine(); // Consuma il newline dopo l'input dell'utente
        }

        int scelta;
        // Ciclo per l'esecuzione degli elementi multimediali e la modifica del volume/luminosità
        do {
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per terminare)");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                // Esegui l'elemento selezionato
                elements[scelta - 1].esegui();

                // Chiedi all'utente se desidera aumentare o diminuire il volume o la luminosità
                System.out.println("Vuoi aumentare o diminuire il volume o la luminosità? (1=Volume, 2=Luminosità, 0=Esci)");
                int sceltaModifica = scanner.nextInt();
                switch (sceltaModifica) {
                    case 1:
                        System.out.println("Vuoi aumentare o diminuire il volume? (1=Aumentare, 2=Diminuire, 0=Annulla)");
                        int sceltaVolume = scanner.nextInt();
                        if (sceltaVolume == 1) {
                            // Aumenta il volume dell'elemento audio
                            ((Audio) elements[scelta - 1]).volumeUp();
                        } else if (sceltaVolume == 2) {
                            // Diminuisci il volume dell'elemento audio
                            ((Audio) elements[scelta - 1]).volumeDown();
                        }
                        break;
                    case 2:
                        System.out.println("Vuoi aumentare o diminuire la luminosità? (1=Aumentare, 2=Diminuire, 0=Annulla)");
                        int sceltaLuminosita = scanner.nextInt();
                        if (sceltaLuminosita == 1) {
                            // Aumenta la luminosità dell'elemento video
                            ((Video) elements[scelta - 1]).luminosityUp();
                        } else if (sceltaLuminosita == 2) {
                            // Diminuisci la luminosità dell'elemento video
                            ((Video) elements[scelta - 1]).luminosityDown();
                        }
                        break;
                    default:
                        System.out.println("Operazione annullata.");
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        scanner.close(); // Chiudi lo scanner alla fine dell'applicazione
    }
}
