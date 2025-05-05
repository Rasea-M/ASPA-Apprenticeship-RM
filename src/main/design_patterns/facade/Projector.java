package main.design_patterns.facade;

public class Projector {
    private String movieName;

    public Projector(String movieName) {
        this.movieName = movieName;
    }

    public void start() {
        System.out.println("Starting Projector for " + movieName);
    };

}
