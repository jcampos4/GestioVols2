package tests.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import components.Avio;
import components.Classe;
import testEntity.TestEntity;

public class AvioTest {
	Avio avio;
	Classe classe;

	@Before
	public void setUp() {
		TestEntity testEntity = new TestEntity();
		avio = testEntity.getAvio();
		classe = testEntity.getClasse();
	}

	@Test
	public void testGetCodi() {
		assertEquals("CODITEST", avio.getCodi());
	}

	@Test
	public void testSetCodi() {
		avio.setCodi("CODITEST2");
		assertEquals("CODITEST2", avio.getCodi());
	}

	@Test
	public void testGetFabricant() {
		assertEquals("FabricantTest", avio.getFabricant());
	}

	@Test
	public void testSetFabricant() {
		avio.setFabricant("FabricantTest2");
		assertEquals("FabricantTest2", avio.getFabricant());
	}

	@Test
	public void testGetModel() {
		assertEquals("ModelTest", avio.getModel());
	}

	@Test
	public void testSetModel() {
		avio.setModel("ModelTest2");
		assertEquals("ModelTest2", avio.getModel());
	}

	@Test
	public void testGetCapacitat() {
		assertEquals(100, avio.getCapacitat());
	}

	@Test
	public void testSetCapacitat() {
		avio.setCapacitat(200);
		assertEquals(200, avio.getCapacitat());
	}

	@Test
	public void testGetClasses() {
		assertEquals(classe, avio.getClasses()[0]);
	}

	@Test
	public void testSeleccionarClasse() {
		assertEquals(0, avio.seleccionarClasse("TestClasse"));
	}

	@Test
	public void testSetClasses() {
		Classe[] classeTestSetClasse = { new Classe("TestClasse2", 200) };
		avio.setClasses(classeTestSetClasse);
		assertEquals(classeTestSetClasse[0].getNom(), avio.getClasses()[0].getNom());
	}

	@Test
	public void testGetPosicioClasses() {
		assertEquals(1, avio.getPosicioClasses());
	}

	@Test
	public void testSetPosicioClasses() {
		avio.setPosicioClasses(2);
		assertEquals(2, avio.getPosicioClasses());
	}
}
