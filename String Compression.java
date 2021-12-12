import java.io.*;
import java.util.*;

public class Main {

  public static String compression1(String str)
  {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++)
    {
      if (i == 0 || str.charAt(i) != str.charAt(i - 1))
      {
        //First occurence
        //append the char
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static String compression2(String str)
  {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for (int i = 0; i < str.length(); i++)
    {
      if ((i == 0) || (str.charAt(i) != str.charAt(i - 1)))
      {
        if (count > 1 && i > 0)
          sb.append(count);
        sb.append(str.charAt(i));
        count = 1;
      }
      else
      {
        count++;
      }
    }
    if (count > 1)
      sb.append(count);
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
}
