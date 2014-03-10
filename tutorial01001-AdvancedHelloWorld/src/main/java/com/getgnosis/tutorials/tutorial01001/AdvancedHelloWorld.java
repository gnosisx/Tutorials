/**
 * AdvancedHelloWorld.java
 * 2014 GetGnosis.com 
 */
package com.getgnosis.tutorials.tutorial01001;

/**
 * This is an example program that prints the {@link String} "Hello World!" to
 * the system's output display.
 *
 * @author mhemphill
 * @version 1.0.0 - Mar 9, 2014
 */
public class AdvancedHelloWorld {
	
	private final static String message = "Hello World!";	
	
	public AdvancedHelloWorld() {}

	/**
	 * The application entry point.  Creates a new instance of
	 * {@link AdvancedHelloWorld} and prints the value of the {@link String}
	 * message to the system's output display.
	 *  
	 * @param args - @{link String} array representing the arguments to the
	 * application.  Not used in this application.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(new AdvancedHelloWorld().getMessage());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdvancedHelloWorld [");
		if (getMessage() != null)
			builder.append("message=").append(getMessage());
		builder.append("]");
		return builder.toString();
	}

	private final String getMessage() {
		return message;
	}

}
