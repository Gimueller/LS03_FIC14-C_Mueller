package de.oszimt.ls.aliendefence.model;

public class Point {
	private int x;
	private int y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Point p) {
		return this.x == p.getX() && this.y == p.getY();
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}

}
