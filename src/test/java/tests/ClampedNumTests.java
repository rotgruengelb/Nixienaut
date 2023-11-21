package tests;

import net.rotgruengelb.nixienaut.ClampedNum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClampedNumTests {

    @Test
    public void testValidInitialization() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        assertNull(clampedNum.getValue());
    }

    @Test
    public void testValidSetValue() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        clampedNum.setValue(50);
        assertEquals(Integer.valueOf(50), clampedNum.getValue());
    }

    @Test
    public void testSetValueBelowMin() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        try {
            clampedNum.setValue(-1);
            fail("IllegalArgumentException should be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Value must be between 0 and 100 inclusive.", e.getMessage());
        }
    }

    @Test
    public void testSetValueAboveMax() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        try {
            clampedNum.setValue(101);
            fail("IllegalArgumentException should be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Value must be between 0 and 100 inclusive.", e.getMessage());
        }
    }

    @Test
    public void testSetValueEqualMin() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        clampedNum.setValue(0);
        assertEquals(Integer.valueOf(0), clampedNum.getValue());
    }

    @Test
    public void testSetValueEqualMax() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        clampedNum.setValue(100);
        assertEquals(Integer.valueOf(100), clampedNum.getValue());
    }

    @Test
    public void testSetValueWithinRange() {
        ClampedNum<Integer> clampedNum = new ClampedNum<>(0, 100);
        clampedNum.setValue(50);
        assertEquals(Integer.valueOf(50), clampedNum.getValue());
    }
}