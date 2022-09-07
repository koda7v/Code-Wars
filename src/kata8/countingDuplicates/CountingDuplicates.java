package kata8.countingDuplicates;

import java.util.HashMap;

public class CountingDuplicates
{

  private static final int DEFAULT_INITIAL_VALUE = 1;

  /**
   * Count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input
   * string
   * 
   * @param text
   *          The text to scan.
   * @return
   */
  public static int duplicateCount(String text)
  {

    int valueToReturn = 0;

    HashMap<Character, Integer> mapOfCounting = getCountOfAllCharacters(text);

    for (Character currentChar : mapOfCounting.keySet())
    {
      if (mapOfCounting.get(currentChar) > 1)
      {
        valueToReturn++;
      }
    }
    return valueToReturn;

  }

  /**
   * Count the number of each iteration present in the text.
   * 
   * @param text
   *          The text to scan.
   * @return A collection with all character.
   */
  private static HashMap<Character, Integer> getCountOfAllCharacters(String text)
  {
    HashMap<Character, Integer> mapOfCounting = new HashMap<>();

    for (Character currentChar : text.toCharArray())
    {

      currentChar = Character.toLowerCase(currentChar);

      if (mapOfCounting.containsKey(currentChar))
      {
        int nbOfChar = mapOfCounting.get(currentChar);
        mapOfCounting.replace(currentChar, ++nbOfChar);
      }
      else
      {
        mapOfCounting.put(currentChar, DEFAULT_INITIAL_VALUE);
      }
    }
    return mapOfCounting;
  }
}
