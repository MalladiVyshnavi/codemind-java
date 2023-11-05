import java.util.Scanner;
public class Difference 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        squareOfSum = squareOfSum * squareOfSum;
        int absoluteDifference = Math.abs(squareOfSum - sumOfSquares);
        System.out.println(absoluteDifference);

    }
}