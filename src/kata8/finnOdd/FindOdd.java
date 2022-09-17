package kata8.finnOdd;

import java.util.HashMap;

public class FindOdd
{

  private static final int START_VALUE = 1;

//  public static int findIt(int[] A)
//  {
//    int xor = 0;
//    for (int i = 0; i < A.length; i++)
//    {
//      xor ^= A[i];
//    }
//    return xor;
//  }

  public static int findIt(int[] a)
  {
    HashMap<Integer, Integer> filterList = new HashMap<>();

    int valueToReturn = 0;

    for (int currentValue : a)
    {
      if (filterList.containsKey(currentValue))
      {
        int count = filterList.get(currentValue);
        filterList.replace(currentValue, ++count);
      }
      else
      {
        filterList.put(currentValue, START_VALUE);
      }
    }

    for (int currentKey : filterList.keySet())
    {
      int currentValue = filterList.get(currentKey);
      if (currentValue % 2 != 0)
      {
        valueToReturn = currentKey;
      }
    }

    return valueToReturn;
  }
}
