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
public class BankCharges2Test {
    
    public BankCharges2Test() {
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
     * Test of BankCharges method, of class BankCharges2.
     */
    @Test
    public void testBankCharges() {
        System.out.println("BankCharges");
        int checks = 118;
        String expResult = "Your total due this month is $14.719999999999999";
        String result = BankCharges2.BankCharges(checks);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testBankCharges1() {
        System.out.println("BankCharges");
        int checks = 0;
        String expResult = "Your total due this month is $10.0";
        String result = BankCharges2.BankCharges(checks);
        assertEquals(expResult, result);
        
    }
    
    
}
