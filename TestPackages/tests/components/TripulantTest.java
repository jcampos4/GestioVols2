package tests.components;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import components.Tripulant;
import testEntity.TestEntity;

public class TripulantTest {
	Tripulant tripulant;
	Date dataAlta;

	@Before
	public void setUp() {
		TestEntity testEntity = new TestEntity();
		tripulant = testEntity.getTcp();

		dataAlta = new Date();
		tripulant.setDataAlta(dataAlta);
	}

	@Test
	public void testGetPassaport() {
		assertEquals("PassaportTest", tripulant.getPassaport());
	}

	@Test
	public void testSetPassaport() {
		tripulant.setPassaport("PassaportTest2");
		assertEquals("PassaportTest2", tripulant.getPassaport());
	}

	@Test
	public void testGetNom() {
		assertEquals("NomTest", tripulant.getNom());
	}

	@Test
	public void testSetNom() {
		tripulant.setNom("NomTest2");
		assertEquals("NomTest2", tripulant.getNom());
	}

	@Test
	public void testGetEdat() {
		assertEquals(40, tripulant.getEdat());
	}

	@Test
	public void testSetEdat() {
		tripulant.setEdat(15);
		assertEquals(15, tripulant.getEdat());
	}

	@Test
	public void testGetDataAlta() {
		assertEquals(dataAlta, tripulant.getDataAlta());
	}

	@Test
	public void testSetDataAlta() {
		dataAlta = new Date();
		tripulant.setDataAlta(dataAlta);
		assertEquals(dataAlta, tripulant.getDataAlta());
	}

	@Test
	public void testGetHoresVol() {
		assertEquals(100, tripulant.getHoresVol());
	}

	@Test
	public void testSetHoresVol() {
		tripulant.setHoresVol(200);
		assertEquals(200, tripulant.getHoresVol());
	}

	@Test
	public void testGetRang() {
		assertEquals(null, tripulant.getRang());
	}

	@Test
	public void testSetRang() {
		tripulant.setRang("C");
		assertEquals("C", tripulant.getRang());
	}
}
