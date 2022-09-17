package kata8.digPow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigPow

{

  public static long digPow(int n, int p)
  {

    String intString = String.valueOf(n);
    long sum = 0;
    for (int i = 0; i < intString.length(); ++i, ++p)
      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
    return (sum % n == 0) ? sum / n : -1;
  }

//    // On récupère chaque digits
//    List<Integer> numbers = getDigits(n);
//
//    int total = getTotal(p, numbers);
//
//    // On vérifie que la division est un entier naturelle positif
//    int valueToReturn = getPosiftifDivider(n, total);
//
//    return valueToReturn;
//  }

  private static int getPosiftifDivider(int n, int total)
  {
    int valueToReturn = -1;

    int r = total % n;

    if (r == 0)
    {
      valueToReturn = total / n;
    }

    return valueToReturn;
  }

  private static int getTotal(int p, List<Integer> numbers)
  {
    int count = p;

    int total = 0;

    for (int currentValue : numbers)
    {

      int val = (int) Math.pow(currentValue, count);
      total = total + val;

      count++;
    }
    return total;
  }

  private static List<Integer> getDigits(int n)
  {
    List<Integer> numbers = new ArrayList<>();

    Integer copyNumber = n;

    while (copyNumber > 0)
    {
      numbers.add(copyNumber % 10);
      copyNumber = copyNumber / 10;

    }

    Collections.reverse(numbers);

    return numbers;
  }
}
