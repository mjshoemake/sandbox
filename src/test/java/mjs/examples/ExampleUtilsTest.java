package mjs.examples;

import core.AbstractLoggableTest;
import org.junit.Before;
import org.junit.Test;
import java.util.StringJoiner;

public class ExampleUtilsTest extends AbstractLoggableTest {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Test method.
     */
    @Test
    public void testReplace() {

        try {
            String result1 = ExampleUtils.replaceChar("This is my test string.", 'i', 'I');
        	System.out.println(result1);
            assertTrue("Result correct: " + result1, result1.equals("ThIs Is my test strIng."));

            String result2 = ExampleUtils.replaceChar2("This is my test string.", 'i', 'I');
            System.out.println(result2);
            assertTrue("Result correct: " + result2, result2.equals(result1));

            StringBuilder builder = new StringBuilder();
            ExampleUtils.replaceChar3(builder, "This is my test string.", 'i', 'I', 0);
            System.out.println(builder.toString());
            assertTrue("Result correct: " + builder.toString(), builder.toString().equals(result1));

            System.out.println("Test complete.  Exiting.");

        } catch (Throwable e) {
            e.printStackTrace();
            assertFailed("Execution with no exceptions.  " + e.getMessage());
        } finally {
            //reportResults();         	
        }
    }

    public void testIsPrime() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i=1; i <= 1000; i++) {
            if (ExampleUtils.isPrime(i)) {
               joiner.add(i+"");
            }
        }
        System.out.println("Prime numbers: " + joiner.toString());
    }

}
