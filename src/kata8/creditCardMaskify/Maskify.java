package kata8.creditCardMaskify;

public class Maskify
{

  private static final String VALUE_FOR_REPLACE = "#";

  public static String maskify(String str)
  {
    String valueToReturn = str;

    if (str == null)
    {
      throw new UnsupportedOperationException("Unimplemented");
    }

    if (str.length() > 4)
    {
      StringBuilder valueToAdd = new StringBuilder();
      for (int i = 0; i < str.length() - 4; i++)
      {
        valueToAdd.append(VALUE_FOR_REPLACE);
      }

      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder.replace(0, str.length() - 4, valueToAdd.toString());
      valueToReturn = stringBuilder.toString();
    }

    return valueToReturn;

  }
}
