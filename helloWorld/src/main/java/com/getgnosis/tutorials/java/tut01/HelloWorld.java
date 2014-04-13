/**
 * HelloWorld.java
 * 2014 GetGnosis.
 */
package com.getgnosis.tutorials.java.tut01;

/**
 * This is a Hello World Example that includes so real world production level
 * coding examples.
 *
 * @author gnosis
 * @version 1.0.0 Apr 12, 2014
 *
 */
public final class HelloWorld {

  /**
   * The {@link String} instance representing the message to be displayed.
   */
  private static final String HELLO_MESSAGE = "Hello World!";

  /**
   * Empty default constructor.
   */
  public HelloWorld() {
  }

  /**
   * The applications entry point.  Performs the task of printing the message
   * "Hello World!" to the systems output display.
   *
   * @param args  the {@link String} array of arguments to this application.
   */
  public static void main(final String[] args) {

    System.out.println(HELLO_MESSAGE); // $codepro.audit.disable debuggingCode
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
    return String.format("HelloWorld []"); //$NON-NLS-1$
  }

}
