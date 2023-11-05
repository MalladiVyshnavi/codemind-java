import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,c=0;
        a=sc.nextInt();
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+1;
            }
        }
        if(c==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        
    }
}
