/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
public class CompanyiaTest {
    
    private Companyia companyia;
    
    @Before
    public void setUp() {
        companyia = new Companyia("Ryaner");
        
    }

    /**
     * Test of getCodi method, of class Companyia.
     */
    @Test
    public void testGetCodi() {
  
        assertEquals(1, companyia.getCodi());

    }
    /**
     * Test of getProperCodi method, of class Companyia.
     */
    @Test
    public void testGetProperCodi() {

        assertEquals(2, companyia.getCodi()+1);
       
    }
    /**
     * Test of getNom method, of class Companyia.
     */
    @Test
    public void testGetNom() {

        assertEquals("Ryaner", companyia.getNom());
    
    }

}
