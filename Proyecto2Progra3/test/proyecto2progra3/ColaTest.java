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
public class ColaTest<T> {
    
    public ColaTest() {
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
     * Test of getCabeza method, of class Cola.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        Cola instance = new Cola();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCabeza method, of class Cola.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Cola instance = new Cola();
        instance.setCabeza(null);
    }

    /**
     * Test of Enqueue method, of class Cola.
     */
    @Test
    public void testEnqueue() {
        System.out.println("Enqueue");
        Object objeto = null;
        Cola instance = new Cola();
        instance.Enqueue(objeto);
        
        
    }

    /**
     * Test of Dequeue method, of class Cola.
     */
    @Test
    public void testDequeue() {
        System.out.println("Dequeue");
        Cola instance = new Cola();
        //T Aux = (T) instance.getCabeza().getObjeto();
        Object expResult = new Persona("3-1437-0004", 20, "a", "b", "c");
        Object result = instance.Dequeue();
        assertEquals(expResult, result);
    }

    /**
     * Test of Peek method, of class Cola.
     */
    @Test
    public void testPeek() {
        System.out.println("Peek");
        Cola instance = new Cola();
        Object expResult = null;
        Object result = instance.Peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of IsEmpty method, of class Cola.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Cola instance = new Cola();
        boolean expResult = false;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of Size method, of class Cola.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Cola instance = new Cola();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Show method, of class Cola.
     */
    @Test
    public void testShow() {
        System.out.println("Show");
        Cola instance = new Cola();
        instance.Show();
        
        
    }

    /**
     * Test of getString method, of class Cola.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Cola instance = new Cola();
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        
        
    }
    
}
