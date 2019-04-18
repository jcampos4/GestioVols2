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
public class TripulantCabinaTest {
    
    private TripulantCabina tripulantCabina;
    @Before
    public void setUp() {
        
        tripulantCabina = new TripulantCabina("236548987M", "Juan", 45, 2000,"C");
        
  
    }
    

    /**
     * Test of getBarres method, of class TripulantCabina.
     */
    @Test
    public void testGetBarres() {
        assertEquals(4, tripulantCabina.getBarres());
    }

    
    
}
