/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import components.Classe;
import testEntity.TestEntity;

public class ClasseTest {

	private Classe classe;

	@Before
	public void setUp() {
		TestEntity testEntity = new TestEntity();
		classe = testEntity.getClasse();
	}

	@Test
	public void testGetNom() {
		assertEquals("TestClasse", classe.getNom());
	}

	@Test
	public void testGetCapacitat() {
		assertEquals(100, classe.getCapacitat());
	}
}
