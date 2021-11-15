import java.util.Random;
import java.util.Scanner;

public class GUI {
    Philosopher[] philosophers = LoadPhilosophers();
    Scanner scanner = new Scanner(System.in);
    Random rng = new Random();

    public GUI(){
        int selectedPhilosopherIndex = SelectPhilosopher();
        PrintQuote(selectedPhilosopherIndex);
    }

    public Philosopher[] LoadPhilosophers(){
        return new Philosopher[]{new Socrates(),new Nietzsche(),new Aquinas()};
    }

    public int SelectPhilosopher(){
        System.out.println("Select a philosopher:");
        for(int i=0;i< philosophers.length;i++){
            System.out.println("Press " +(i+1) +" for " +philosophers[i].name);
        }
        return (Integer.parseInt(scanner.nextLine())-1);
    }
    public void PrintQuote(int index){
        System.out.println(philosophers[index].name +" was a great philosopher with memorable quotes, such as:\r\n"
                +"'" +philosophers[index].quotes.get(rng.nextInt(3)) +"'");
    }
}
