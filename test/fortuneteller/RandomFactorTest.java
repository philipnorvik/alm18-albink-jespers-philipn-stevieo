package fortuneteller;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomFactorTest {
    
    @Test
    public void testZeroToNine() {
        System.out.println("zeroToNine");
      
        for (int i = 0; i < 100; i++) {
            int result = RandomFactor.zeroToNine();
            assertTrue(result < 10 && result >= 0);
        }
    }
}
