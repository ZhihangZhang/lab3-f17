import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class matchingTest {
    @Test
    public void test1() {
        assertEquals(true, ParenthesesMatcher.isMatched("(){}[]"));
    }
    @Test
    public void test2() {
        assertEquals(false, ParenthesesMatcher.isMatched("x"));
    }
    @Test
    public void test3() {
        assertEquals(true, ParenthesesMatcher.isMatched("()"));
    }
    @Test
    public void test4() {
        assertEquals(false, ParenthesesMatcher.isMatched(")("));

    }
    @Test
    public void test5() {
        assertEquals(false, ParenthesesMatcher.isMatched(""));
    }

}
