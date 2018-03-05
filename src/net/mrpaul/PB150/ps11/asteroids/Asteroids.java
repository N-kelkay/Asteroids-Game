package net.mrpaul.PB150.ps11.asteroids;

/*
CLASS: Asteroids
DESCRIPTION: Extending Game, Asteroids is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.

*/
import java.awt.*;
import java.awt.event.*;

class Asteroids extends Game{
	static int counter = 0;
	private int FPS = 30;
	boolean doneConstructing =false;

	//private Point[] shape = {new Point(400,300), new Point(390,310), new Point(420,300), new Point(390, 290)};   // An array of points.
	private Point[] shape = {new Point(400, 300), new Point(390,310), new Point(420,300), new Point(390, 290)};   // An array of points.

	public Point position = new Point(400, 300);   // The offset mentioned above.
	public double rotation  = 0; // Zero degrees is due east.
	Ship ship = new Ship(shape,position,rotation);

	//ASTEROIDS:
	private Point[] shape2 = {new Point(0, 0), new Point(10,0), new Point(10,10), new Point(0, 10), new Point(0, 10), new Point(0, 10), new Point(0, 10), new Point(0, 10), new Point(0, 10), new Point(0, 10)};   // An array of points.
	public Point position2 = new Point(400, 300);   // The offset mentioned above.
	public double rotation2  = 0; // Zero degrees is due east.
	Asteroid asteroids = new Asteroid(shape2,position2,rotation2);

	public Asteroids() {
		super("Asteroids!",800,600);
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(ship);

		doneConstructing = true;
	}

	public void paint(Graphics brush) {

		if(doneConstructing == true) {
			brush.setColor(Color.black);
			brush.fillRect(0, 0, width, height);

			//Ship
			ship.move();
			ship.paint(brush);

			//Asteroids
			asteroids.paint(brush);

			// sample code for printing message for debugging
			// counter is incremented and this message printed
			// each time the canvas is repainted
			counter++;
			brush.setColor(Color.white);
			brush.drawString("Counter is " + counter, 10, 10);
		}
	}

	public static void main (String[] args) {
		Asteroids a = new Asteroids();
		a.repaint();
	}
}