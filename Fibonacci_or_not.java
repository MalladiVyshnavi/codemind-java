import java.util.Scanner;
public class Fibo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a= 0;
        int b= 1;
        int c= 0;
        while (c< n)
        {
            c=a+b;
            a=b;
            b=c;
        }
         
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}