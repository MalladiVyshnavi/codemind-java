import java.util.Scanner;
public class GrossSalary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x;
        if(n<=10000)
        {
            x=n+(n*0.8)+(n*0.2);
        }
        else if(n<=20000)
        {
            x=n+(n*0.9)+(n*0.25);
        }
        else 
        {
            x=n+(n*0.95)+(n*0.3);
        }
        System.out.printf("%.2f",x);
    }
}