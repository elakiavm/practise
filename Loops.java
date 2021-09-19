import java.util.Scanner;
public class Loops {
    public static void main(String agrs[])
    {
        int ch;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Enter the choice 1,2 or 3 :");
            ch = input.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Hello everyone have a nice day !!");
                    break;
                case 2:
                    System.out.println("Good morning !!");
                    break;
                case 3:
                    System.out.println("Good Afternoon");
                    break;
                default:
                    System.out.println("Ented choice is wrong :");

            }
            // System.out.println("Enter the num :");
            // num = input.nextInt();
        }while(ch!=3);
        // System.out.println("Number is " + num + " so program is end");
    }
    
}
