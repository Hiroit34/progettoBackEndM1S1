package mediaplayer;
//Creo una classe astratta da estendere a tutti i file multimediali
public abstract class ElementoMultimediale {
    String title;

    // Creo creo una
    public ElementoMultimediale(String title) {
        this.title = title;
    }

    public abstract void esegui();
}
