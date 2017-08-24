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
        Object expResult = null;
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
        boolean expResult = true;
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
    
    /**
     * Test of getString method, of class Cola.
     */
    @Test
    public void testBrickSort() {
        System.out.println("testBrickSort");
        
        Lista<Persona> toFixPersonas = new Lista<Persona>(); 
        toFixPersonas.Add(new Persona("3-1437-0004", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("E52461", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("3-1427-0004", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("E52261", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("2-1487-0004", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("1-1432-0004", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("1-1417-0004", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("2-1437-1004", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("1-1437-0224", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("E12461", 20, "a", "b", "c"));
        toFixPersonas.Add(new Persona("E51461", 20, "a", "b", "c"));
        toFixPersonas.brickSort(toFixPersonas);
        
        Lista<Persona> resultPersonas = new Lista<Persona>(); 
        resultPersonas.Add(new Persona("1-1417-0004", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("1-1432-0004", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("1-1437-0224", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("2-1437-1004", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("2-1487-0004", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("3-1427-0004", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("3-1437-0004", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("E12461", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("E51461", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("E52261", 20, "a", "b", "c"));
        resultPersonas.Add(new Persona("E52461", 20, "a", "b", "c"));
            
        
        boolean expResult = true;
        
        Nodo Aux = toFixPersonas.getCabeza();
        Nodo Aux2 = resultPersonas.getCabeza();
        while (Aux != null)
        {
            Persona persona1 = (Persona)Aux.getObjeto();
            Persona persona2 = (Persona)Aux2.getObjeto();
            String cedula1 = persona1.getCedula();
            String cedula2 = persona2.getCedula();
            if (!cedula1.equals(cedula2))
            {
                expResult = false;
            }
            Aux = Aux.getSiguiente(); 
            Aux2 = Aux2.getSiguiente(); 
        }
        assertEquals(expResult, true);
    }
    
}
