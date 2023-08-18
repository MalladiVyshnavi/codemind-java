import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,fact=1;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.printf("%d",fact);
    }
}