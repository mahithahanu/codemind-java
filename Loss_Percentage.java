import java.util.Scanner;
public class Percentage{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double c=(y/x)*100;
        System.out.printf("%.2f",100-c);
    }
}