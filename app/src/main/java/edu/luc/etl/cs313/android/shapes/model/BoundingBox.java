package edu.luc.etl.cs313.android.shapes.model;

/**
 * A shape visitor for calculating the bounding box, that is, the smallest
 * rectangle containing the shape. The resulting bounding box is returned as a
 * rectangle at a specific location.
 */
public class BoundingBox implements Visitor<Location> {

    // TODO entirely your job (except onCircle)

    @Override
    public Location onCircle(final Circle c) {
        final int radius = c.getRadius();
        return new Location(-radius, -radius, new Rectangle(2 * radius, 2 * radius));
    }

    @Override
    public Location onFill(final Fill f) {

        //bounding box of the filled shape is the same shape of itself
        return f.getShape().accept(this);
    }

    @Override
    public Location onGroup(final Group g) {
        //initialize min and max value for x and y
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        //Iterate over each shape in group to determine bounding box
        for(Shape shape : g.getShape()) {
            //calculate the bounding box of the current shape
            Location loc = shape.accept(this);
            Rectangle rect = (Rectangle) loc.getShape();
            int x = loc.getX();
            int y = loc.getY();

            //update min and max values based onn the current bounding box
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x + rect.getWidth());
            maxY = Math.max(maxY, y + rect.getWidth());
        }
        //return the bounding box that contains all the shapes in the group
        return new Location(minX, minY, new Rectangle(maxX - minX, maxY - minY));
    }

    @Override
    public Location onLocation(final Location l) {
        //Calculate bounding box of shape
        Location loc = l.getShape().accept(this);
        //adjust bounding box by locations coordinates
        return new Location(l.getX() + loc.getX(), l.getY() + loc.getY(), loc.getShape());
    }

    @Override
    public Location onRectangle(final Rectangle r) {
        return new Location (0, 0, r)
    }

    @Override
    public Location onStrokeColor(final StrokeColor c) {
        //bounding box of a shape with a stroke color is the same as the shape
        return c.getShape().accept(this);
    }

    @Override
    public Location onOutline(final Outline o) {
        //bounding box of an outlined shape is the same as the shape
        return o.getShape().accept(this);
    }

    @Override
    public Location onPolygon(final Polygon s) {
        return null;
    }
}
