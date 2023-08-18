import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        for(i=1;i<=(a*3);i++)
        {
            if(i%3==0)
            {
                System.out.printf("%d ",i);
            }
        }
    }
}