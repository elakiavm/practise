import java.util.Scanner;

public class ElectricityBill1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int ch,bn;	
		String str;
		float current,previous;
		float total = 0;
		sc = new Scanner(System.in);

		System.out.println("\nEnter the consumer name : ");
       	str = sc.nextLine();

		System.out.print ("\n\t Enter consumer number  ");
		bn = sc.nextInt();

		System.out.println("\n1.Domestic \n2.Commerical");
		System.out.println("\nENTER THE OPTION : ");
		ch = sc.nextInt();

		

		System.out.print ("\n\t Enter previous month reading  ");
		previous= sc.nextFloat();
		System.out.print ("\n\t Enter current month reading  ");
		current= sc.nextFloat();

		float Units = current - previous;

		switch(ch)
		{  
			case 1: 
			System.out.println("\n\nDOMESTIC CONNECTION ELECTRICITY BILL"); 
			if (Units <= 100){
				total = Units * 1.0F;
			}
			else if ((Units >= 101) && (Units <= 200)) {
				total = Units * 2.50F;
			}
			else if ((Units >= 201) && (Units <= 500)) {
				total = Units * 4.0F;
			}
			else {
				total = Units * 7.0F;
			}
			break;  
			case 2:
			System.out.println("20");  

			System.out.println("\n\n**COMMERCIAL CONNECTION ELECTRICITY BILL**");
                
			if (Units <= 100){
				total = Units * 2.0F;
			}
			else if ((Units >= 101) && (Units <= 200)) {
				total = Units * 4.50F;
			}
			else if ((Units >= 201) && (Units <= 500)) {
				total = Units * 6.0F;
			}
			else {
				total = Units * 7.0F;
			}
			break;  
			 
			default:
			System.out.println("end the program");  
		}  
		
		System.out.println("\nCUSTOMER NUMBER : "+bn);
        System.out.println("\nCUSTOMER NAME : "+str);
        System.out.println("\nTOTAL UNITS = "+Units);
        System.out.println("\nTOTAL BILL = "+total);

		sc.close();	

	}

}

    

