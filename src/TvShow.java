import java.util.ArrayList;


public class TvShow extends Media {
    private int seasons;
    private int episodes;

    public TvShow(String title, String rating, Director director, ArrayList<Actor> cast, int seasons, int episodes) {
        super(title, rating, director, cast);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    // Getters and Setters
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    // Override toString method
    @Override
    public String toString() {
        return "TV Show Title: " + getTitle() +
                "\nSeasons: " + seasons +
                "\nEpisodes: " + episodes +
                "\nRating: " + getRating();
    }
}



