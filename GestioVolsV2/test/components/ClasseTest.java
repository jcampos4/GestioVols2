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
public class ClasseTest {
    
    private Classe classe;
    
    @Before
    public void setUp() {
        classe = new Classe("Ryaner",155);
    }
  

    /**
     * Test of getNom method, of class Classe.
     */
    @Test
    public void testGetNom() {

        assertEquals("Ryaner", classe.getNom());

    }

 

    /**
     * Test of getCapacitat method, of class Classe.
     */
    @Test
    public void testGetCapacitat() {
        
        assertEquals(155, classe.getCapacitat());
     
    }



    
}
