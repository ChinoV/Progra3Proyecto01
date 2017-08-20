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
public class ListaTest {
    
    public ListaTest() {
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
     * Test of getCabeza method, of class Lista.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        Lista instance = new Lista();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCabeza method, of class Lista.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Lista instance = new Lista();
        instance.setCabeza(null);
        
        
    }

    /**
     * Test of Add method, of class Lista.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        Object _objeto = null;
        Lista instance = new Lista();
        instance.Add(_objeto);
        
        
    }

    /**
     * Test of IsEmpty method, of class Lista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Size method, of class Lista.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Show method, of class Lista.
     */
    @Test
    public void testShow() {
        System.out.println("Show");
        Lista instance = new Lista();
        instance.Show();
        
        
    }

    /**
     * Test of getString method, of class Lista.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Lista instance = new Lista();
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of MergeSort method, of class Lista.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        Lista instance = new Lista();
        instance.MergeSort();
        
        
    }

    /**
     * Test of esCedula method, of class Lista.
     */
    @Test
    public void testEsCedula() {
        System.out.println("esCedula");
        String Documento = "";
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.esCedula(Documento);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of OrdenarPrioridad method, of class Lista.
     */
    @Test
    public void testOrdenarPrioridad() {
        System.out.println("OrdenarPrioridad");
        Lista instance = new Lista();
        instance.OrdenarPrioridad();
        
        
    }

    /**
     * Test of brickSort method, of class Lista.
     */
    @Test
    public void testBrickSort() {
        System.out.println("brickSort");
        Lista p = null;
        Lista instance = new Lista();
        instance.brickSort(p);
        
        
    }
    
}
