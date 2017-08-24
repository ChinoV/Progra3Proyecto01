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
 * @author Alfredo V
 */
public class ListaCircularTest {
    
    public ListaCircularTest() {
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
     * Test of getCabeza method, of class ListaCircular.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaCircular instance = new ListaCircular();
        NodoD expResult = null;
        NodoD result = instance.getCabeza();
        assertEquals(expResult, result);
        

    }

    /**
     * Test of setCabeza method, of class ListaCircular.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        ListaCircular instance = new ListaCircular();
        instance.setCabeza(null);
        

    }

    /**
     * Test of InsertarInicio method, of class ListaCircular.
     */
    @Test
    public void testInsertarInicio() {
        System.out.println("InsertarInicio");
        Object objeto = null;
        ListaCircular instance = new ListaCircular();
        instance.InsertarInicio(objeto);
        

    }

    /**
     * Test of IsEmpty method, of class ListaCircular.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        ListaCircular instance = new ListaCircular();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of Size method, of class ListaCircular.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        ListaCircular instance = new ListaCircular();
        int expResult = 0;
        assertEquals(expResult, instance.Size());
    }

    /**
     * Test of getString method, of class ListaCircular.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        ListaCircular instance = new ListaCircular();
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        

    }

    /**
     * Test of InsertarFinal method, of class ListaCircular.
     */
    @Test
    public void testInsertarFinal() {
        System.out.println("InsertarFinal");
        Object objeto = null;
        ListaCircular instance = new ListaCircular();
        instance.InsertarFinal(objeto);
        

    }

    /**
     * Test of MergeSort method, of class ListaCircular.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort"); 
        ListaCircular instance = new ListaCircular();
        instance.InsertarFinal(new Persona("E52461", 20, "a", "b", "c")); 
        instance.InsertarFinal(new Persona("1-1432-0004", 20, "a", "b", "c"));
        instance.InsertarFinal(new Persona("2-1487-0004", 20, "a", "b", "c"));
        instance.InsertarFinal(new Persona("3-1437-0004", 20, "a", "b", "c"));
        
        ListaCircular ordenar = new ListaCircular();
        ordenar.InsertarFinal(new Persona("3-1437-0004", 20, "a", "b", "c"));
        ordenar.InsertarFinal(new Persona("E52461", 20, "a", "b", "c"));
        ordenar.InsertarFinal(new Persona("2-1487-0004", 20, "a", "b", "c"));
        ordenar.InsertarFinal(new Persona("1-1432-0004", 20, "a", "b", "c"));
        
        ordenar.MergeSort();
        assertEquals(((Persona)instance.getCabeza().getObjeto()).getCedula(), ((Persona)ordenar.getCabeza().getObjeto()).getCedula());
    }
    
}
