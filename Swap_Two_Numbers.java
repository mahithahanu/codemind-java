import java.util.*;
public class Swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=n;
        n=m;
        m=t;
        System.out.println(n);
        System.out.println(m);
    }
}