import models.Human;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class humanTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Human human;

    @BeforeEach
    public void beforeEach() {
        human = new Human("human", 180, "male");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void speackTest() {
        human.speack("hello World");
        assertEquals("human says: hello World", outputStreamCaptor.toString().trim());
    }
    @Test
    public void getSexTest() {

        assertEquals("male", human.getSex());
    }

    @Test
    public void setSexTest() {
        human.setSex("female");
        assertEquals("female", human.getSex());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
