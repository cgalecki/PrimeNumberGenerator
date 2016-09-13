import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumbersTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
    
    @Test
    public void primeNumbersTestBaseCase() {
        String[] args = {"8", "12"};
        
        PrimeNumbers.main(args);
        assertEquals("11" + System.getProperty("line.separator"), outContent.toString());
    }
    
    @Test
    public void primeNumbersTestOneInput() {
        String[] args = {"7900"};
        String errorMsg = "Input must be two integers." + System.getProperty("line.separator");
        
        PrimeNumbers.main(args);
        assertEquals(errorMsg, errContent.toString());
    }

    @Test
    public void primeNumbersTestThreeInput() {
        String[] args = {"7900", "7800", "7902"};
        String errorMsg = "Input must be two integers." + System.getProperty("line.separator");
        
        PrimeNumbers.main(args);
        assertEquals(errorMsg, errContent.toString());
    }

    @Test
    public void primeNumbersTestNonIntegerInput() {
        String[] args = {"b", "a"};
        String errorMsg = "Input must be two integers." + System.getProperty("line.separator");
        
        PrimeNumbers.main(args);
        assertEquals(errorMsg, errContent.toString());
    }

    @Test
    public void primeNumbersTestOneIntegerInput() {
        String[] args = {"2", "a"};
        String errorMsg = "Input must be two integers." + System.getProperty("line.separator");
        
        PrimeNumbers.main(args);
        assertEquals(errorMsg, errContent.toString());
    }
}
