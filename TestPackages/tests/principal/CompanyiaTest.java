/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.principal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import principal.Companyia;
import testEntity.TestEntity;

public class CompanyiaTest {

	private Companyia companyia;

	@Before
	public void setUp() {
		TestEntity ts = new TestEntity();
		companyia = ts.getCompanyia();

	}

	@Test
	public void testGetCodi() {

		assertEquals(1, companyia.getCodi());

	}

	@Test
	public void testGetProperCodi() {

		assertEquals(2, companyia.getCodi() + 1);

	}

	@Test
	public void testGetNom() {

		assertEquals("CompanyiaTest", companyia.getNom());

	}

}
