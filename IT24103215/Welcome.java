import java.util.*;

public class Welcome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		String fname = scan.nextLine();
		
		System.out.print("\nEnter your Last Name: ");
		String lname = scan.nextLine();
		
		System.out.println("Welcome to the Second Year " + fname +" "+ lname);
	}
}