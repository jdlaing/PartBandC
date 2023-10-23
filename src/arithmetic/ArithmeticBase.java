/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    UserInput ui = new UserInput();

    public double x,y;
    double calculate(double x, double y) {

        switch (ui.getArithmeticOperation()) 
        {
            case Plus:   return x + y;
            case Minus:  return x - y;
            case Times:  return x * y;
            case Divide: return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
