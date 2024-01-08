import java.util.*;
public class Volume{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double v=(4*3.14*x*x*x)/3;
        System.out.printf("%.2f",v);
    }
}