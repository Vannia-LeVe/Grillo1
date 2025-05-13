/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.grillo.entities;

import java.util.Date;
import mx.itson.grillo.enums.WeatherStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class ForecastTest {
    
    public ForecastTest() {
    }
  

    /**
     * Test of convertirFarenheit method, of class Forecast.
     */
    @Test
    public void testConvertirFarenheit() {
        System.out.println("convertirFarenheit");
        int temp = 45;
        double expResult = 113;
        double result = Forecast.convertirFarenheit(temp);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
