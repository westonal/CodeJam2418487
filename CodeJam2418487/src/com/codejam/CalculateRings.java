package com.codejam;

public class CalculateRings {

	public static int maxRings(long r, long t) {
		int x = 0;
		int inkRingInnerDistance = 0;
		while (true) {
			long ink = pMLinkVolumeInRing(inkRingInnerDistance + 1 + r,
					inkRingInnerDistance + r);
			if (ink > t)
				break;
			t -= ink;
			x++;
			inkRingInnerDistance += 2;
		}
		return x;
	}

	public static float inkVolume(int r) {
		return (float) (Math.PI * r * r);
	}

	public static float inkVolumeInRing(int rOuter, int rInner) {
		return inkVolume(rOuter) - inkVolume(rInner);
	}

	public static long pMLinkVolumeInRing(long rOuter, long rInner) {
		return rOuter * rOuter - rInner * rInner;
	}

}
