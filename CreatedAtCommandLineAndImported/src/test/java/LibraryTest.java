import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertFalse("someLibraryMethod should return 'false'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testMethod2() {
        Library libToTest = new Library();
        assertEquals("Method2 should return 'method2'", "method2", libToTest.method2());
    }
}
