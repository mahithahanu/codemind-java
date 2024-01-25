import java.util.*;
public class Capacity{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int m=sc.nextInt();
       int l=sc.nextInt();
       int c=n*m*l;
       System.out.printf("%d KB",c);
    }
}