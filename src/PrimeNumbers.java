import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {
        int startingValue;
        int endingValue;
        PrimeGenerator generator = new PrimeGenerator();
                
        if (args.length != 2) {
            System.err.println("Input must be two integers.");
        }
        try {
            startingValue = Integer.parseInt(args[0]);
            endingValue = Integer.parseInt(args[1]);
            
            List<Integer> primes = generator.generate(startingValue, endingValue);
            
            for(int prime : primes) {
                System.out.println(prime);
            }
        } catch (NumberFormatException e) {
            System.err.println("Input must be two integers.");
        } catch (ArrayIndexOutOfBoundsException e) {}
    }

}
