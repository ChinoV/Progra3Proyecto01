/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2progra3;

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
public class PilaTest {
    
    public PilaTest() {
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
     * Test of getCabeza method, of class Pila.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        Pila instance = new Pila();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCabeza method, of class Pila.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Pila instance = new Pila();
        instance.setCabeza(null);
        
        
    }

    /**
     * Test of Push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        Object _objeto = null;
        Pila instance = new Pila();
        instance.Push(_objeto);
        
        
    }

    /**
     * Test of Pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("Pop");
        Pila instance = new Pila();
        Object expResult = null;
        Object result = instance.Pop();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Peek method, of class Pila.
     */
    @Test
    public void testPeek() {
        System.out.println("Peek");
        Pila instance = new Pila();
        Object expResult = null;
        Object result = instance.Peek();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of IsEmpty method, of class Pila.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Pila instance = new Pila();
        boolean expResult = false;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Size method, of class Pila.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of HeapSortAlgorithm method, of class Pila.
     */
    @Test
    public void testHeapSortAlgorithm() {
        System.out.println("HeapSortAlgorithm");
        Pila instance = new Pila();
        instance.HeapSortAlgorithm();
        
        
    }

    /**
     * Test of PilaConverter method, of class Pila.
     */
    @Test
    public void testPilaConverter() {
        System.out.println("PilaConverter");
        Pila pPila = null;
        Pila instance = new Pila();
        Cola expResult = null;
        Cola result = instance.PilaConverter(pPila);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of ColaConverter method, of class Pila.
     */
    @Test
    public void testColaConverter() {
        System.out.println("ColaConverter");
        Cola pCola = null;
        Pila instance = new Pila();
        Pila expResult = null;
        Pila result = instance.ColaConverter(pCola);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getString method, of class Pila.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Pila instance = new Pila();
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        
        
    }
    
}
