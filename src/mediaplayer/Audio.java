package mediaplayer;

public class Audio extends ElementiMultimediali implements ElementiRiproducibili{
    int volume;

    public Audio(String title, int volume) {
        super(title);
        this.volume = volume;
    }

    @Override
    public int duration() { /* Effetuo l'override del metodo duration*/
        return 14;
    }

    @Override
    /* Effetuo l'override del metodo play per poter mostrare il volume e per stampare
    * tante volte il titolo tanto quanto è la durata della registrazione audio*/
    public void play() {

        for (int i = 0; i < duration(); i++) {
            for (int j = 0; j < volume; j++) {
                System.out.println("!");
            }
            System.out.println(title);
        }
    }
    /*Creo il metodo per alzare il volume e imposto il volume a 0 ogni volta
    * che l'utente cerca di diminiuire il volume sotto lo 0, di conseguenza stampo che il valore del volume
    * è uguale a 0*/
    public void volumeUp() {
        if (volume > 0) {
            volume--;
        } else if (volume == 0) {
            System.out.println("Volume a 0");
            volume = 0;
        }
    }
    /*Creo il metodo volume per regolare il volume in aumento ed ho impostato il volume massimo a 10. Quindi
    * se l'utente cercasse di aumentare il volume oltre il 10, il metotodo imposterebbe il volume a 10*/
    public void volumeDown() {
            volume++;
        if (volume == 10) {
            System.out.println("Livello volume al massimo");
            volume = 10;
        };
    }
    /*Ho creato il metodo per dare l'oppurtintà di ottenere il volume corrente*/
    public void getVolume() {
        System.out.println("Livello volume a: " + volume);
    }

}
