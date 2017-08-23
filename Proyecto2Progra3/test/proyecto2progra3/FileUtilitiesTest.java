/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2progra3;

import java.util.ArrayList;
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
public class FileUtilitiesTest {
    
    public FileUtilitiesTest() {
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
     * Test of AgregarAHistorial method, of class UtilidadesDeArchivo.
     */
    @Test
    public void testAgregarAHistorial() {
        System.out.println("AgregarAHistorial");
        String mensaje = "";
        UtilidadesDeArchivo instance = new UtilidadesDeArchivo();
        instance.AgregarAHistorial(mensaje);
        
        
    }

    /**
     * Test of ObtenerHistorial method, of class UtilidadesDeArchivo.
     */
    @Test
    public void testObtenerHistorial() {
        System.out.println("ObtenerHistorial");
        UtilidadesDeArchivo instance = new UtilidadesDeArchivo();
        ArrayList<InformacionAlgoritmo> expResult = null;
        ArrayList<InformacionAlgoritmo> result = instance.ObtenerHistorial();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of LimpiarHistorial method, of class UtilidadesDeArchivo.
     */
    @Test
    public void testLimpiarHistorial() {
        System.out.println("LimpiarHistorial");
        UtilidadesDeArchivo instance = new UtilidadesDeArchivo();
        instance.LimpiarHistorial();
        
        
    }
    
}
