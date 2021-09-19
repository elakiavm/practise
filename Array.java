import java.util.Scanner;
public class Array {

    public static void main(String agrs[])
    {
        int n , ar[] ;
        ar = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = input.nextInt();

        System.out.println("Enter the array elemnets :");
        for(int i=0;i<n;i++){
            ar[i] = input.nextInt();
        }
       
        for(int i=0;i<n;i++){
            System.out.println("Enter the array elemnets :" + ar[i]);
        }

    }
    
}
