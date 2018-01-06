package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz";
        }
        
        if (number % 3 == 0) {
            return "fizz";
        }
        
        if (number % 5 == 0) {
            return "buzz";
        }
        
        return number.toString();
        
    }
    
    private static boolean containsThree(Integer number) {
        return number.toString().contains("3");
    }
    
    private static boolean containsFive(Integer number) {
        return number.toString().contains("5");
    }

}
