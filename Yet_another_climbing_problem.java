import java.util.*;
public class Climbing{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
 while(t-->0){
 int x=sc.nextInt();
 int y=sc.nextInt();
 int c=x/y;
 if(x>=y){
 if(x%y==0){
     System.out.println(c);
 }
 else{
     int d=x%y;
     System.out.println(c + d);
 }
 }
 else{
     System.out.println(x);
 }
 }   
}    
}
