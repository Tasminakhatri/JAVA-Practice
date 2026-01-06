class Arithmatic
{
    public static void main(String args[])
    {
        int num1 = 7;
        int num2 = 7;
        int num3 = 7;
        int num4 = 7;
        //int num2 = 5;

        //int result = num1 + num2;

        // num1 += 2;

        num1++;  
        ++num2;  

        System.out.println(num1);
        System.out.println(num2);

        int result1 = num3++;  // fetch the value and then increment
        int result2 = ++num4;  // increment and fetch the value
    
        System.out.println(result1);
        System.out.println(result2);

    }
}