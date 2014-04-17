// $codepro.audit.disable methodShouldBeStatic
/**
 * HelloWorldTest.java
 * <p>
 * 2014 nSPARC.
 */

package com.getgnosis.javatutorials.tut0001;

import static org.junit.Assert.assertNotNull;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link com.getgnosis.javatutorials.tut0001.HelloWorld}.
 *
 * @author gnosis
 * @version 1.0.0
 *
 */
public class HelloWorldTest {

    /**
     * The {@link String} instance representing the expected system out string.
     */
    private static final String EXPECTED_SYSTEM_OUT = "Hello World!" + System.getProperty("line.separator");

    /**
     * The {@link String} instance representing the toString test value.
     */
    private static final String EXPECTED_TOSTRING = "HelloWorld []";

    /**
     * The {@link String} instance representing a failure during object construction.
     */
    private static final String CONSTRUCTION_FAIL = "Construction of Object Failed.";

    /**
     * The {@link String} instance representing a failure message indicating toString assertion failed.
     */
    private static final String TOSTRING_FAIL = "toString test failed.";

    /**
     * Test method for {@link com.getgnosis.javatutorials.tut0001.HelloWorld#HelloWorld()}.
     */
    @Test
    public final void testHelloWorld() {

        assertNotNull(CONSTRUCTION_FAIL, new HelloWorld());

    }

    /**
     * Test method for {@link com.getgnosis.javatutorials.tut0001.HelloWorld#main(java.lang.String[])}.
     *
     * @throws IOException
     *             indicates problem with IO stream creation for test.
     */
    @Test
    public final void testMain() throws IOException {

        final PrintStream currentStream = System.out; // $codepro.audit.disable unusedAssignment
        final ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        final BufferedOutputStream bufferedStream = new BufferedOutputStream(byteStream);
        final PrintStream testStream = new PrintStream(bufferedStream);

        System.setOut(testStream);

        try {

            HelloWorld.main(null);
            bufferedStream.flush();
            Assert.assertEquals(HelloWorldTest.EXPECTED_SYSTEM_OUT, byteStream.toString()); // $codepro.audit.disable
            // fieldMayHaveNullValue

        } finally {

            System.setOut(currentStream);

            if (byteStream != null) { // $codepro.audit.disable unnecessaryNullCheck
                byteStream.close();
            }
            if (bufferedStream != null) { // $codepro.audit.disable unnecessaryNullCheck
                bufferedStream.close();
            }
            if (testStream != null) { // $codepro.audit.disable unnecessaryNullCheck
                testStream.close();
            }
        }

    }

    /**
     * Test method for {@link com.getgnosis.javatutorials.tut0001.HelloWorld#toString()}.
     */
    @Test
    public final void testToString() {

        Assert.assertEquals(TOSTRING_FAIL, HelloWorldTest.EXPECTED_TOSTRING, new HelloWorld().toString());
    }

}
