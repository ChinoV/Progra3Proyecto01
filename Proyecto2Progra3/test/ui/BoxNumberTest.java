/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfredo Valverde
 */
public class BoxNumberTest {
    
    public BoxNumberTest() {
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
     * Test of draw method, of class BoxNumber.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g2 = null;
        BoxNumber instance = new BoxNumber();
        instance.draw(g2);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class BoxNumber.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        BoxNumber instance = new BoxNumber();
        String expResult = "";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class BoxNumber.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        String number = "";
        BoxNumber instance = new BoxNumber();
        instance.setNumber(number);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class BoxNumber.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        BoxNumber instance = new BoxNumber();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class BoxNumber.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int number = 0;
        BoxNumber instance = new BoxNumber();
        instance.setValue(number);
        
        fail("The test case is a prototype.");
    }
    
}
