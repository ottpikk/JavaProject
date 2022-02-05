package testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add test 1")
    void add1(){
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.add(10,6);
        //Then
        assertEquals(16, result);
    }

    @Test
    @DisplayName("Add test 2")
    void add2(){
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.add(-5,6);
        //Then
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Sub test 1")
    void sub1(){
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.sub(20,7);
        //Then
        assertEquals(13,result);
    }

    @Test
    @DisplayName("Sub test 1")
    void sub2(){
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.sub(10,5);
        //Then
        assertEquals(5,result);
    }

}