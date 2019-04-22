/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import components.RutaNacional;
import testEntity.TestEntity;

public class RutaNacionalTest {
	private RutaNacional ruta;

	@Before
	public void setUp() {
		TestEntity ts = new TestEntity();
		ruta = ts.getRutaNacional();
	}

	@Test
	public void testGetCodi() {
		assertEquals("CODITEST", ruta.getCodi());
	}

	@Test
	public void testSetCodi() {
		ruta.setCodi("CODITEST2");
		assertEquals("CODITEST2", ruta.getCodi());
	}

	@Test
	public void testGetAeroportOri() {
		assertEquals("AeroportOrigenTest", ruta.getAeroportOri());
	}

	@Test
	public void testSetAeroportOri() {
		ruta.setAeroportOri("AeroportOrigenTest2");
		assertEquals("AeroportOrigenTest2", ruta.getAeroportOri());
	}

	@Test
	public void testGetAeroportDes() {
		assertEquals("AeroportDestíTest", ruta.getAeroportDes());

	}

	@Test
	public void testSetAeroportDes() {
		ruta.setAeroportDes("AeroportDestíTest2");
		assertEquals("AeroportDestíTest2", ruta.getAeroportDes());
	}

	@Test
	public void testGetDistancia() {
		assertEquals(String.valueOf(1000.0), String.valueOf(ruta.getDistancia()));
	}

	@Test
	public void testSetDistancia() {
		ruta.setDistancia(2000.0);
		assertEquals(String.valueOf(2000.0), String.valueOf(ruta.getDistancia()));
	}

	@Test
	public void testGetPais() {
		assertEquals("País", ruta.getPais());
	}

	@Test
	public void testSetPais() {
		ruta.setPais("PaisTest2");
		assertEquals("PaisTest2", ruta.getPais());
	}

}
