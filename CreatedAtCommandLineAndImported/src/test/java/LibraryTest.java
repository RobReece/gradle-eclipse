import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        AnotherLibrary classUnderTest = new AnotherLibrary();
        assertFalse("someLibraryMethod should return 'false'", classUnderTest.method1());
    }
}
