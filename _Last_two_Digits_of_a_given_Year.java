import java.util.*;
public class LastDigit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n%100;
        int m=(int)Math.log10(c)+1;
        if(m==2){
            System.out.print(c);
        }
        else{
            System.out.print("0"+c);
        }
        
    }
}