package ca.valador;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StringUtilitiesTestJoshua {
    @Test
    public void testReverseByJoshua() {
        StringUtilities stringUtil = new StringUtilities();
        assertEquals("dlroWolleh", stringUtil.reverse("helloWorld"));
        assertEquals("", stringUtil.reverse(""));
        assertEquals("123", stringUtil.reverse("321"));
    }
    @Test
    public void testIsPalindomeByJoshua() {
        StringUtilities stringUtil = new StringUtilities();
        assertTrue(stringUtil.isPalindrome("12321"));
        assertTrue(stringUtil.isPalindrome("123321"));
        assertTrue(stringUtil.isPalindrome("hellolleh"));
        assertTrue(stringUtil.isPalindrome("W"));
        assertFalse(stringUtil.isPalindrome("123"));
        assertFalse(stringUtil.isPalindrome("hello"));
    }
}
