import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GUITest {

    GUI gui = new GUI();

    @Test
    void loadPhilosophers() {
        Philosopher[] actualPhilosophers = gui.LoadPhilosophers();
        Philosopher[] expectedPhilosophers = {new Socrates(),new Nietzsche(), new Aquinas()};

        assertNotNull(actualPhilosophers);
        //assertArrayEquals(actualPhilosophers,expectedPhilosophers);
        assertEquals(expectedPhilosophers.length,actualPhilosophers.length);

        for (int i=0;i<expectedPhilosophers.length;i++){
            assertEquals(expectedPhilosophers[i].name,actualPhilosophers[i].name);
            assertEquals(expectedPhilosophers[i].birthday,actualPhilosophers[i].birthday);
            assertEquals(expectedPhilosophers[i].deathday,actualPhilosophers[i].deathday);
            assertEquals(expectedPhilosophers[i].quotes.size(),actualPhilosophers[i].quotes.size());

            for (int j=0; j<expectedPhilosophers[i].quotes.size(); j++){
                assertEquals(expectedPhilosophers[i].quotes.get(j),actualPhilosophers[i].quotes.get(j));
            }
        }
    }

    @Test
    void selectPhilosopher() {
        gui.SelectPhilosopher();

    }

    @Test
    void printQuote() {

    }
}