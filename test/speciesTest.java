import models.Species;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class speciesTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Species species ;
    @BeforeEach
    public void setUp() {
        species=new Species("species",180);
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void sleep(){
        species.sleep(10);
        assertEquals("species is sleeping for 10 hours",outputStreamCaptor.toString().trim());
    }
    @Test
    public void eat() {
        species.eat("meals");
        assertEquals("species is eating meals",outputStreamCaptor.toString().trim());

    }
    @Test
    public void die(){
        species.die();
        assertEquals("species is dead",outputStreamCaptor.toString().trim());
    }
    @Test
    public void getName(){
        assertEquals("species",species.getName());

    }
    @Test
    public void setName(){
        species.setName("species1");
        assertEquals("species1",species.getName());
    }
    @Test
    public void getHeight(){
        assertEquals(180,species.getHeight());

    }
    @Test
    public void setHeight(){
        species.setHeight(100);
        assertEquals(100,species.getHeight());
    }

    @Test
    public void getActive(){
        assertEquals(true,species.getActive());
    }
    @Test
    public void setActive(){
        species.setActive(false);
        assertEquals(false,species.getActive());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
