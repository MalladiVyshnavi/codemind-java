import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0;
        a=sc.nextInt();
        for(i=a;i>0;)
        {
            b=i%10;
            c=(c*10)+b;
            i=i/10;
        }
        if(a==c)
    {
        System.out.print("Palindrome");
    }
    else
    {
        System.out.print("Not Palindrome");
    }
    }
    
}