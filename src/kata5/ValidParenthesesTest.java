package kata5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Replace examples and use TDD by writing your own tests

public class ValidParenthesesTest
{
  @Test
  public void sampleTest()
  {
    // assertEquals("expected", "actual");
    assertEquals(true, ValidParentheses.validParentheses("()"));
    assertEquals(false, ValidParentheses.validParentheses("())"));
    assertEquals(true, ValidParentheses.validParentheses("32423(sgsdg)"));
    assertEquals(false, ValidParentheses.validParentheses("(dsgdsg))2432"));
    assertEquals(true, ValidParentheses.validParentheses("adasdasfa"));
  }
}
