package net.mrpaul.PB150.ps11.asteroids;


import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship extends Polygon implements KeyListener{

	boolean forward = false;
	boolean leftTurn =false;
	boolean rightTurn = false;

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

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			forward = true;
		}

		if(e.getKeyCode() == KeyEvent.VK_DOWN){

		}

		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			leftTurn = true;
		}

		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			rightTurn = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			forward = false;
		}

		if(e.getKeyCode() == KeyEvent.VK_DOWN){

		}

		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			leftTurn = false;
		}

		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			rightTurn = false;
		}
	}
}