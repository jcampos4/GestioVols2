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
public class RutaNacionalTest {
    private RutaNacional rutaNacional;
    
    @Before
    public void setUp() {
        rutaNacional = new RutaNacional("1", "Espanya","El Prat", "Barajas", 200.60);
        
    }
    
    /**
     * Test of getPais method, of class RutaNacional.
     */
    @Test
    public void testGetPais() {
        assertEquals("Espanya", rutaNacional.getPais());
    }

   
}
