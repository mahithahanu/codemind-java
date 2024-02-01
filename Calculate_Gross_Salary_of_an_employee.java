import java.util.*;
public class GrossSalary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double b = sc.nextDouble();
         double h = sc.nextDouble();
          double d = sc.nextDouble();
          double p=(b*12)/100;
          double g=b+h+d+p;
          System.out.printf("%.2f
",p);
          System.out.printf("%.2f
",g);
    }
}