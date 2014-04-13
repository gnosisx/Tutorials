/**
 * HelloWorldTest.java
 * 2014 GetGnosis.
 */
package com.getgnosis.tutorials.java.tut01;

import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream; 
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Test class for {@link com.getgnosis.tutorials.java.tut01.HelloWorld}.
 * 
 * @author gnosis
 * @version 0.0.1 Apr 12, 2014
 * 
 */
public class HelloWorldTest {
  
  /**
   * The {@link String} instance representing an error message to be displayed
   * when the main methed fails to match the expected results..
   */
  private static final String ERR_MAIN_MATCH = 
      "Hello World main method system print didn't match";
  
  /**
   * The {@link String} instance representing an error message to be displayed
   * when the toString method fails to match expected results.
   */
  private static final String ERR_TOSTRING_MATCH = 
      "Hello World toString didnt match the expected result.";
  
  /**
   * The {@link String} instance representing a match for the expeted results
   * of the main methods output.
   */
  private static final String MATCH_MAIN = 
      "Hello World!" + System.getProperty("line.separator"); // $codepro.audit.disable disallowStringConcatenation
  
  /**
   * The {@link String} instance representing the expected match result of the
   * toString methods return string.
   */
  private static final String MATCH_TOSTRING = "HelloWorld []";
  
  /**
   * Empty default constructor.
   */
  public HelloWorldTest() {
  }
  
  /**
   * Test method for
   * {@link com.getgnosis.tutorials.java.tut01.HelloWorld #HelloWorld()}.
   */
  @Test
  public final void testHelloWorld() { 
    new HelloWorld();
  }

  /**
   * Test method for
   * {@link com.getgnosis.tutorials.java.tut01.HelloWorld 
   *  #main(java.lang.String[])}.
   * 
   * @throws IOException
   */
  @Test
  public final void testMain() throws IOException {

    final PrintStream currentStream = System.out;  
    ByteArrayOutputStream byteStream = null;
    BufferedOutputStream bufferedOutputStream = null;
    PrintStream testingStream = null; 

    try {
      byteStream = new ByteArrayOutputStream();
      bufferedOutputStream = new BufferedOutputStream(byteStream);
      testingStream = new PrintStream(bufferedOutputStream);

      System.setOut(testingStream);
      HelloWorld.main(null);
      bufferedOutputStream.flush();
      assertEquals(ERR_MAIN_MATCH, MATCH_MAIN, byteStream.toString()); // $codepro.audit.disable fieldMayHaveNullValue
    } finally {
      System.setOut(currentStream);
      
      if (byteStream != null) {
        byteStream.close();
      }
      
      if (bufferedOutputStream != null) {
        bufferedOutputStream.close();
      }
      
      if (testingStream != null) {
        testingStream.close();
      }
    }

  }

  /**
   * Test method for
   * {@link com.getgnosis.tutorials.java.tut01.HelloWorld #toString()}.
   */
  @Test
  public final void testToString() {
    assertEquals(ERR_TOSTRING_MATCH, MATCH_TOSTRING, 
                 new HelloWorld().toString());
  }

  /**
   * Returns the {@link String} representation of the object.
   * 
   * @return string  {@link String} representation of the object.
   * 
   * @see java.lang.Object#toString() 
   */
  @Override
  public String toString() {
    return String.format("HelloWorldTest []"); //$NON-NLS-1$
  }

}
