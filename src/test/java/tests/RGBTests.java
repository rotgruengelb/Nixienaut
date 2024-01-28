package tests;

import net.rotgruengelb.nixienaut.math.RGB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RGBTests {

	@Test
	void testConstructorAndGetters() {
		RGB color = new RGB(255, 128, 0);

		assertEquals(255, color.r());
		assertEquals(128, color.g());
		assertEquals(0, color.b());
	}

	@Test
	void testFromInt() {
		RGB color = RGB.fromInt(0xFFAABB);

		assertEquals(0xFF, color.r());
		assertEquals(0xAA, color.g());
		assertEquals(0xBB, color.b());
	}

	@Test
	void testFromHex() {
		RGB color1 = new RGB(0, 255, 0);
		RGB color2 = RGB.fromHex("#00FF60");

		assertEquals(0, color2.r());
		assertEquals(255, color2.g());
		assertEquals(96, color2.b());

		assertEquals(0, color1.r());
		assertEquals(255, color1.g());
		assertEquals(0, color1.b());
	}

	@Test
	void testToInt() {
		RGB color = new RGB(128, 64, 32);

		assertEquals(0x804020, color.toInt());
	}

	@Test
	void testToString() {
		RGB color = new RGB(255, 0, 128);

		assertEquals("RGB(255, 0, 128)", color.toString());
	}

	@Test
	void testToHex() {
		RGB color = new RGB(0, 128, 255);

		assertEquals("#0080FF", color.toHex());
	}

	@Test
	void testToArray() {
		RGB color = new RGB(64, 128, 192);

		int[] expectedArray = {64, 128, 192};
		assertArrayEquals(expectedArray, color.toArray());
	}

	@Test
	void testSetters() {
		RGB color = new RGB(0, 0, 0);

		color.r(255);
		color.g(128);
		color.b(64);

		assertEquals(255, color.r());
		assertEquals(128, color.g());
		assertEquals(64, color.b());
	}

	@Test
	void testInstancesAreIndependent() {
		RGB color1 = new RGB(0, 0, 0);
		RGB color2 = new RGB(255, 255, 255);

		color1.r(128);
		color1.g(64);
		color1.b(32);

		assertEquals(128, color1.r());
		assertEquals(64, color1.g());
		assertEquals(32, color1.b());

		assertEquals(255, color2.r());
		assertEquals(255, color2.g());
		assertEquals(255, color2.b());
	}

	@Test
	void testFromHexCreatesIndependentInstances() {
		RGB color1 = RGB.fromHex("#00FF00");
		RGB color2 = RGB.fromHex("#0000FF");

		color1.r(128);
		color1.b(32);

		assertEquals(128, color1.r());
		assertEquals(255, color1.g());
		assertEquals(32, color1.b());

		assertEquals(0, color2.r());
		assertEquals(0, color2.g());
		assertEquals(255, color2.b());
	}
}
