package net.mrpaul.PB150.ps11.asteroids;

import java.awt.*;

public class Asteroid extends Polygon{

	public Asteroid(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}

	// Makes the Asteroids
	public void paint(Graphics brush){
		Point[] shape = super.getPoints();
		int[] x = new int[shape.length];
		int[] y = new int[shape.length];


		brush.setColor(Color.GRAY);

		for(int i = 0; i <shape.length; i++){
			Point pos = shape[i];

			x[i] = (int)pos.getX();
			y[i] = (int)pos.getY();
		}
		brush.drawPolygon(x,y,6);
	}

	// Moves the Asteroids
	public void move(){

		//To make ship rotate:
		rotation = Math.random() * 20;

		double direct = Math.random() * 6;

		if(direct == 1) {

			double changeX = super.position.getX() - 4;
			super.position.setX(changeX);

			double changeY = super.position.getY() - 4;
			super.position.setY(changeY);
		}

		if(direct == 2) {

			double changeX = super.position.getX() + 4;
			super.position.setX(changeX);

			double changeY = super.position.getY() + 4;
			super.position.setY(changeY);
		}

		if(direct == 3) {

			double changeX = super.position.getX() - 4;
			super.position.setX(changeX);

			double changeY = super.position.getY();
			super.position.setY(changeY);
		}

		if(direct == 4) {

			double changeX = super.position.getX() + 4;
			super.position.setX(changeX);

			double changeY = super.position.getY();
			super.position.setY(changeY);
		}

		if(direct == 5) {

			double changeX = super.position.getX() - 5;
			super.position.setX(changeX);

			double changeY = super.position.getY() - 5;
			super.position.setY(changeY);
		}


		//x boundaries
		if(super.position.getX() > 800){
			super.position.setX(0);
		}
		if(super.position.getX() < 0){
			super.position.setX(800);
		}

		//y boundaries
		if(super.position.getY() < 0){
			super.position.setY(600);
		}
		if(super.position.getY() > 600){
			super.position.setY(0);
		}
	}
}
