package arithmetic;

import java.util.Scanner;

/**
 * UserInput
 */
enum Operations {
    Plus,
    Minus,
    Times,
    Divide
}

public class UserInput {

    Scanner sc = new Scanner(System.in);

    Integer getInput() {
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    Operations getArithmeticOperation() {
        System.out.println("Enter arithmetic operation to Perform: ");
        switch (sc.next().toUpperCase()) {
            case "PLUS": return Operations.Plus;
            case "MINUS": return Operations.Minus;
            case "TIMES": return Operations.Times;
            case "DIVIDE": return Operations.Divide;
            default: throw new AssertionError("Unknown operations " + this);
        }
    } 
    
}
