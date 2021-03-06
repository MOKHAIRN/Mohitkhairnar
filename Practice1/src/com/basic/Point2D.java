package com.basic;

public class Point2D {
private int x, y;
	
	public Point2D(int a, int b) {
		x = a;
        y = b;
	}

	//step-2
	public String getDetails() {
		return "Point ("+x+","+y+")";
	}
	
	//step-3
	public boolean isEqual(Point2D that) {
    	if (this.getDetails().equals(that.getDetails())) {
			return true;
		}
		return false;
    }

	//step-4
	public Point2D createPoint(int x, int y) {
		Point2D p = new Point2D(x, y);
		return p;
	}
	
	//step-5
    public double calculateDistance (Point2D that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
