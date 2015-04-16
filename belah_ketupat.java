/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author Nurul C.
*/
public class belah_ketupat {
public static void main(String[]args){
int l = 1;
int tingkat = 10;
int n = 10/2;
for(int i=1;i<=n;i++){
for(int k=n;k>i;k–){
System.out.print(” “);
}
for(int j=1;j<=l;j++){
System.out.print(n);
}
l+=2;

System.out.println(“”);
}
l -= 4;

for(int i=(n-1);i>=1;i–){
for(int k=i;k<=(n-1);k++){
System.out.print(” “);
}
for(int j=l;j>=1;j–){
System.out.print(n);
}
l-=2;

System.out.println(“”);
}
}
}