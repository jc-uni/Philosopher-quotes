import java.util.List;

public class Aquinas extends Philosopher{
    public Aquinas(){
        name = "Thomas Aquinas";
        quotes.addAll(0, List.of(new String[]{"If the highest aim of a captain were to preserve his ship, he would keep it in port forever."
                ,"Beware the man of a single book."
                ,"The things that we love tell us what we are."}));
        birthday = "1225";
        deathday = "1274-3-7";
    }
}
