// Jian Acol
// 11/10/25
// Description: Checks if parenthesis is legal or something like that
import java.util.*;
public class ParenthesisChecker{
    

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of brackets: ");
        String input = scanner.nextLine();

        while (input.contains("()") || input.contains("{}") || input.contains("[]")) {
            input = input.replace("()", "");
            input = input.replace("{}", "");
            input = input.replace("[]", "");
        }

        boolean valid = input.isEmpty();

        if (valid == true) {
            System.out.println("Valid sentence!");
        } else {
            System.out.println("Invalid sentence!");
        }


    }
}