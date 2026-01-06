import java.util.Arrays;
class array
{
    public static void main(String args[])
    {
        String[] fruits = {"mango","apple","orange"};
        //System.out.println(Arrays.toString(fruits));

        for (String fruit:fruits)                   //for each loop
        {
            System.out.println("fruit" + fruit);
        }
        // for (int i=0; i<fruits.length; i++)
        // {
        //  System.out.println(fruits[i]);
        // }

        fruits[1]="kiwi";

        System.out.println("Length of array: " + fruits.length);

        System.out.println("fruit :" + fruits[2]);
    }
}