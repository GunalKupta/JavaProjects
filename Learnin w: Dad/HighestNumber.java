
/**
 * Write a description of class HighestNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.lang.Object;

public class HighestNumber
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class HighestNumber
     */
    public HighestNumber()
    {
        // initialise instance variables
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        // put your code here
        Scanner scanner = new Scanner (System.in);
        int currHigh = 0;
        int x = 0;
        
        while (x > -1)
        {
            System.out.print("Enter positive integers or -1 to exit: ");
            x = scanner.nextInt();
            
            if (x < 0)
            {
                System.out.println("Thanks for using Highest Number Calculator!");
                return;
            }
            
            for (int i = 0; i < x; i++)
            {
                int newNum = scanner.nextInt();
            
                if (currHigh < newNum)
                {
                    currHigh = newNum;
                
                }
            }

            int z = currHigh;
           
            System.out.println("The highest number is " + z);
            
            currHigh = 0;
        }
    }
}
