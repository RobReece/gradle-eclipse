import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        AnotherLibrary classUnderTest = new AnotherLibrary();
        assertFalse("someLibraryMethod should return 'false'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testMethod2() {
        AnotherLibrary libToTest = new AnotherLibrary();
        assertEquals("Method2 should return 'method2'", "method2", libToTest.method2());
    }
}
