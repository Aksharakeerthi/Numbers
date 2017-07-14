# Numbers
import java.io.*;
import java.util.*;
public class Number{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a,b,k,m,c=0;
a=sc.nextInt();
b=sc.nextInt();
while(b<=a){
sum=0;
k=a;
while(d>0){
m=k%10;
sum=sum+(k*k*k);
k=k%10;
if(sum==a){
System.out.println(a);
c=c+1;
}
a++;
}
System.out.println("The number is:"+c);
}
}
