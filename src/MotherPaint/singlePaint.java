package MotherPaint;

public class singlePaint extends Paint {

	private int costs;

	public singlePaint() {
		super();
	}

	public singlePaint(String name, double cost, int volume, int coverage, int costs) {
		super(name, cost, volume, coverage);
		this.costs = costs;
	}

	public int getCosts() {
		return costs;
	}

	public void setCosts(int costs) {
		this.costs = costs;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "\n Cost: £" + getCosts() + "\n Volume: " + getVolume() + "Litres"
				+ "\n Coverage: " + getCoverage() + "m^2 per Litre" + "\n Total Coverage: " + totalCover() + "m^2";
	}

}
