package mx.edu.uttijuana.Rectangle;

import mx.edu.uttijuana.Rectangle.Exceptions.InvalidMeasurementException;

public abstract class GeometricFigure {
    protected double height;
    protected double width;

    public GeometricFigure() {
        this.width = 1;
        this.height = 1;
    }

    public GeometricFigure(double width, double height) throws InvalidMeasurementException {
        if (width > 0 && height > 0) {
           this.width = width;
           this.height = height;
       } else throw new InvalidMeasurementException();
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public void setWidth(double width) throws InvalidMeasurementException {
        if (width > 0) this.width = width;
        else throw new InvalidMeasurementException();
    }

    public void setHeight(double height) throws InvalidMeasurementException {
        if (height > 0) this.height = height;
        else throw new InvalidMeasurementException();
    }

}
