<<<<<<< HEAD
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a director
        Director director = new Director("Billy Bob", 50);

        // Create actors
        ArrayList<Actor> cast = new ArrayList<>();
        cast.add(new Actor("Tuck Wilson", 46));
        cast.add(new Actor("Gordon Jewitt", 40));

        // Create a Movie instance
        Movie movie = new Movie("Reception", "PG-13", director, cast, 148, "A thief steals tbe secret Diamond.", 829.89);

        // Create a TvShow instance
        TvShow tvShow = new TvShow("Tooth Fairy", "MA", director, cast, 5, 62);
        // Print details for Movie using toString()
        System.out.println(movie);

        // Print details for TvShow using toString()
        System.out.println(tvShow);
    }
}
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int calculateCrimeRisk() {

        int crimeRisk = 20;

        return crimeRisk;

    }

    public static int calculateEarthquakeRisk() {

        int earthquakeRisk = 20;

        return earthquakeRisk;
    }

    public static int calculateFloodRisk() {



        int floodRisk = 20;

        return floodRisk;

    }

    public static int totalCalculatedRisk() {
    
        int sumOfRisks = calculateCrimeRisk() + calculateFloodRisk() + calculateEarthquakeRisk();
        return sumOfRisks;

    }
    public static void main(String[] args) {

        System.out.println(totalCalculatedRisk());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
>>>>>>> origin/master
