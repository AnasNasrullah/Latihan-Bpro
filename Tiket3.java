public class Tiket3
{
	public static void main (String []args) 
	{ 		
		int[] harga =  {100000,150000,225000,393750};
		String[] kelas = {"EKONOMI ","BISNIS","EKSEKUTIF","V I P"};
		int[] kursi =  {15,12,12,8};
		
		System.out.println("No) kelas\t| harga\t\t\t| kursi");
		System.out.println("====================");	
	
		for(int a=0; a<4; a++)
			{
				System.out.println((a+1)+ ") " +(kelas[a]) + "\t|\t" + "Rp." +harga[a] + "\t|\t" + kursi[a]);
			}
		System.out.println("====================");	
	}
}