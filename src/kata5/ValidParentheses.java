package kata5;

import java.util.LinkedList;
import java.util.Queue;

public class ValidParentheses
{

  /** Open parenthesis. */
  protected static final Character PARENTHESIS_OPEN = '(';
  /** Close parenthesis. */
  protected static final Character PARENTHESIS_CLOSE = ')';

  /**
   * Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
   * 
   * @param parens
   *          Value to analyse.
   * @return True is the string is valid.
   */
  public static boolean validParentheses(String parens)
  {

    boolean valueToReturn = true;

    Queue<Character> openQueue = new LinkedList<>();

    // Parcours de l'ensemble des charactères données on ajoute une donnée à chaque parenthèse ouvrante et on en
    // supprime une à chaque parenthèse fermante
    // Si on remarque une présence suppérieure de parenthèse fermante on arrête le parcours et on renvoie false.
    for (Character currentCharacter : parens.toCharArray())
    {
      if (PARENTHESIS_OPEN.equals(currentCharacter))
      {
        openQueue.offer(currentCharacter);
      }
      else if (PARENTHESIS_CLOSE.equals(currentCharacter))
      {
        if (openQueue.poll() == null)
        {
          valueToReturn = false;
          break;
        }
      }
    }

    // Si on remarque la présence de parenthèse ouvrante on renvoie false.
    if (valueToReturn && openQueue.size() > 0)
    {
      valueToReturn = false;
    }

    return valueToReturn;
  }
}
