import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumbersTest {
    @Test
    public void primeNumbersTestBaseCase() {
        String[] args = {"7900", "7920"};
        
        PrimeNumbers.main(args);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void primeNumbersTestOneInput() {
        String[] args = {"7900"};
        
        PrimeNumbers.main(args);
    }

    @Test(expected=IllegalArgumentException.class)
    public void primeNumbersTestThreeInput() {
        String[] args = {"7900", "7800", "7902"};
        
        PrimeNumbers.main(args);
    }

    @Test(expected=IllegalArgumentException.class)
    public void primeNumbersTestNonIntegerInput() {
        String[] args = {"b", "a"};
        
        PrimeNumbers.main(args);
    }

    @Test(expected=IllegalArgumentException.class)
    public void primeNumbersTestOneIntegerInput() {
        String[] args = {"2", "a"};
        
        PrimeNumbers.main(args);
    }
}
