import java.util.Scanner;
public class Num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.charAt(0)=='0')
        {
            System.out.println("Invalid");
        }
        else if(s.length()!=10)
        {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("Valid");
        }
    }
}