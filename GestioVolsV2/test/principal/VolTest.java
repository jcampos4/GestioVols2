/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import components.Avio;
import components.Ruta;
import components.TCP;
import components.Tripulant;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose DAW
 */
public class VolTest {
    
   private Vol vol;
    
    @Before
    public void setUp() {
        LocalTime time1 = LocalTime.parse("20:18"); 
        LocalTime time2 = LocalTime.parse("23:18"); 
        vol = new Vol("125",new Date(2018-02-27),new Date(2018-03-27),time1,time2);
        ruta = new RutaNacional();
    }
    
 
    /**
     * Test of getCodi method, of class Vol.
     */
    @Test
    public void testGetCodi() {
       
        assertEquals("125", vol.getCodi());
        
    }


    /**
     * Test of getRuta method, of class Vol.
     */
    @Test
    public void testGetRuta() {
       assertEquals(expResult, vol.getRuta());
    }


    /**
     * Test of getAvio method, of class Vol.
     */
    @Test
    public void testGetAvio() {
        System.out.println("getAvio");
        Vol instance = null;
        Avio expResult = null;
        Avio result = instance.getAvio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of getTripulacio method, of class Vol.
     */
    @Test
    public void testGetTripulacio() {
        System.out.println("getTripulacio");
        Vol instance = null;
        Tripulant[] expResult = null;
        Tripulant[] result = instance.getTripulacio();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getPosicioTripulacio method, of class Vol.
     */
    @Test
    public void testGetPosicioTripulacio() {
        System.out.println("getPosicioTripulacio");
        Vol instance = null;
        int expResult = 0;
        int result = instance.getPosicioTripulacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSortida method, of class Vol.
     */
    @Test
    public void testGetDataSortida() {
        System.out.println("getDataSortida");
        Vol instance = null;
        Date expResult = null;
        Date result = instance.getDataSortida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataArribada method, of class Vol.
     */
    @Test
    public void testGetDataArribada() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date(2016/11/16);
	dateFormat.format(date); //2016/11/16 12:08:43
       
        assertEquals(date,vol.getDataArribada());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getHoraSortida method, of class Vol.
     */
    @Test
    public void testGetHoraSortida() {
        System.out.println("getHoraSortida");
        Vol instance = null;
        LocalTime expResult = null;
        LocalTime result = instance.getHoraSortida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraArribada method, of class Vol.
     */
    @Test
    public void testGetHoraArribada() {
        System.out.println("getHoraArribada");
        Vol instance = null;
        LocalTime expResult = null;
        LocalTime result = instance.getHoraArribada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getDurada method, of class Vol.
     */
    @Test
    public void testGetDurada() {
        System.out.println("getDurada");
        Vol instance = null;
        String expResult = "";
        String result = instance.getDurada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of getCap method, of class Vol.
     */
    @Test
    public void testGetCap() {
        System.out.println("getCap");
        Vol instance = null;
        TCP expResult = null;
        TCP result = instance.getCap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
