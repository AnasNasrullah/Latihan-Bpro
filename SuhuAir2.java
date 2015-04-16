import java.util.*;
public class SuhuAir2
{
	public static void main (String []args){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("PROGRAM SUHU AIR");
	System.out.print("MASUKKAN SUHU AIR=");
	int tempAir = sc.nextInt();
	
	String bentukAir="";
	if ((tempAir>=-20)&&(tempAir<0))
		bentukAir = "padat";
		System.out.println("padat");
	
	if (tebakanUser>=100)
		System.out.println("gas");
	
	else
		System.out.println("cair");

	}
} 