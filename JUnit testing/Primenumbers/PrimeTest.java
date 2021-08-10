import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    public void test(){
        Prime testing= new Prime();
        //13 is a prime number so the IsPrime method is suppose to return 1
        int ouput = testing.isPrime(13);
        assertEquals(ouput,1);

    }
}