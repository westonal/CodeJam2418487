package com.codejam;

import static com.codejam.CalculateRings.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTestCases {

	@Test
	public void ink_volume() {
		assertEquals((float) Math.PI, inkVolume(1), 0.0001f);
	}

	@Test
	public void ink_volume_in_ring() {
		assertEquals((float) Math.PI * 3, inkVolumeInRing(2, 1), 0.0001f);
	}

	@Test
	public void ink_volume_10() {
		assertEquals((float) Math.PI * 100, inkVolume(10), 0.0001f);
	}

	@Test
	public void ink_volume_in_ring_pi_ml() {
		assertEquals((float) Math.PI * 3, pMLinkVolumeInRing(2, 1) * Math.PI,
				0.0001f);
	}

	@Test
	public void test_case_1() {
		assertEquals(1, maxRings(1, 9));
	}

	@Test
	public void test_case_2() {
		assertEquals(2, maxRings(1, 10));
	}

	@Test
	public void test_case_3() {
		assertEquals(3, maxRings(3, 40));
	}

	@Test
	public void test_case_4() {
		assertEquals(707106780, maxRings(1, 1000000000000000000l));
	}

	@Test
	public void test_case_5() {
		assertEquals(49, maxRings(10000000000000000l, 1000000000000000000l));
	}

}
