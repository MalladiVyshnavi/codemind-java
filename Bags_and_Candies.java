import java.util.Scanner;
public class Candies
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        int bags=(n+k*m-1)/(k*m);
        System.out.println(bags);
    }
}