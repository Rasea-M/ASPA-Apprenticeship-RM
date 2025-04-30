package Tests.Optionals;

import Practicas.Optionals.OptionalsMain;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

public class ParseIntegerTests {

    @Test
    public void parseIntegerValid() {
        assertEquals(Optional.of(1234), OptionalsMain.parseInteger("1234"));
    }
    @Test
    public void parseIntegerLong() {
        assertEquals(Optional.empty(), OptionalsMain.parseInteger("1246583049576812143576345"));
    }
    @Test
    public void parseIntegerFloat() {
        assertNotNull(OptionalsMain.parseInteger("1.1565"));
    }
    @Test
    public void parseIntegerStringNotNull() {
        assertNotNull(OptionalsMain.parseInteger("asd"));
    }
    @Test
    public void parseIntegerNull() {
        assertEquals(Optional.empty(), OptionalsMain.parseInteger(null));
    }
    @Test
    public void parseIntegerEmpty() {
        assertNotNull(OptionalsMain.parseInteger(""));
    }
    @Test
    public void parseIntegerSpace() {
        assertNotNull(OptionalsMain.parseInteger(" "));
    }
}
