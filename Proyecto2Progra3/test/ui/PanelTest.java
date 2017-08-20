/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics;
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
public class PanelTest {
    
    public PanelTest() {
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
     * Test of paintComponent method, of class Panel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Panel instance = new Panel();
        instance.paintComponent(g);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of generar method, of class Panel.
     */
    @Test
    public void testGenerar() {
        System.out.println("generar");
        Panel instance = new Panel();
        instance.generar();
        
        
    }

    /**
     * Test of Brick method, of class Panel.
     */
    @Test
    public void testBrick() {
        System.out.println("Brick");
        Panel instance = new Panel();
        instance.Brick();
        
        fail("The test case is a prototype.");
    }
    
}
