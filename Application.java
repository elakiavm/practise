
import java.util.Scanner;
import java.util.Arrays;
public class Application
{
	public static void main(String[] args) {
	    String line,first,second ;
	 
	    Scanner input =new Scanner(System.in);
        System.out.println("String: " );
        line = input.nextLine();
        
	    int length = line.length();
        System.out.println("Length: " + length);
        
        System.out.println("first String: " );
        first = input.nextLine();
        
        System.out.println("second String: " );
        second = input.nextLine();
        
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
        
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        boolean result2 = first.equals(line.);
        System.out.println("Strings first and second are equal: " + result2);
        
        System.out.println(line.toLowerCase());
        
        System.out.println(line.toUpperCase());
         
        System.out.println("Enter the String with numbers: " );
        line = input.nextLine();

        // regex for sequence of digits
        String regex = "\\d+";
    
        // replace all occurrences of numeric
        // digits by a space
        System.out.println(line.replaceAll(regex, " "));
        
        System.out.println("Enter the String with :: = " );
        line = input.nextLine();

        String[] result = line.split("::");
        
        System.out.println("result = " + Arrays.toString(result));
        
        System.out.println(line.startsWith("h")); 
        
        System.out.println(line.endsWith("g")); 
	}
}
