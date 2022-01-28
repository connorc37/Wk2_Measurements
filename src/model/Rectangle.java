package model;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
public class Rectangle {

	// Attributes
	double length;
	double width;

	// Getters & Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// Constructors
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super();
		setLength(length);
		setWidth(width);
	}
	
	// Methods
	public double Area() {
		return length * width;
	}

	public double Perimeter() {
		return 2 * (length + width);
	}

}