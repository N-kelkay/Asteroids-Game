package net.mrpaul.PB150.ps11.asteroids;


import java.awt.*;

public class Ship extends Polygon{

	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}

	/**
	 * draws the Ship instance
	 * @param brush
	 */
	public void paint (Graphics brush){
		Point[] shape = super.getPoints();
		int[] x = new int[shape.length];
		int[] y = new int[shape.length];


		brush.setColor(Color.gray);

		for(int i = 0; i <shape.length; i++){
			Point pos = shape[i];

			x[i] = (int)pos.getX();
			y[i] = (int)pos.getY();
		}
		brush.drawPolygon(x,y,4);
	}

	//Moves the ship
	public void move(){
	boolean forward = true;
	boolean leftTurn =false;
	boolean rightTurn = false;

	if(forward == true){
		Point position1 = super.position;

		double changeX = position1.getX();
		changeX += 10;
		position1.setX(changeX);

		if(position1.getX() > 800){
			position1.setX(0);
		}
	}

	}
}
