import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        for(i=a;i>0;)
        {
            b=i%10;
            System.out.printf("%d",b);
            i=i/10;
        }
    }
}