package tests;

import net.rotgruengelb.nixienaut.math.ClampedNum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClampedNumTests {

	@Test
	public void testValidInitialization() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		assertNull(clampedNum.get());
	}

	@Test
	public void testValidSetValue() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		clampedNum.set(50);
		assertEquals(Integer.valueOf(50), clampedNum.get());
	}

	@Test
	public void testSetValueBelowMin() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		try {
			clampedNum.set(-1);
			fail("IllegalArgumentException should be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Value must be between 0 and 100 inclusive.", e.getMessage());
		}
	}

	@Test
	public void testSetValueAboveMax() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		try {
			clampedNum.set(101);
			fail("IllegalArgumentException should be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Value must be between 0 and 100 inclusive.", e.getMessage());
		}
	}

	@Test
	public void testSetValueEqualMin() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		clampedNum.set(0);
		assertEquals(Integer.valueOf(0), clampedNum.get());
	}

	@Test
	public void testSetValueEqualMax() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		clampedNum.set(100);
		assertEquals(Integer.valueOf(100), clampedNum.get());
	}

	@Test
	public void testSetValueWithinRange() {
		ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
		clampedNum.set(50);
		assertEquals(Integer.valueOf(50), clampedNum.get());
	}
}