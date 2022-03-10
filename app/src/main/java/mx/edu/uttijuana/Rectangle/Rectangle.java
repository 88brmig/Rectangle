package mx.edu.uttijuana.Rectangle;

import mx.edu.uttijuana.Rectangle.Exceptions.InvalidMeasurementException;

public class Rectangle extends GeometricFigure {

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) throws InvalidMeasurementException {
        super(width, height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2) + (this.height * 2);
    }
}
