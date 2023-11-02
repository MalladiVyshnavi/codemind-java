import java.util.Scanner;
public class Kohli
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,s=0,c=0;
        if(n%5==0 && n%10!=0)
        {
            a=n%10;
            if(a==5)
            {
                c++;
            }
            b=n/10;
            s=b+c;
            System.out.println(s);
        }
        else if(n%5==0 && n%10==0)
        {
            n=n/10;
            System.out.println(n);
        }
        else
        {
            System.out.println(-1);
        }
    }
}