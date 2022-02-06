package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void getFact() {
        assertEquals(120,Factorial.getFact(5));
        assertEquals(0,Factorial.getFact(0));
    }

    @Test
    void checkNegative(){
        assertEquals(0,Factorial.getFact(-7));
    }
}