package main.design_patterns.facade;

public class Screen {
    private final float hertzRate;
    private final int resolution;

    public Screen(float hertzRate, int resolution) {
        this.hertzRate = hertzRate;
        this.resolution = resolution;
    }

    public void start() {
        System.out.println("Screen is displaying at " + resolution + "p@" + hertzRate + "hz");
    };
}
