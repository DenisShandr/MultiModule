import junit.framework.TestCase;

public class SomeClassTest extends TestCase {

    public void testTestSetName() {
        SomeClass someClass = new SomeClass();
        someClass.setName("Test Name");
        assertEquals("Test Name", someClass.getName());
    }
}