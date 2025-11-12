// Jian Acol
// 11/10/25
// Description: Checks if parenthesis is legal or something like that
import java.util.*;
public class ParenthesisChecker{
    

    public static void main(String[] args){
        //Makes a scanner and awaits the next line of input to check
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of brackets: ");
        String input = scanner.nextLine();
        
        //Precondition: Must have an string input before running
        //Postcondition: will remove every instance of two together brackets
        while (input.contains("()") || input.contains("{}") || input.contains("[]")) {
            input = input.replace("()", "");
            input = input.replace("{}", "");
            input = input.replace("[]", "");
        }

        //Checks if there are leftover brackets or not
        boolean valid = input.isEmpty();

        //Print true or false based on if it is empty or not
        if (valid == true) {
            System.out.println("Valid sentence!");
        } else {
            System.out.println("Invalid sentence!");
        }


    }
}