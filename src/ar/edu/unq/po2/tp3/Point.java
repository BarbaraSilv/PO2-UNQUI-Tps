package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x2, int y2) {
		x = x2;
		y = y2;
		
	}
	
	public int getX() {
		return x;
		
	}
	public int getY() {
		return y;
		
	}
	public void moverPuntoA(int x2, int y2) {
		x = x2;
		y = y2;
		
	}
	
	public Point sumaPuntoA(Point punto) {
	    int sumax = x + punto.x;
		int sumay = y + punto.y;
		return new Point(sumax,sumay);
		
	}
}
	
