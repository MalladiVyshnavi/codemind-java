import java.util.Scanner;
public class Check
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
        {
            System.out.println("VOWEL");
        }
        else
        {
            System.out.println("CONSONANT");
        }
    }
}