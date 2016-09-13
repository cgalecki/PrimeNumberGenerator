import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeGeneratorTest {

    @Test
    public void isPrimeNegative() {
        int testValue = -1;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeZero() {
        int testValue = 0;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeOne() {
        int testValue = 1;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeTwo() {
        int testValue = 2;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertTrue(result);
    }
    
    @Test
    public void isPrimeThree() {
        int testValue = 3;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertTrue(result);
    }
    
    @Test
    public void isPrimeFour() {
        int testValue = 4;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeFifteen() {
        int testValue = 15;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        boolean result = testPrimes.isPrime(testValue);
        
        assertFalse(result);
    }
    
    @Test
    public void isPrimeOneHundredOne() {
        int testValue = 101;
        PrimeGenerator testPrimes = new PrimeGenerator();
        
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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestNoPrimes() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 8;
        int endValue = 10;
        PrimeGenerator testPrimes = new PrimeGenerator();

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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
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
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void generateTestOneHundred() {
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = new ArrayList<Integer>();
        int startValue = 1;
        int endValue = 100;
        int[] resultsArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        PrimeGenerator testPrimes = new PrimeGenerator();
        
        expectedResult = createExpectedResults(resultsArray);

        actualResult = testPrimes.generate(startValue, endValue);
        
        assertEquals(expectedResult, actualResult);
    }

    
    private List<Integer> createExpectedResults(int[] results) {
        List<Integer> resultsList = new ArrayList<Integer>();
        
        for(int i = 0; i < results.length; i++) {
            resultsList.add(results[i]);
        }
        
        return resultsList;
    }
}
