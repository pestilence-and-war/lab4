/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Master
 */
public class Insurance2Test {
    
    public Insurance2Test() {
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
     * Test of quote method, of class Insurance2.
     */
    @Test
    public void testQuote() {
        System.out.println("quote");
        int age = 45;
        int expResult = 525;
        int result = Insurance2.quote(age);
        assertEquals(expResult, result);
       
        
    }
    @Test
    public void testQuote1() {
        System.out.println("quote");
        int age = 21;
        int expResult = 405;
        int result = Insurance2.quote(age);
        assertEquals(expResult, result);
       
        
    }
   
    
}
