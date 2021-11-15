import java.util.List;

public class Nietzsche extends Philosopher{
    public Nietzsche(){
        name = "Friedrich Nietzsche";
        quotes.addAll(0, List.of(new String[]{"In heaven, all the interesting people are missing."
                ,"That which does not kill us makes us stronger."
                ,"Follow my Soundcloud"}));
        birthday = "1844-10-15";
        deathday = "1900-8-25";
    }
}
