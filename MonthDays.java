package training;
import java.util.Scanner;
public class MonthDays{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a year: ");
		   int year = input.nextInt();
		   input.nextLine();
		
		System.out.print("Please enter an Integer value for Month :");
		if(input.hasNextInt()){
			int month=input.nextInt();
			boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
			switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("The specified months have total of 31 days");
				break;
			case 2:
				if(isLeapYear == true){
					System.out.println(month + "\\-" + year + " has 29 days");
				}
				else{
					System.out.println(month + "\\-" + year + " has 28 days");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + " " + year + " has 30 days");
				
				
			}
			
		}
		else{
			System.out.println("Not an Integer value, try again");
		}
		input.close();
		
	}
}