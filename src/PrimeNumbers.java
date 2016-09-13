import java.util.List;

public class PrimeNumbers implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPrime(int value) {
        for (int i = 2; i < (value / 2); i++) {
            if (0 == (value % i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
