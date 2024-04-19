package mediaplayer;


/*Creo l'interfaccia play per tutti gli elementi che implementano il play e una durata
come video,registrazione audio, in breve tutti gli elementi riproducibili
 */
public interface ElementoRiproducibile {
    int duration();
    void play();
}
