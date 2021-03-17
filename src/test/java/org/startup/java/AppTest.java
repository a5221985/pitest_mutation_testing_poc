package org.startup.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void whenPalyndrome_thenAccept() {
        App palyndromeTester = new App();
        assertTrue(palyndromeTester.isPalyndrome("noon"));
    }

    @Test
    public void whenNearPalyndrome_thenReject() {
        App palyndromeTester = new App();
        assertFalse(palyndromeTester.isPalyndrome("neon"));
    }
}
