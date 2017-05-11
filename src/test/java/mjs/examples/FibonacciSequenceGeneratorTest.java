package mjs.examples;

import core.AbstractLoggableTest;
import org.junit.Before;
import org.junit.Test;

public class FibonacciSequenceGeneratorTest extends AbstractLoggableTest {

    FibonacciSequenceGenerator generator = null;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        generator = new FibonacciSequenceGenerator();
    }

    /**
     * Test method.
     */
    @Test
    public void testGenerateSeqence() {

        try {
            String result = generator.generateSequence(0);
        	System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0"));

            result = generator.generateSequence(1);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1"));

            result = generator.generateSequence(2);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2"));

            result = generator.generateSequence(3);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 3"));

            result = generator.generateSequence(5);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 3, 5"));

            result = generator.generateSequence(8);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 3, 5, 8"));

            result = generator.generateSequence(13);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 3, 5, 8, 13"));

            result = generator.generateSequence(21);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 3, 5, 8, 13, 21"));

            System.out.println("Test complete.  Exiting.");

        } catch (Throwable e) {
            e.printStackTrace();
            assertFailed("Execution with no exceptions.  " + e.getMessage());
        } finally {
            //reportResults();         	
        }
    }

}
