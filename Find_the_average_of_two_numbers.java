import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double avg;
        avg=(a+b)*0.5;
        System.out.printf("%.4f",avg);
    }
}