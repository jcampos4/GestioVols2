package tests.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import components.Ruta;
import testEntity.TestEntity;

public class RutaTest {

	Ruta ruta;

	@Before
	public void setUp() {
		TestEntity testEntity = new TestEntity();
		ruta = testEntity.getRutaNacional();
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
}
