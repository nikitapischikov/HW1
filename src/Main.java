import java.util.Scanner;

public class Main {

	public static void main(String... args) {
		
		//______Task1_____________________________________________________________________________
		//Calculation of the area and perimeter of the flower bed
		
		System.out.println("____HW1___Task1___");
		System.out.println("***Calculation of the area and perimeter of the flower bed \n");

		double  s, p;
		Scanner inRadius = new Scanner(System.in);
		System.out.println("Enter the radius of the flower bed: "); 
		float r = inRadius.nextFloat();
		
		s= (3.14*r*r);
		p=r*2*3.14;
		System.out.println("The perimeter of the club is " +p);
		System.out.println("the area of ​​the club is equal " +s);
		System.out.println("_____________________________________________________________ \n" );
		
		
		
		//______Task2_____________________________________________________________________________
		//Display of name and address of residence
		System.out.println("____HW1___Task2___");
		System.out.println("***Display of name and address of residence \n");
				
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
	
		System.out.println(name + ", What city do you live in?");
		
		String city = in.nextLine();
		System.out.println("You are " +name +" from " +city);
		System.out.println("_____________________________________________________________ \n" );
		
		
		//______Task3_____________________________________________________________________________
		//Determine the price for a phone call.
		System.out.println("____HW1___Task3___");
		System.out.println("***Determine the price for a phone call \n");
		
		float c1,c2,c3, sum;  //Cost
		int t1,t2,t3;    //Time in minutes
		Scanner input = new Scanner(System.in);
		//enter cost for 1 minute of call
		System.out.printf("Enter the cost of tariffs: \nC1 = "); 
		c1=input.nextFloat();		
		System.out.printf("C2 = ");
		c2=input.nextFloat();
		System.out.printf("C3 = ");
		c3=input.nextFloat();
		
		//enter cost for 1 minute of call
		System.out.printf("\nEnter call duration (minutes):\nT1 = ");  
		t1=input.nextInt();		
		System.out.printf("T2 = ");
		t2=input.nextInt();
		System.out.printf("T3 = ");
		t3=input.nextInt();
		
		System.out.println("Call cost:");
		System.out.println("Call #1 = "+t1*c1);
		System.out.println("Call #2 = "+t2*c2);
		System.out.println("Call #3 = "+t3*c3);
		sum=t1*c1+t2*c2+t3*c3;
		System.out.println("Cost of all calls = "+sum);
		
		inRadius.close();
		in.close();
		input.close();
	}

}
