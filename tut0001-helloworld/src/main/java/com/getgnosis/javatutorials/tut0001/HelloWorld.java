/**
 * HelloWorld.java
 * <p>
 * 2014 nSPARC.
 */

package com.getgnosis.javatutorials.tut0001;

/**
 * TODO Document HelloWorld.
 *
 * @author gnosis
 * @version 1.0.0
 *
 */
public final class HelloWorld {

    /**
     * The {@link String} instance representing message to be displayed.
     */
    private static final String MSG = "Hello World!";

    /**
     * Entry point for the application. This main will simple print a message to the System's output.
     *
     * @param args
     *            {@link String} array used to initialized applications.
     *            <p>
     *            No Parameters are supported.
     */
    public static void main(final String[] args) {

        System.out.println(MSG); // $codepro.audit.disable debuggingCode

    }

    /**
     * Returns the {@link String} instance representing this objects state.
     *
     * @return {@link String} instance representing this objects state.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return "HelloWorld []";

    }

}
