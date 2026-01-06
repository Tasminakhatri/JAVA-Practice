class Logical
{
    public static void main (String args[])
    {
      int x = 7;
      int y = 5;

      float a = 6.7f;
      float b = 8.5f;

      boolean result = !(x > y || a > b);

      System.out.println(result);  
    }
}