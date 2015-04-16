import java.util.*;
public class Login1
{
	public static void main (String []args){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("LOGIN");
	System.out.print("ENTER First Name=");
	int FirstN = sc.nextInt();
	System.out.print("ENTER Last Name=");
	int LastN = sc.nextInt();
	
	String userN=FirstN.charAt(1)+LastN.substring(3);
	String paa=FirstN.charAt(1)+LastN.substring(5);


	}
} 