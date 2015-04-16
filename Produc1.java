import java.util.*;
public class Produc1
{
	public static void main (String []args)
	{
		int [][]data={
		{10,4,12,2},
		{3,5,8,9},
		{2,10,6,2},
		{12,8,7,4},
		{9,5,5,11},
		{10,4,4,8},
		{6,12,12,10}};
		String []produk={"pencil","buku gambar","buku tulis","penghapus"};
		String []hari={"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
		int []totalproduk=new int[produk.length];
		int []totalhari=new int[hari.length];
		int totalproduks=0;
		int totalsemua=0;
		int rata=0;
		int besar=0;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.print("\t");
			for(int i=0;i<produk.length;i++)
			{
				System.out.print(produk[i]+"\t");
			}
				System.out.println("total produks");
				System.out.println("-------------------------------------------------------------------------------");
					for (int hr=0;hr<hari.length;hr++)
					{
						totalproduks=0;
						System.out.print(hari[hr]+"\t");
							for (int a=0;a<data[hr].length;a++)
							{
								System.out.print(data[hr][a]+"\t");
								totalproduks+=data[hr][a];
							}
							System.out.println("\t"+totalproduks);
							totalsemua+=totalproduks;
							rata+=1;
					}
					for (int x=0;x<produk.length;x++)
					{
						totalproduks=0;
						for (int a=0;a<data[x].length;a++)
						{
							totalproduks+=data[a][x];
						}
						System.out.print("\t"+totalproduks+"\t");
						if (totalproduks>besar){
							besar=totalproduks;
						}
					}
					System.out.print("\t"+totalsemua+"("+totalsemua/rata+") Max("+besar+")");
		}
	}
