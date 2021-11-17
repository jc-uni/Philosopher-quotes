import java.util.Random;
import java.util.Scanner;

public class GUI {
    Philosopher[] philosophers = LoadPhilosophers();

    public GUI(){
        int selectedPhilosopherIndex = SelectPhilosopher();
        PrintQuote(selectedPhilosopherIndex);
    }

    public Philosopher[] LoadPhilosophers(){
        return new Philosopher[]{new Socrates(), new Nietzsche(), new Aquinas()};
    }

    public int SelectPhilosopher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a philosopher:");
        for(int i=0;i< philosophers.length;i++){
            System.out.println("Press " +(i+1) +" for " +philosophers[i].name);
        }
        if(scanner.hasNextLine())
            return (Integer.parseInt(scanner.nextLine())-1);
        else return 0;
    }
    public void PrintQuote(int index){
        Random rng = new Random();
        System.out.println(philosophers[index].name +" (born " +philosophers[index].birthday +", died " +philosophers[index].deathday +")"
                +" was a great philosopher with memorable quotes, such as:\r\n" +"'" +philosophers[index].quotes.get(rng.nextInt(3)) +"'");
    }
}
