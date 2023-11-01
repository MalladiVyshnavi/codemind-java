import java.util.Scanner;
public class Mario
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int m=x%3;
        if(m==1)
        {
            System.out.println("HUGE");
        }
        else if(m==2)
        {
            System.out.println("SMALL");
        }
        else
        {
            System.out.println("NORMAL");
        }
    }
}