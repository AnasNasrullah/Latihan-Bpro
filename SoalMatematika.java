import java.util.*;
public class SoalMatematika{
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println ("Masukan jumlah soal :");
    int soal=sc.nextInt();
    int i=1;
    int c=1;
    String output="";
    System.out.println ("Jawablah soal perhitungan dibawah!");
    System.out.println ("No. \tSoal \tJawaban"); 
   
    while(i<soal+1){
    int a=(int)(Math.random()*20);
    int b=(int)(Math.random()*10);
    int kunci=a+b;

    System.out.print (i+").\t"+a+"+"+b+"=");
    int jawab=sc.nextInt();
    if (jawab==kunci){
    output +="\n"+i+").\t"+a+"+"+b+"\t"+jawab+"\t"+kunci+"\t"+"Benar";
    }
else{
output +="\n"+i+").\t"+a+"+"+b+"\t"+jawab+"\t"+kunci+"\t"+"Salah";
}
   i++;
    }
	System.out.println ("");
    System.out.println ("jawaban");  
    System.out.println ("No."+"\tSoal"+"\tJawaban"+"\tKunci"+"\tStatus");  
    System.out.println (output);  
}
}