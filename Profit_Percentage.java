import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double p=y-x;
        double a=(p*100)/x;
        System.out.printf("%.2f",a);
    }
}