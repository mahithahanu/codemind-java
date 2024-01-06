import java.util.Scanner;
public class Frame{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int area=2*(x+y);
    System.out.println(area*z);
    }
}