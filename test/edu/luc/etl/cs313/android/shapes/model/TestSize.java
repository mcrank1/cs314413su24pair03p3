package edu.luc.etl.cs313.android.shapes.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static edu.luc.etl.cs313.android.shapes.model.Fixtures.*;

public class TestSize {

	protected Size v;

	@Before
	protected void setUp() {
		v = new Size();
	}

	@After
	protected void tearDown() {
		v = null;
	}

	@Test
	public void testCircle() {
		assertEquals(1, new Circle(50).accept(v).intValue());
	}

	@Test
	public void testRectangle() {
		assertEquals(1, new Rectangle(80, 120).accept(v).intValue());
	}

	@Test
	public void testLocation() {
		assertEquals(1, simpleLocation.accept(v).intValue());
	}

	@Test
	public void testFill() {
		assertEquals(1, simpleFill.accept(v).intValue());
	}

	@Test
	public void testStroke() {
		assertEquals(1, simpleStroke.accept(v).intValue());
	}

	@Test
	public void testGroupSimple() {
		assertEquals(2, simpleGroup.accept(v).intValue());
	}

	@Test
	public void testGroupComplex() {
		assertEquals(6, complexGroup.accept(v).intValue());
	}

	@Test
	public void testOutline() {
		assertEquals(1, simpleOutline.accept(v).intValue());
	}

	@Test
	public void testPolygon() {
		assertEquals(1, simplePolygon.accept(v).intValue());
	}
}
