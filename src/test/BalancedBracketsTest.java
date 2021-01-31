package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void ReturnsFalseWithCloseBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void ReturnsFalseWithOpenBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void ReturnsFalseWithBackwardsBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void ReturnsTrueWithLetters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[code]"));
    }


    @Test
    public void ReturnsTrueWithLettersMultiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[code][alot]"));
    }


    @Test
    public void ReturnsTrueWithEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void ReturnsFalseWithBackwardsBracketLetters() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]dfgf["));
    }

    @Test
    public void ReturnsFalseWithCloseBracketLetters() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[code"));
    }

    @Test
    public void ReturnsFalseWithOpenBracketLetters() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("code["));
    }

    @Test
    public void ReturnsFalseWithMisNest() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[code]]"));
    }
}
