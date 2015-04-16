public class TebakGambarArry1
{
	public static void main (String []args)
	{
		String [] label ={"gambar","agka"};
		int []score={0,0};
		//melakukan 12 kali lemparan
		System.out.println("ke\t| hasil lemparan");
		System.out.println("====================");

		for(int i=0; i<12;i++)
		{
			int r = (int)(Math.random()+0.5);
			System.out.println((i+1) + "\t|\t" + label[r]);
			score[r]++;
		}
		
		System.out.println("====================");
		//hitung secor 0 - gambar score 1angka
		//tampilkan total scoregambar dan angka
		for(int i=0; i<label.length;i++)
		{
			System.out.println("score " + label[i] + "=" + score[i]);
		}
		// cetak kesimpulan
		if(score[0]>score[1])
			System.out.println("gambar menang");
		else if(score[0]<score[1])
			System.out.println("angka menang");
		else 
			System.out.println("seri");
	}
}