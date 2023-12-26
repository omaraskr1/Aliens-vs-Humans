import models.Align;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class alignTest {
    private final PrintStream out=System.out;
    private final ByteArrayOutputStream outputStreamCaptor=new ByteArrayOutputStream();
    Align align;
    @BeforeEach
    public void setUp() {
        align=new Align("align",180,"fly");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void useSuperPowerTest(){
        align.useSuperPower();
        assertEquals("align uses fly",outputStreamCaptor.toString().trim());
    }
    @Test
    public void getSuperPowerTest(){
        assertEquals("fly",align.getSuperPower());
    }
    @Test
    public void setSuperPowerTest(){
        align.setSuperPower("run");
        assertEquals("run",align.getSuperPower());
    }
    @AfterEach
    public void tearDown(){
        System.setOut(out);
    }
}
