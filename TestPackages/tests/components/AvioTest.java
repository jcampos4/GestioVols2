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
	public void getCodi() {
		assertEquals("CODITEST", avio.getCodi());
	}

	@Test
	public void setCodi() {
		avio.setCodi("CODITEST2");
		assertEquals("CODITEST2", avio.getCodi());
	}

	@Test
	public void getFabricant() {
		assertEquals("FabricantTest", avio.getFabricant());
	}

	@Test
	public void setFabricant() {
		avio.setFabricant("FabricantTest2");
		assertEquals("FabricantTest2", avio.getFabricant());
	}

	@Test
	public void getModel() {
		assertEquals("ModelTest", avio.getModel());
	}

	@Test
	public void setModel() {
		avio.setModel("ModelTest2");
		assertEquals("ModelTest2", avio.getModel());
	}

	@Test
	public void getCapacitat() {
		assertEquals(100, avio.getCapacitat());
	}

	@Test
	public void setCapacitat() {
		avio.setCapacitat(200);
		assertEquals(200, avio.getCapacitat());
	}

	@Test
	public void getClasses() {
		assertEquals(classe, avio.getClasses()[0]);
	}

	@Test
	public void seleccionarClasse() {
		assertEquals(0, avio.seleccionarClasse("TestClasse"));
	}

	@Test
	public void setClasses() {
		Classe[] classeTestSetClasse = { new Classe("TestClasse2", 200) };
		avio.setClasses(classeTestSetClasse);
		assertEquals(classeTestSetClasse[0].getNom(), avio.getClasses()[0].getNom());
	}

	@Test
	public void getPosicioClasses() {
		assertEquals(1, avio.getPosicioClasses());
	}

	@Test
	public void setPosicioClasses() {
		avio.setPosicioClasses(2);
		assertEquals(2, avio.getPosicioClasses());
	}
}
