import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String octalString=sc.next();
        int decimal=Integer.parseInt(octalString,8);
        System.out.println(decimal);
    }
}