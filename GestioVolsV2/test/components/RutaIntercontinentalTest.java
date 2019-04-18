/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

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
public class RutaIntercontinentalTest {
  
    private RutaIntercontinental   rutaIntercontinental;
    

    @Before
    public void setUp() {
        rutaIntercontinental = new RutaIntercontinental("1","Barcelona","Texas","Espanya", "EEUU","Europa","America",1000.5 );
           
    }
    
    /**
     * Test of getContinentOri method, of class RutaIntercontinental.
     */
    @Test
    public void testGetContinentOri() {
         assertEquals("Europa", rutaIntercontinental.getContinentOri());
    }


    /**
     * Test of getContinentDes method, of class RutaIntercontinental.
     */
    @Test
    public void testGetContinentDes() {
         assertEquals("America", rutaIntercontinental.getContinentDes());
    }



}
