package mediaplayer;
//Creo una classe astratta da estendere a tutti i file multimediali
public abstract class ElementiMultimediali {
    String title;

    // Creo creo una
    public ElementiMultimediali(String title) {
        this.title = title;
    }

    public abstract void esegui();
}
