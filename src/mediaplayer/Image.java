package mediaplayer;

public class Image extends ElementiMultimediali {
    int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public void show() {
        for (int i = 0; i < brightness; i++) {
            System.out.print("*");
        }
        System.out.println(" " + title);
    }

    public void setBrightnessUp() {
        brightness++;
    }

    public void setBrightnessDown() {
        if (brightness > 0) {
            brightness--;
        }
    }
    public void esegui() {
        show();
    }
}
