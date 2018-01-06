package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        
//        if ((number % 3 == 0 || containsThree(number)) && 
//                (number % 5 == 0 || containsFive(number)) &&
//                isFakeDeluxe(number)) {
//            return "fizz buzz fake deluxe";
//        }
        
        if ((number % 3 == 0 && containsThree(number)) && 
                (number % 5 == 0 && containsFive(number))) {
            return "fizz buzz deluxe";
        }
        
        if ((number % 3 == 0 || containsThree(number)) && 
                (number % 5 == 0 || containsFive(number))) {
            return "fizz buzz";
        }
        
        if ((number % 3 == 0 && containsThree(number)) && isFakeDeluxe(number)) {
            return "fizz fake deluxe";
        }
        
        if ((number % 3 == 0 && containsThree(number))) {
            return "fizz deluxe";
        }
        
        if ((number % 5 == 0 && containsFive(number)) && isFakeDeluxe(number)) {
            return "buzz fake deluxe";
        }
        
        if ((number % 5 == 0 && containsFive(number))) {
            return "buzz deluxe";
        }
        
        if (number % 3 == 0 || containsThree(number)) {
            return "fizz";
        }
        
        if (number % 5 == 0 || containsFive(number)) {
            return "buzz";
        }
        
//        if (isFakeDeluxe(number)) {
//            return "fake deluxe";
//        }
        
//        if (isDeluxe(number)) {
//            return "deluxe";
//        }
        
        return number.toString();
        
    }
    
    private static boolean containsThree(Integer number) {
        return number.toString().contains("3");
    }
    
    private static boolean containsFive(Integer number) {
        return number.toString().contains("5");
    }
    
    private static boolean isDeluxe(Integer number) {
        if (number < 10) {
            return false;
        }
        
        char[] charArray = number.toString().toCharArray();
        char auxChar = charArray[0];
        
        for (char tempChar : charArray) {
            if (tempChar != auxChar) {
                return false;
            }
        }
        
        return true;
    }
    
    private static boolean isFakeDeluxe(Integer number) {
        if (number % 2 != 0) {
            return true;
        }
        
        return false;
    }

}
