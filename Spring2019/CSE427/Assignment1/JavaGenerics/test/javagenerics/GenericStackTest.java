/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yen
 */
public class GenericStackTest {
    
    Object x = null;
    Object expResult = null;
    GenericStack gene = null;
    
    public GenericStackTest() {
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

    @Test
    public void testPush() {
        try {
            gene.push(x);
            System.out.println("push method works");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }

    @Test
    public void testPop() {
        try {
            Object result = gene.pop();
            assertEquals(expResult, result);
            System.out.println("pop works");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }

    @Test
    public void testIsEmpty() {
        try {
            boolean result =gene.isEmpty();
            assertFalse(result);
            System.out.println("isEmpty works");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        
        
        
        
    }
    
}
