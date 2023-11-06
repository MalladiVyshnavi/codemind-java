import java.util.Scanner;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int capa=2*t*s*b*512;
        int c=capa/1024;
        System.out.println(c +" KB");
    }
}