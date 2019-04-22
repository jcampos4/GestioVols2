/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import components.RutaIntercontinental;
import testEntity.TestEntity;

public class RutaIntercontinentalTest {

	private RutaIntercontinental rutaIntercontinental;

	@Before
	public void setUp() {
		TestEntity ts = new TestEntity();
		rutaIntercontinental = ts.getRutaIntercontinental();
	}

	@Test
	public void testGetCodi() {
		assertEquals("CODITEST", rutaIntercontinental.getCodi());
	}

	@Test
	public void testSetCodi() {
		rutaIntercontinental.setCodi("CODITEST2");
		assertEquals("CODITEST2", rutaIntercontinental.getCodi());
	}

	@Test
	public void testGetAeroportOri() {
		assertEquals("AeroportOrigenTest", rutaIntercontinental.getAeroportOri());
	}

	@Test
	public void testSetAeroportOri() {
		rutaIntercontinental.setAeroportOri("AeroportOrigenTest2");
		assertEquals("AeroportOrigenTest2", rutaIntercontinental.getAeroportOri());
	}

	@Test
	public void testGetAeroportDes() {
		assertEquals("AeroportDestíTest", rutaIntercontinental.getAeroportDes());

	}

	@Test
	public void testSetAeroportDes() {
		rutaIntercontinental.setAeroportDes("AeroportDestíTest2");
		assertEquals("AeroportDestíTest2", rutaIntercontinental.getAeroportDes());
	}

	@Test
	public void testGetDistancia() {
		assertEquals(String.valueOf(1000.0), String.valueOf(rutaIntercontinental.getDistancia()));
	}

	@Test
	public void testSetDistancia() {
		rutaIntercontinental.setDistancia(2000.0);
		assertEquals(String.valueOf(2000.0), String.valueOf(rutaIntercontinental.getDistancia()));
	}

	public void testGetPaisOri() {
		assertEquals("PaísOrigen", rutaIntercontinental.getPaisOri());
	}

	public void testSetPaisOri() {
		rutaIntercontinental.setPaisOri("PaísOrigen2");
		assertEquals("PaísOrigen2", rutaIntercontinental.getPaisOri());
	}

	public void testGetPaisDes() {
		assertEquals("PaísDestí", rutaIntercontinental.getPaisDes());
	}

	public void testSetPaisDes() {
		rutaIntercontinental.setPaisDes("PaísDestí2");
		assertEquals("PaísDestí2", rutaIntercontinental.getPaisDes());
	}

	public void testGetContinentOri() {
		assertEquals("ContinentOrigen", rutaIntercontinental.getPaisOri());
	}

	public void testSetContinentOri() {
		rutaIntercontinental.setPaisOri("ContinentOrigen2");
		assertEquals("ContinentOrigen2", rutaIntercontinental.getContinentOri());
	}

	public void testGetContinentDes() {
		assertEquals("ContinentDestí", rutaIntercontinental.getContinentDes());
	}

	public void testSetContinentDes() {
		rutaIntercontinental.setPaisDes("ContinentDestí2");
		assertEquals("ContinentDestí2", rutaIntercontinental.getContinentDes());
	}

}
