import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        for(i=(a*2);i>0;i--)
        {
            if(i%2==0)
            {
                System.out.printf("%d ",i);
            }
        }
    }
}