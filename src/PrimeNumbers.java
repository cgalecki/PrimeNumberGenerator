import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers implements PrimeNumberGenerator {

    /***
     * Returns a list of all primes between two numbers.
     */
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> results = new ArrayList<Integer>();
        int smallValue;
        int largeValue;
        if( startingValue > endingValue) {
            smallValue = endingValue;
            largeValue = startingValue;
        } else {
            smallValue = startingValue;
            largeValue = endingValue;
        }
        
        for (int number = smallValue; number <= largeValue; number++) {
            if(isPrime(number)) {
                results.add(number);
            }
        }
        return results;
    }

    /**
     * Returns whether the given value is a prime number
     */
    @Override
    public boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= (value / 2); i++) {
            if (0 == (value % i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int startingValue;
        int endingValue;
        
        if (args.length != 2) {
            throw new IllegalArgumentException("Input must be two integers.");
        }
        try {
            startingValue = Integer.parseInt(args[0]);
            endingValue = Integer.parseInt(args[1]);
            
            List<Integer> generate = generate(startingValue, endingValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input must be two integers.");
        }
    }

}
