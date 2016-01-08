
/**
 * Calculate the factorial of a specified integer.
 * 
 * @author (Kunal Gupta) 
 * @version (2015-12-13a)
 */
import java.util.Scanner;

public class Factorial
{
    // instance variables - replace the example below with your own
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static long findFactorial (int n)
    {
        
        long f = 1; // output factorial of n
        
        for (int i = 1; i < n + 1; i++)
        {
            f = f * i;        
        }
        return f;
    }
    
    public static void main(String[] args)
    {
        int n = 1;
        long f; // output factorial of n
        Scanner myScanner = new Scanner (System.in); // declare scanner
        
        while (n > 0)
        {
            System.out.print("Enter a number (0 to stop program): ");
            n = myScanner.nextInt();
            f = findFactorial(n);
       
            if (n < 1)
            {
                System.out.println("Thanks for using the Factorial Calculator!");
            }
            else
            {
                System.out.println("The factorial of " + n + " is " + f);
            }
        }
    }
}
