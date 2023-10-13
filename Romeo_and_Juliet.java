import java.util.Scanner;
public class Juliet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int p=x*5+y*10;
        int r=p/z;
        System.out.println(r);
    }
}