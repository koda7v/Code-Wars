package kata6;

import java.util.Arrays;
import java.util.List;

public class SpinWords
{

  /** Character use to separate each word. */
  private static final String SEPARATOR = " ";

  public String spinWords(String sentence)
  {

    // Recovery of the first words in the sentence.
    List<String> words = Arrays.asList(sentence.split(SEPARATOR));

    // Inversion of words longer than 5
    for (int index = 0; index < words.size(); index++)
    {

      String currentString = words.get(index);
      StringBuilder toReverse = new StringBuilder(currentString);
      if (currentString.length() >= 5)
      {
        toReverse.reverse();
        words.set(index, toReverse.toString());
      }
    }

    return String.join(SEPARATOR, words);

  }
}