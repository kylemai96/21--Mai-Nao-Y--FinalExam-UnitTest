package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.StringCalculator;

class StringCalculatorTest {


	  @BeforeEach
	    public void setUp() {
	    }

	    @AfterEach
	    public void tearDown() {
	    }
	    
	    @Test
	    public void testNegative() { 
	        Throwable exception = Assertions.assertThrows(Exception.class, () -> {
	        StringCalculator.add("-1,5");
	        });
	    }
	    
	    @Test
	    public void testOver1000() throws Exception { 
	        assertEquals(5, StringCalculator.add("1001,5"));
	    }
	    
	    @Test
	    public void testOver10002() throws Exception { 
	        assertEquals(5, StringCalculator.add("5,1002"));
	    }
}

