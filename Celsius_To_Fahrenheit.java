import java.util.Scanner;
public class Convert
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double c,f;
        c=sc.nextDouble();
        f=(c*1.8)+32;
        System.out.printf("%.2f",f);
        
    }
}