import java.util.Scanner;
public class Trapezium
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        double area=(a+b)*0.5*h;
        System.out.printf("%.4f",area);
    }
}