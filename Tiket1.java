import java.io.*;

public class Tiket1
{
	public static void main (String []args) throws IOException 
	{ BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int [] tiket = new int [4];
		int [] jmlPesanan = new int [4];
		int[] total = new int [4];
		int totalOmset = 0;
		int pil = 0;
		
		do 
		{
			System.out.println("===========================================");
			System.out.println("==program penjualan tiket pesawat terbang==");
			System.out.println("===========================================");
			System.out.println("1.	penjualan tiket					");
			System.out.println("2.	view daftar kursi yang kosong	");
			System.out.println("3.	view daftar kursi yang terisi	");
			System.out.println("4.	view semua daftar kursi			");
			System.out.println("5.	view rekap kursi				");
			System.out.println("6.	view omset						");
			System.out.print("MASUKKAN NO PILIHAN ANDA (1-6):");
			System.out.println();
			pil = Integer.parseInt(br.readLine());
			
		
				switch(pil)
				{
					case 1:
					tiket[0] = 100000;
					tiket[1] = 150000;
					tiket[2] = 225000;
					tiket[3] = 393750;
					
					
						System.out.println("===============");
						System.out.println("penjualan tiket");
						System.out.println("===============");
						System.out.println();
					do
					{
						System.out.println();
						System.out.println("pilih tiket yang akan dipesan");
						System.out.println("-----------------------------");
						System.out.println("1.	ekonomi		");
						System.out.println("2.	bisnis		");
						System.out.println("3.	eksekutif	");
						System.out.println("4.	vip			");
						System.out.print("MASUKKAN NO PILIHAN ANDA (1-4):");
						System.out.println();
						pil = Integer.parseInt(br.readLine());
						
						if(pil ==1)
						{
							System.out.println("kursi yang tersedia: 20 kursi ");
							System.out.println("HARGA :Rp." + tiket[0]);
							System.out.print("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[0] = Integer.parseInt(br.readLine());
							if (jmlPesanan[0]<=20)
							{
								total[0] = tiket[0]*jmlPesanan[0];
								System.out.println("SUB TOTAL =" + total[0]);
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 20");
							}
						}
						
						if(pil ==2)
						{
							System.out.println("kursi yang tersedia hanya: 16 kursi");
							System.out.println("HARGA :Rp." + tiket[1]);
							System.out.print("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[1] = Integer.parseInt(br.readLine());
							if (jmlPesanan[1]<=16)
							{
								total[1] = tiket[1]*jmlPesanan[1];
								System.out.println("SUB TOTAL =" + total[1]);
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 16");
							}
							
						}
						
						if(pil ==3)
						{
							System.out.println("kursi yang tersedia hanya: 12 kursi");
							System.out.println("HARGA :Rp." + tiket[2]);
							System.out.println("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[2] = Integer.parseInt(br.readLine());
							if (jmlPesanan[2]<=12)
							{
								total[2] = tiket[2]*jmlPesanan[2];
								System.out.println("SUB TOTAL =" + total[2]);
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 12");
							}
						
						}
						
						if(pil ==4)
						{
							System.out.println("kursi yang tersedia hanya: 8 kursi");
							System.out.println("HARGA :Rp." + tiket[3]);
							System.out.println("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[3] = Integer.parseInt(br.readLine());
							if (jmlPesanan[3]<=8)
							{
								total[3] = tiket[3]*jmlPesanan[3];
								System.out.println("SUB TOTAL =" + total[3]);
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 8");
							}
							
						}
					
					}while(pil<4);
					
					System.out.println();
					break;
					
					case 2:
					
					System.out.println();
					System.out.println("=============================");
					System.out.println("view daftar kursi yang kosong");
					System.out.println("=============================");
					System.out.println();
					
					System.out.println("ekonomi =");
						if (jmlPesanan[0] >= 20)
						{
							System.out.println("kelas ekonomi penuh");
						}
						else 
						{
							System.out.println("kelas ekonomi masih ada yg kosong");
						}
					
					System.out.println("bisnis =");
						if (jmlPesanan[1]>=16)
						{
							System.out.println("kelas bisnis penuh");
						}
						else 
						{
							System.out.println("kelas bisnis masih ada yg kosong");
						}
					
					System.out.println("eksekutif =");
						if (jmlPesanan[2]>=12)
						{
							System.out.println("kelas eksekutif penuh");
						}
						else 
						{
							System.out.println("kelas eksekutif masih ada yg kosong");
						}
					
					System.out.println("vip =");
						if (jmlPesanan[3]>=8)
						{
							System.out.println("kelas vip penuh");
						}
						else 
						{
							System.out.println("kelas vip masih ada yg kosong");
						}
					
					break;
					
				
					
					case 3:
					System.out.println();
					System.out.println("=============================");
					System.out.println("view daftar kursi yang terisi");
					System.out.println("=============================");
					System.out.println();
					System.out.println("kursi yang terisi pada kelas ekonomi :" + jmlPesanan[0]+" " +"kursi");
					System.out.println("kursi yang terisi pada kelas bisnis :" + jmlPesanan[1] +" " +"kursi");
					System.out.println("kursi yang terisi pada kelas eksekutif :" + jmlPesanan[2] +" " +"kursi");
					System.out.println("kursi yang terisi pada kelas vip :" + jmlPesanan[3] + " " +"kursi");
					
					break;
					
				
					case 4:
					System.out.println();
					System.out.println("=======================");
					System.out.println("view semua daftar kursi");
					System.out.println("=======================");
					System.out.println();
					break;
					
				
					case 5:
					System.out.println();
					System.out.println("================");
					System.out.println("view rekap kursi");
					System.out.println("================");
					System.out.println();
					break;
				
					case 6:
					System.out.println();
					System.out.println("==========");
					System.out.println("view omset");
					System.out.println("==========");
					System.out.println();
					System.out.println( "total omset kelas ekonomi :Rp." + total[0] +"==>kursi yang terjual pada kelas ekonomi :" + jmlPesanan[0]);
					System.out.println( "total omset kelas bisnis :Rp." + total[1] +"==>kursi yang terjual pada kelas bisnis :" + jmlPesanan[1]);
					System.out.println( "total omset kelas eksekutif :Rp." + total[2] +"==>kursi yang terjual pada kelas eksekusi :" + jmlPesanan[2]);
					System.out.println( "total omset kelas vip :Rp." + total[3] +"==>kursi yang terjual pada kelas vip :" + jmlPesanan[3]);
					totalOmset = total[0]+total[1]+total[2]+total[3];
					System.out.println("total omset seluruh kelas :Rp." + totalOmset );

					break;
					
				default: break;
			}			
		}
		while(pil<6);
	}
}