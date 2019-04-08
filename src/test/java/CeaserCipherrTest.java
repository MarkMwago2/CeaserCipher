import org.junit.*;
import static org.junit.Assert.*;


public class CeaserCipherrTest {

    @Test
    public void runCaeserCipherr() {
        CeaserCipherr ifInputIsString = new CeaserCipherr();
        assertEquals("fdu" , ifInputIsString.runCeaserCipherr("car", 3));



    }
}