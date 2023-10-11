/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradedescuentos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamil
 */
public class DiscountCalculatorIT {
    
    public DiscountCalculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularDescuento method, of class DiscountCalculator.
     */
    @Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento");
        double precioOriginal = 200.0;
        double precioPagado = 180.0;
        DiscountCalculator instance = new DiscountCalculator();
        double expResult = 10.0;
        double result = instance.calcularDescuento(precioOriginal, precioPagado);
        assertEquals(expResult, result, 10.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
