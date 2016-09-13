import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {
        int startingValue;
        int endingValue;
        PrimeGenerator generator = new PrimeGenerator();
        
        if (args.length != 2) {
            throw new IllegalArgumentException("Input must be two integers.");
        }
        try {
            startingValue = Integer.parseInt(args[0]);
            endingValue = Integer.parseInt(args[1]);
            
            generator.generate(startingValue, endingValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input must be two integers.");
        }
    }

}
