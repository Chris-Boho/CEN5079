import java.io.PrintStream;

public class Prog8
{
  public static void main(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 1)
    {
      System.out.println("Usage: java Prog8 <serial code>");
      System.exit(1);
    }
    x localx = new x(paramArrayOfString[0]);
    localx.d();
  }
}

/* Location:
 * Qualified Name:     Prog8
 * Java Class Version: 1.2 (46.0)
 * JD-Core Version:    0.7.1
 */