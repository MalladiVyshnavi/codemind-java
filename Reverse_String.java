import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] reversed = new char[str.length()];
         for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = str.charAt(i);
        }
        System.out.println(new String(reversed));
    }
}
