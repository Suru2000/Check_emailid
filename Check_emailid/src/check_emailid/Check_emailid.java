package check_emailid;
import java.util.Scanner;
public class Check_emailid {
	static boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emailid: ");
		String emailid = sc.nextLine();
		System.out.println("The E-mail ID is: " + emailid);
		System.out.println("Is the above E-mail ID valid? " + isValid(emailid));
		}
	}
