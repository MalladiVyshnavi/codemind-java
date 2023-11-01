import java.util.Scanner;
public class Hermoine
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && c>b)
        {
            System.out.println(a+c);
        }
        else if(b>a && c>a)
        {
            System.out.println(b+c);
        }
        else
        {
            System.out.println(a+b);
        }
    }
}