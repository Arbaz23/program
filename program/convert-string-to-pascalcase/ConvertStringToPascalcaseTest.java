import static org.junit.Assert.*;
import org.junit.*;

public class ConvertStringToPascalcaseTest {

    ConvertStringToPascalcase pC = new ConvertStringToPascalcase();

    @Test
    public void testToTitleCaseTrue() {
        String a = "Toto";
        String b = pC.toTitleCase("toto");
        assertEquals(a, b);
    }

    @Test
    public void testToTitleCaseFalse() {
        String a = "toto";
        String b = pC.toTitleCase("toto");
        assertTrue(a != b);
    }

}