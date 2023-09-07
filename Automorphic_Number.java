import java.util.Scanner;
public class Num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n*n;
        String s1=Integer.toString(n);
        String s2=Integer.toString(p);
        System.out.print(s2.endsWith(s1) ? "Automorphic Number":"Not an Automorphic Number");
    }
}