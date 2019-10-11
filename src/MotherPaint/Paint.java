package MotherPaint;

import java.util.Scanner;

public class Paint {

	private String name;
	private double cost;
	private int volume;
	private int coverage;
	static int roomSize;

	public Paint(String name, double cost, int volume, int coverage) {
		super();
		this.name = name;
		this.cost = cost;
		this.volume = volume;
		this.coverage = coverage;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public int totalCover() {
		return coverage * volume;

	}

	public int wastePAINT() {
		while (getRoomSize() > totalCover()) {
			setRoomSize(getRoomSize() - totalCover());
		}
		return totalCover() - getRoomSize();
	}

	public double totalCost() {
		int tinnies = 1;
		while (getRoomSize() > totalCover()) {
			setRoomSize(getRoomSize() - totalCover());
			tinnies++;
		}
		return tinnies * this.cost;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "\n Cost: £" + getCost() + "\n Volume: " + getVolume() + "Litres"
				+ "\n Coverage: " + getCoverage() + "m^2 per Litre" + "\n Total Coverage: " + totalCover() + "m^2";
	}

	public Paint() {

	}

	public void inputOfRoom() {
		Scanner size = new Scanner(System.in);
		System.out.println("What is the size of the room that needs painting? (in m^2): ");
		setRoomSize(size.nextInt());
	}

	public static int getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(int roomSize) {
		Paint.roomSize = roomSize;
	}
}
