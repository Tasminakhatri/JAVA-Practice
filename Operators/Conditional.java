class Conditional
{
    public static void main(String args[])
    {
        //if else

        // int x = 8;

        // if(x>10)
        // System.out.println("hello");

        // else
        // System.out.println("bye");

        // boolean isLightOn = false;

        // if (isLightOn) {
        // System.out.println("The light is on.");  // This will not be printed
        // }
    
        // System.out.println("This line always runs.");

        //if else if

        // int time = 14;
        // if(time < 10)
        // {
        //     System.out.println("Good morning");
        // }
        // else if (time > 18)
        // {
        //     System.out.println("Good afternoon");  
        // }else 
        // {
        //     System.out.println("Good evening");
        // }

        // int x = 8;
        // int y = 7;
        // int z = 9;

        // if(x>y && x>z)
        //    System.out.println(x);
        // else if(y>z)
        //    System.out.println(y);
        // else
        //    System.out.println(z);
        


        //short hand if else


        // int time = 20;
        // String result = (time < 18) ? "Good day" : "Good evening" ;
        // System.out.println(result);

        //Nested If

        // int x = 15;
        // int y = 25;
        // if(x>10){
        //     System.out.println("x is greater than 10");
        // }

        // if(y>20){
        //     System.out.println("y is also greater than 20");
        // }


        int age = 20;
        boolean isCitizen = true;

        if(age>=20)
        {
            System.out.println("old enough to vote");

            if(isCitizen){
                System.out.println("and you are a citizen, so you can vote");
            }else{
                System.out.println("Not a citizen to vote");
            }
        }else{
            System.out.println("not old enough to vote");
        }


    }
}