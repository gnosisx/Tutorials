/**
 * AdvancedHelloWorldTest.java
 * 2014 GetGnosis.com
 */
package com.getgnosis.tutorials.tutorial01001;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 *  Test Class for 
 *  {@link com.getgnosis.tutorials.tutorial01001.AdvancedHelloWorld}
 *
 * @author mhemphill
 * @version 1.0.0 - Mar 9, 2014
 */
public class AdvancedHelloWorldTest {

	/**
	 * Test method for 
	 * {@link com.getgnosis.tutorials.tutorial01001.AdvancedHelloWorld
	 * 	#AdvancedHelloWorld()}.
	 */
	@Test
	public void testAdvancedHelloWorld() {
			new AdvancedHelloWorld();
	}

	/**
	 * Test method for 
	 * {@link com.getgnosis.tutorials.tutorial01001.AdvancedHelloWorld
	 * 		#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		
		final String expected = "Hello World!" + System.getProperty("line.separator");
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
	    
	    try {	
	    	System.setOut(new PrintStream(outContent));
	    	AdvancedHelloWorld.main(null);
	    	assertEquals(expected, outContent.toString());
	    } catch (Exception e) {
	    	fail(e.toString());
	    } finally {
	    	System.setOut(null);	
	    }
	}

	/**
	 * Test method for 
	 * {@link com.getgnosis.tutorials.tutorial01001.AdvancedHelloWorld
	 * 		#toString()}.
	 */
	@Test
	public void testToString() {
		String helloWorldString =  new AdvancedHelloWorld().toString();
		assertEquals("AdvancedHelloWorld [message=Hello World!]",helloWorldString);
	}

}
