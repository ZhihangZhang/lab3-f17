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

    @Test
    public void test6() {
        assertEquals(true, ParenthesesMatcher.isMatched("5+6*(3-2.1)+[7-{3/2}]"));
    }

    @Test
    public void test7() {
        assertEquals(false, ParenthesesMatcher.isMatched("ab(cd}"));
    }

    @Test
    public void test8() {
        assertEquals(false, ParenthesesMatcher.isMatched("ab+(cd*{)"));
    }

    @Test
    public void test9() {
        assertEquals(true, ParenthesesMatcher.isMatched("alpha[]({!(+)[]})"));
    }

}
