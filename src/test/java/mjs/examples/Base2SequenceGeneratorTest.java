package mjs.examples;

import core.AbstractLoggableTest;
import org.junit.Before;
import org.junit.Test;

public class Base2SequenceGeneratorTest extends AbstractLoggableTest {

    Base2SequenceGenerator generator = null;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        generator = new Base2SequenceGenerator();
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

            result = generator.generateSequence(4);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 4"));

            result = generator.generateSequence(8);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 4, 8"));

            result = generator.generateSequence(16);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 4, 8, 16"));

            result = generator.generateSequence(32);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 4, 8, 16, 32"));

            result = generator.generateSequence(64);
            System.out.println(result);
            assertTrue("Result correct: " + result, result.equals("0, 1, 2, 4, 8, 16, 32, 64"));

            System.out.println("Test complete.  Exiting.");

        } catch (Throwable e) {
            e.printStackTrace();
            assertFailed("Execution with no exceptions.  " + e.getMessage());
        } finally {
            //reportResults();         	
        }
    }

}
