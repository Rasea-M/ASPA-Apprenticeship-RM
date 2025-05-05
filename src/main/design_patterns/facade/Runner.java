package main.design_patterns.facade;

public class Runner {
    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();
        cinemaFacade.watchMovie(
                "Shrek",
                AudioFormat.FIVE_POINT_ONE,
                1080,
                59.94F);
    }
}
