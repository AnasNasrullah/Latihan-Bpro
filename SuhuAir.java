import java.util.*;
public class SuhuAir
{
	public static void main (String []args){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("PROGRAM SUHU AIR");
	
	System.out.print("MASUKKAN SUHU AIR=");
	int tebakanUser = sc.nextInt();
	
	if (tebakanUser<=0)
		System.out.println("padat");
	
	if (tebakanUser>=100)
		System.out.println("gas");
	
	else
		System.out.println("cair");

	}
} 