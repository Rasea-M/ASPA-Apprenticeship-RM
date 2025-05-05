package main.design_patterns.facade;

public class SoundSystem {

    private final AudioFormat audioFormat;
    private int volume;

    public SoundSystem(AudioFormat audioFormat, int volume) {
        this.audioFormat = audioFormat;
        this.volume = volume;
    }

    public void start() {
        System.out.println("Sound System working with audio format " + audioFormat.name());
    };

    public void raiseVolume(int amount) {
        if (this.volume + amount < 100) {
            this.volume += amount;
        } else {
            this.volume = 100;
        }
    }

    public void lowerVolume(int amount) {
        if (this.volume - amount > 0) {
            this.volume -= amount;
        } else {
            this.volume = 0;
        }
    }
}
