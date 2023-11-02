import java.util.Scanner;
public class Lamps
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int minimumCost=0;
        if(k>=n)
        {
            minimumCost=n*x;
        }
        else
        {
            if(x>y)
            {
                minimumCost=(k*x)+(n-k)*y;
            }
            else
            {
                minimumCost=n*x;
            }
        }
        System.out.println(minimumCost);
    }
}