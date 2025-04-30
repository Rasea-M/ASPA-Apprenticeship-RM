package Tests.Optionals;

import Practicas.Optionals.OptionalsMain;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

public class GetStringLengthTests {
    @Test
    public void parseStringLengthSpaces() {
        Assertions.assertEquals(2, OptionalsMain.getStringLength(Optional.of("  ")));
    }
    @Test
    public void parseStringLengthEmpty() {
        assertEquals(0, OptionalsMain.getStringLength(Optional.of("")));
    }
    @Test
    public void parseStringLengthNormal() {
        assertEquals(6, OptionalsMain.getStringLength(Optional.of("Normal")));
    }
    @Test
    public void parseStringLengthQuest() {
        assertEquals(0, OptionalsMain.getStringLength(Optional.empty()));
    }
    //Is this necessary?
//    @Test
//    public void parseStringLengthNull() {
//        assertEquals(0, OptionalsMain.getStringLength(null));
//    }
}
