import java.util.Scanner;
public class Digi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int largest_digit=0;
        while(n>0)
        {
            int r=n%10;
            if(largest_digit<r)
            {
                largest_digit=r;
            }
             n=n/10;
        }
        System.out.println(largest_digit);
    }
}