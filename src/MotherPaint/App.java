package MotherPaint;

public class App {
	public static void main(String[] args) {
		PaintList pList = new PaintList(new Paint("CheapoMax", 19.99, 21, 10),new Paint("ThatOneWithTheDog", 34.38, 40, 12), new Paint("AverageJoes", 17.99, 16, 11),new singlePaint("DuluxourousPaints", 25, 10, 22, 0));
		//pList.addPaint(new Paint("CheapoMax", 19.99, 21, 10));
		//pList.addPaint(new Paint("ThatOneWithTheDog", 34.38, 40, 12));
		//pList.addPaint(new Paint("AverageJoes", 17.99, 16, 11));
		//pList.addPaint(new singlePaint("DuluxourousPaints", 0, 10, 22, 25));
		//pList.printPaints();

		Paint room = new Paint();

		room.inputOfRoom();
		Paint leastEXPENSIVE = PaintList.leastEXPENSIVE(Paint.roomSize);
		Paint leastWastePAINT = PaintList.leastWastePAINT(Paint.roomSize);
		
		
	}
}
