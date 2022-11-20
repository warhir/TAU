import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringOperationsTests {
    private StringOperations checker;

    @BeforeEach
    public void initEach(){
        checker = new StringOperations();
    }

    @Test
    public void checkReverseString() {
        assertEquals("olsezrk", checker.reverse("krzeslo"));
    }

    @Test
    public void checkReverseWithNumberString() {
        assertEquals("5lots", checker.reverse("stol5"));
    }

    @Test
    public void checkConcatString() {
        assertEquals("nowydom", checker.concat("nowy", "dom"));
    }

    @Test
    public void checkConcatStringNumberstring() {
        assertEquals("nowy2", checker.concat("nowy", "2"));
    }

    @Test
    public void checkIsPalindromeString() {
        assertEquals(true, checker.isPalindrome("kajak"));
    }

    @Test
    public void checkIsNotPalindromeString() {
        assertEquals(false, checker.isPalindrome("kaja"));
    }
}
