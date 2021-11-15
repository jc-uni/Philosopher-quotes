import java.util.List;

public class Socrates extends Philosopher{

    public Socrates(){
        name = "Sokrates";
        quotes.addAll(0, List.of(new String[]{"The only true wisdom is in knowing you know nothing."
                , "The unexamined life is not worth living."
                , "Buy my mixtape"}));
        birthday = "ca. 470 BC";
        deathday = "399 BC";
    }
}
