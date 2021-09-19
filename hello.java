import java.util.Scanner;
public class hello {
    public static void main (String [] agrs)
    {
        int myNumber = 15;
        short myShort = 123;
        long myPhone = 9361721 ;

        double myDouble =12.3453 ;
        float myFloat =123.342423f ;
        char myChar ='E';
        boolean myBoolean =  myNumber> 10 ;
        byte pin = 12 ;     
        String text = "cat";

        String name = "Elakia" ;
        boolean j = 2>10;
        
        String line;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the line of text :");
        line = input.nextLine();
        System.out.println("You ented text is : " + line);

        System.out.println("Enter the number ");
        myNumber =input.nextInt();
        System.out.println("You ented text is : " + myNumber);

        System.out.println("long int number " );
        myPhone = input.nextLong();
        System.out.println("You ented text is : " + myPhone);

        System.out.println("short int number "  );
        myShort =input.nextShort();
        System.out.println("You ented text is : " + myShort);

        System.out.println("double number ");
        myDouble = input.nextDouble();
        System.out.println("You ented text is : " + myDouble);

        System.out.println("float number ");
        myFloat = input.nextFloat();
        System.out.println("You ented text is : "  + myFloat);

        System.out.println("charater " );
        myChar = input.next().charAt(0);
        System.out.println("You ented text is : "+ myChar );

        System.out.println("Boolean" );
        myBoolean = input.nextBoolean();
        System.out.println("You ented text is : "+ myBoolean);

        System.out.println("pin number");
        pin = input.nextByte();
        System.out.println("You ented text is : " + pin);

        // System.out.println("string " + text);
        // System.out.println("My name is " + name + " Good morning");

        while(true)
        {
            System.out.println("RESULT OF THE NUMBER : " + myNumber);

            if(myNumber != 10){
                System.out.println("Finally out of the While loop");
                break;
            }

            myNumber --;
            System.out.println("Finally out of the While loop " + text);
        }
        for(int i=0;i<5;i++)
        {
            System.out.printf("This is value of i %d \n",i);

        }
        if(j)
        {
            System.out.println("Ented condition is :" + j);
        }
        else{
            System.out.println("Ented condition is " + j);
        }
    }

}
