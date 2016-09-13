import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeNumbersTest {

    @Test
    public void isPrimeNegative() {
        int testValue = -1;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeZero() {
        int testValue = 0;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeOne() {
        int testValue = 1;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeTwo() {
        int testValue = 2;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertTrue(result);
    }
    
    @Test
    public void isPrimeThree() {
        int testValue = 3;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertTrue(result);
    }
    
    @Test
    public void isPrimeFour() {
        int testValue = 4;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeFifteen() {
        int testValue = 15;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeOneHundredOne() {
        int testValue = 101;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertTrue(result);
    }
    
    @Test
    public void generateTestBaseCase() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 1;
        int endValue = 10;
        int[] resultsArray = {2, 3, 5, 7};
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        expectedResult = createExpectedResults(resultsArray);

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestBaseCaseInverse() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 10;
        int endValue = 1;
        int[] resultsArray = {2, 3, 5, 7};
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        expectedResult = createExpectedResults(resultsArray);

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestExpectedCase() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 7900;
        int endValue = 7920;
        int[] resultsArray = {7901, 7907, 7919};
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        expectedResult = createExpectedResults(resultsArray);

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestOneNumberNonPrime() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 1;
        int endValue = 1;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestNoPrimes() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 8;
        int endValue = 10;
        PrimeNumbers testPrimes = new PrimeNumbers();

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestOneNumberPrime() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 11;
        int endValue = 11;
        int[] resultsArray = {11};
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        expectedResult = createExpectedResults(resultsArray);

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestNegativeToPositive() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = -1;
        int endValue = 5;
        int[] resultsArray = {2, 3, 5};
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        expectedResult = createExpectedResults(resultsArray);

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestNegativeToNegative() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = -10;
        int endValue = -1;
        PrimeNumbers testPrimes = new PrimeNumbers();
        
        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
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
    
    private List<Integer> createExpectedResults(int[] results) {
        List<Integer> resultsList = new ArrayList<Integer>();
        
        for(int i = 0; i < results.length; i++) {
            resultsList.add(results[i]);
        }
        
        return resultsList;
    }
}
