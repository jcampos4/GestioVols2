package tests.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import components.RutaTransoceanica;
import testEntity.TestEntity;

public class RutaTransoceanicaTest {

	RutaTransoceanica ruta;

	@Before
	public void setUp() {
		TestEntity testEntity = new TestEntity();
		ruta = testEntity.getRutaTransoceanica();
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

	public void testGetPaisOri() {
		assertEquals("PaísOrigen", ruta.getPaisOri());
	}

	public void testSetPaisOri(String paisOri) {
		ruta.setPaisOri("PaísOrigen2");
		assertEquals("PaísOrigen2", ruta.getPaisOri());
	}

	public void testGetPaisDes() {
		assertEquals("PaísDestí", ruta.getPaisDes());
	}

	public void testSetPaisDes(String paisDes) {
		ruta.setPaisDes("PaísDestí2");
		assertEquals("PaísDestí2", ruta.getPaisDes());
	}

	public void testGetOcea() {
		assertEquals("OceàTest", ruta.getOcea());
	}

	public void testSetOcea(String ocea) {
		ruta.setOcea("ocea2");
		assertEquals("ocea2", ruta.getOcea());
	}
}
