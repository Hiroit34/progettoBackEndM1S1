package program;

import mediaplayer.Audio;
import mediaplayer.ElementiMultimediali;
import mediaplayer.Image;
import mediaplayer.Video;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ElementiMultimediali[] elements = new ElementiMultimediali[5];


        for (int i = 0; i < elements.length; i++) {
            System.out.println("Inserisci il titolo per l'elemento " + (i+1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Seleziona il tipo di elemento (1=Registrazione Audio, 2=Video, 3=Immagine):");
            int sceltaTipo = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline dopo l'input dell'utente

            switch (sceltaTipo) {
                case 1:
                    System.out.println("Inserisci il volume per la registrazione audio:");
                    int volume = scanner.nextInt();
                    elements[i] = new Audio(titolo, volume);
                    break;
                case 2:
                    System.out.println("Inserisci il volume per il video:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità per il video:");
                    int luminosita = scanner.nextInt();
                    elements[i] = new Video(titolo, volumeVideo, luminosita);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosità per l'immagine:");
                    int luminositaImmagine = scanner.nextInt();
                    elements[i] = new Image(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non valido. Riprova.");
                    i--;
            }
            scanner.nextLine();
        }


        int scelta;
        do {
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per terminare)");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                elements[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);
    }
}
