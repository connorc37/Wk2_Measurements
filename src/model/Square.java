package model;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
public class Square {

	// Attributes
	double side;

	// Getters & Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Constructors
	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	// Methods
	public double Area() {
		int power = 2;
		return Math.pow(getSide(), power);
	}

	public double Perimeter() {
		int numberOfSides = 4;
		return numberOfSides * getSide();
	}

}