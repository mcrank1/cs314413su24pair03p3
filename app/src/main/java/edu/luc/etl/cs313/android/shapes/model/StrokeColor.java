package edu.luc.etl.cs313.android.shapes.model;

/**
 * A decorator for specifying the stroke (foreground) color for drawing the
 * shape.
 */
public class StrokeColor implements Shape {

    // TODO entirely your job

    public StrokeColor(final int color, final Shape shape) {
    }

    public int getColor() {
        return -1;
    }

    public Shape getShape() {
        return null;
    }

    @Override
    public <Result> Result accept(Visitor<Result> v) {
        return null;
    }
}
