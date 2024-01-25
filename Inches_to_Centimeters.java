import java.util.*;
public class Inches{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double c=n*(2.54);
        System.out.printf("%.2f",c);
    }
}