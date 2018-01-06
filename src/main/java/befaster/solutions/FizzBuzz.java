package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
        if ((number % 3 == 0 || containsThree(number)) && 
                (number % 5 == 0 || containsFive(number))) {
            return "fizz buzz";
        }
        
        if (number % 3 == 0 || containsThree(number)) {
            return "fizz";
        }
        
        if (number % 5 == 0 || containsFive(number)) {
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
