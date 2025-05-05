package main.design_patterns.facade;

public class CinemaFacade {

    Projector projector;
    Screen screen;
    SoundSystem soundSystem;

    public void watchMovie(String movieName, AudioFormat audioFormat, int resolution, float hertzRate) {
        this.projector = new Projector(movieName);
        this.screen = new Screen(hertzRate, resolution);
        int defaultVolume = 50;
        this.soundSystem = new SoundSystem(audioFormat, defaultVolume);

        //Extra logic
        projector.start();
        screen.start();
        soundSystem.start();
    }

    public void raiseVolume(int amount) {
        this.soundSystem.raiseVolume(amount);
    }

    public void lowerVolume(int amount) {
        this.soundSystem.lowerVolume(amount);
    }
}
