
/**
 * Write a description of class BooleanLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
*/

import java.util.Scanner;
import java.lang.Object;

public class BooleanLogic
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class BooleanLogic
     */
    public BooleanLogic()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public static int compute(String op, int a, int b)
    {
        // for debug:
        System.out.println ("a: " + a + ", b: " + b + ", operator: " + op);

        if (op.equals("or"))
        {
            return or(a, b);
        }
        else if (op.equals("and"))
        {
            return and(a, b);
        }
        else if (op.equals("nor"))
        {
            return nor(a, b);
        }
        else if (op.equals("nand"))
        {
            return nand(a, b);
        }
        else
        {
            return -1;
        }
    }
    
    public static int or (int a, int b)
    {
        if (a > 0 || b > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static int and (int a, int b)
    {
        if (a > 0 && b > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static int nor (int a, int b)
    {
        if (a > 0 || b > 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
    public static int nand (int a, int b)
    {
        if (a > 0 && b > 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
    public static void main(String[] args)
    {
        // put your code here
        Scanner myScanner = new Scanner (System.in); // declare scanner
        int a = 0;
        int b = 0;
        
        while (a > -1)
        {
            System.out.print("Enter expression (a operator b) or -1 to exit: ");
            a = myScanner.nextInt();
            if (a < 0)
            {
                System.out.flush();
                System.out.println("Thanks for using Logic Computer!");
                return;
            }
            String op = myScanner.next();
            b = myScanner.nextInt();
            
            // for debug:
            // System.out.println ("a: " + a + ", b: " + b + ", operator: " + op);
            
            int c = BooleanLogic.compute(op, a, b);
        
            System.out.println(c);
        }
    }
}
