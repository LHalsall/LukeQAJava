package MotherPaint;

import java.util.Arrays;
import java.util.List;

public class PaintList {

	private static List<Paint> paints;

	public PaintList(Paint... paints) {
		PaintList.paints = Arrays.asList(paints);
	}

	public static Paint leastWastePAINT(int roomSize) {
		Paint leastPaint = null;
		int leastWastePAINT = Integer.MAX_VALUE;
		for (Paint p : paints) {
			int wasteyWastey = p.wastePAINT();
			if (wasteyWastey < leastWastePAINT) {
				leastPaint = p;
				leastWastePAINT = wasteyWastey;
			}

		}
		System.out.println("for maximum paint efficeincy use " + leastPaint.getName() + ", it wasted only "
				+ leastWastePAINT + "m^2 of paint.");
		return leastPaint;
	}

	public static Paint leastEXPENSIVE(int roomSize) {
		Paint leastPaint = null;
		double leastCost = Double.MAX_VALUE;
		for (Paint p : paints) {
			double priceyPricey = p.totalCost();
			if (priceyPricey < leastCost) {
				leastPaint = p;
				leastCost = priceyPricey;
			}
		}
		System.out.println(
				"The one which cost least was " + leastPaint.getName() + "it did in fact cost £" + leastCost + ".");
		return leastPaint;
	}

	public boolean addPaint(Paint paint) {
		return PaintList.paints.add(paint);

	}

	public void printPaints() {
		for (Paint p : paints) {
			System.out.println(p);
		}
	}
}
