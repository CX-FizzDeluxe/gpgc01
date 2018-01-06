/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package befaster.solutions;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

/**
 *
 * @author George Cristian
 */
public class FizzBuzzTest {
    
    @Test
    public void testFizzMultipleThree() {
        assertThat(FizzBuzz.fizzBuzz(9), equalTo("fizz"));
    }
    
    @Test
    public void testFizzMultipleFive() {
        assertThat(FizzBuzz.fizzBuzz(25), equalTo("buzz"));
    }
    
    @Test
    public void testFizzMultipleThreeFive() {
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
    }
    
    @Test
    public void testFizzNotMultipleThreeFive() {
        assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
    }
    
    
}
