
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (Kunal Gupta) 
 * @version (2015-12-13)
 */
import java.util.Scanner;

public class Fibonacci
{

    /**
     * Constructor for objects of class Fib0nacci
     */
    public static int  findFibonacci(int n)
    {        
        int oldNum = 0;
        int prevNum = 1;
        
        if (n < 2)
        {
            return 0;
        }
        
        int currNum = 1; // This is the fibonacci value for n = 2
        
        for (int i = 0; i < n - 2; i++)
        {
            currNum = oldNum + prevNum;
            oldNum = prevNum;
            prevNum = currNum;
        }
        return currNum;
    }

    public static void main(String[] args)
    {
        int n = 1;
        int f; // output fibbinacci number corresponding to integer n
        Scanner myScanner = new Scanner (System.in);
        
        while (n > 0)
        {
            System.out.print("Enter a number (0 to stop program): ");
            n = myScanner.nextInt();        
            f = findFibonacci(n);

            if (n < 1) 
            {
                System.out.println("Thanks for using the Fibonacci Finder!");
            }
           
            else
            {
                System.out.println("The fibonacci number that corresponds with " + n + " is " + f);
            }
        }
    }
}
