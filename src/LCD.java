import java.util.Arrays;
import java.util.List;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    public LCD() { //Default constructor
        this.status = "Off"; // Default status LCD mati
        this.volume = 0;
        this.brightness = 0;
        this.cable = null;
    }

    public void turnOn() {
        this.status = "On";
    }

    public void turnOff() {
        this.status = "Off";
    }

    public void freeze() {
        this.status = "freeze";
    }

    public void volumeUp() {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void brightnessUp() {
        if (this.brightness < 100) {
            this.brightness++;
        }
    }

    public void brightnessDown() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void setCable(int option) {
    String[] cable = {"VGA", "DVA", "HDMI", "DisplayPort"};
    if (option >= 0 && option < cable.length) {
        this.cable = cable[option];
        }
    }

    public void displayMessage(){
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
}
