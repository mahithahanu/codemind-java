import java.util.*;
public class Time{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=n/3600;
        int e=n-(h*3600);
        int m=e/60;
        int r=e-(m*60);
        System.out.print("H:M:S-"+h+":"+m+":"+r);
    }
}