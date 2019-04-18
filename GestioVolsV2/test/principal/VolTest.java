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
   private Avio avio;
    private Ruta ruta;
    private Tripulant tripulant;
    
    @Before
    public void setUp() {
        LocalTime time1 = LocalTime.parse("20:18"); 
        LocalTime time2 = LocalTime.parse("23:18"); 
        vol = new Vol("125",new Date(2018-02-27),new Date(2018-03-27),time1,time2);
        avio = new Avio("145","Airplanes.SL","Boeing 747",300);
        
        
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
       assertEquals(ruta, vol.getRuta());
    }


    /**
     * Test of getAvio method, of class Vol.
     */
    @Test
    public void testGetAvio() {
 
        assertEquals(avio,vol.getAvio());
 
    }


    /**
     * Test of getDataSortida method, of class Vol.
     */
    @Test
    public void testGetDataSortida() {
       
        Date result = new Date(2018-02-27);
        assertEquals(result, vol.getDataSortida());
     
    }

    /**
     * Test of getDataArribada method, of class Vol.
     */
    @Test
    public void testGetDataArribada() {
        
	Date date = new Date(2018-03-27);
        assertEquals(date,vol.getDataArribada());
        
    }


    /**
     * Test of getHoraSortida method, of class Vol.
     */
    @Test
    public void testGetHoraSortida() {
        LocalTime result = LocalTime.parse("20:18"); ;
        assertEquals(result, vol.getHoraSortida());
        
    }

    /**
     * Test of getHoraArribada method, of class Vol.
     */
    @Test
    public void testGetHoraArribada() {
    
        LocalTime result = LocalTime.parse("23:18"); ;
        assertEquals(result, vol.getHoraArribada());
      
    }




}
