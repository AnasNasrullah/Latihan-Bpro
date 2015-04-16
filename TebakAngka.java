import java.util.*;
public class TebakAngka
{
	public static void main (String []args){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("PROGRAM TEBAK GAMBAR-ANGKA");
	System.out.println("MASUKKAN TEBAKAN ANDA [1: gambar; 0: angaka]>");
	int tebakanUser = sc.nextInt();
	System.out.println("anda menebak =" + (tebakanUser==1?"gambar":"angka"));
	
	int pcOut = (int) (Math.random()+0.5); //bilangan random 0.5 dbulatkan
	
	System.out.println("komputer menghasilkan :" + (pcOut==1?"gambar":"angka"));
	if (tebakanUser==pcOut)
	System.out.println("selamat anda menang");
	
	else
	System.out.println("selamat anda kalah");

	}
} 