package hyec.util.spacial.point;

import hyec.util.spacial.vector.Vector2I;

import java.io.Serializable;

/**
 * class Point2I
 * <p>
 * A two dimensional point of ints to represent a location on a plane.
 *
 * @author Selkie
 * @version 1.1
 */
public class Point2I implements Serializable, Cloneable
{
  /**
   * The X coordinate of this <code>Point2I</code>.
   *
   * @serial
   */
  public int x;

  /**
   * The Y coordinate of this <code>Point2I</code>.
   *
   * @serial
   */
  public int y;

  /**
   * Constructs and initializes a <code>Point2I</code> with
   * coordinates (0,&nbsp;0).
   */
  public Point2I()
  {
    y = x = 0;
  }

  /**
   * Constructs and initializes a <code>Point2I</code> with
   * the specified coordinates.
   *
   * @param x the X coordinate of the newly
   *          constructed <code>Point2I</code>
   * @param y the Y coordinate of the newly
   *          constructed <code>Point2I</code>
   */
  public Point2I(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   * Returns the X coordinate of this <code>Point2I</code> as
   * a <code>int</code>.
   *
   * @return the X coordinate of this <code>Point2I</code>.
   */
  public int getX()
  {
    return x;
  }

  /**
   * Returns the Y coordinate of this <code>Point2I</code> as
   * a <code>int</code>.
   *
   * @return the Y coordinate of this <code>Point2I</code>.
   */
  public int getY()
  {
    return y;
  }

  /**
   * Sets the location of this <code>Point2I</code> to the
   * specified coordinates.
   *
   * @param x the new X coordinate of this {@code Point3I}
   * @param y the new Y coordinate of this {@code Point3I}
   */
  public void set(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   * Sets the location of this <code>Point2I</code> to the same
   * coordinates as the specified <code>Point2I</code> object.
   *
   * @param p the specified <code>Point2I</code> to which to set
   *          this <code>Point2I</code>
   */
  public void set(Point2I p)
  {
    set(p.getX(), p.getY());
  }

  /**
   * Returns the square of the distance from this
   * <code>Point2I</code> to a specified <code>Point2I</code>.
   *
   * @param pt the specified point to be measured
   *           against this <code>Point2I</code>
   * @return the square of the distance between this
   * <code>Point2I</code> to a specified <code>Point2I</code>.
   */
  public double distanceSq(Point2I pt)
  {
    int dx = pt.getX() - this.getX();
    int dy = pt.getY() - this.getY();
    return (dx * dx + dy * dy);
  }

  /**
   * Returns the distance from this <code>Point2I</code> to a
   * specified <code>Point2I</code>.
   *
   * @param pt the specified point to be measured
   *           against this <code>Point2I</code>
   * @return the distance between this <code>Point2I</code> and
   * the specified <code>Point2I</code>.
   */
  public double distance(Point2I pt)
  {
    return Math.sqrt(distanceSq(pt));
  }

  /**
   * Returns a new <code>Point2I</code> that has the position of
   * the two <code>Point2I</code>s added together.
   *
   * @param pt the specified point to be added to this <code>Point2I</code>.
   * @return the point who's position is the sum of this <code>Point2I</code>
   * and the specified <code>Point2I</code>.
   */
  public Point2I add(Point2I pt)
  {
    return new Point2I(this.getX() + pt.getX(), this.getY() + pt.getY());
  }

  /**
   * Returns a new <code>Point2I</code> that has the position of
   * the this <code>Point2I</code> added to the coordinates.
   *
   * @param x the X component to be added to this <code>Point2I</code>.
   * @param y the Y component to be added to this <code>Point2I</code>.
   * @return the point who's position is the sum of this <code>Point2I</code>
   * and the specified coordinates.
   */
  public Point2I add(int x, int y)
  {
    return new Point2I(this.getX() + x, this.getY() + y);
  }

  /**
   * Returns a new {@link Point2D} that is this <code>Point2I</code>
   * as doubles.
   *
   * @return the new {@link Point2D} that is this <code>Point2I</code>
   * as doubles.
   */
  public Point2D upgrade()
  {
    return new Point2D(x, y);
  }

  /**
   * Compresses to a magnitude of 1.
   */
  public Point2D compress()
  {
    double mag = Math.sqrt(x*x+y*y);
    return new Point2D(x/mag,y/mag);
  }

  /**
   * Tells if the point is in the first quadrant.
   *
   * @return <code>true</code> when neither the X component nor Y component is negative.
   */
  public boolean isPositive()
  {
    return x >= 0 && y >= 0;
  }

  // Duplicate of Point2I.upgrade();
  public Point2D toPoint2D() {return new Point2D(x,y);}
  public Point2D d() {return toPoint2D();}

  /**
   * Scale the point by a scalar.
   */
  public Point2I scaleUp(int scale)
  {
    return new Point2I(x*scale,y*scale);
  }
  /**
   * Scale the point by a scalar.
   */
  public Point2I scaleDown(int reduce)
  {
    return new Point2I(x/reduce,y/reduce);
  }
  /**
   * Scale the point by a scalar.
   */
  public Point2I scale(int up, int down)
  {
    return new Point2I((x*up)/down,(y*up)/down);
  }

  /**
   * Converts this point into a vector from 0,0 to the point's position.
   */
  public Vector2I asVec()
  {
    return new Vector2I(this);
  }

  /**
   * Creates a new object of the same class and with the
   * same contents as this object.
   *
   * @return a clone of this instance.
   * @throws OutOfMemoryError if there is not enough memory, I think.
   */
  public Object clone()
  {
    return new Point2I(x, y);
  }

  /**
   * Determines whether or not two points are equal. Two instances of
   * <code>Point3D</code> are equal if the values of their
   * <code>x</code> and <code>y</code> member fields, representing
   * their position in the coordinate space, are the same.
   *
   * @param obj an object to be compared with this <code>Point2I</code>
   * @return <code>true</code> if the object to be compared is
   * an instance of <code>Point2I</code> and has
   * the same values; <code>false</code> otherwise.
   */
  public boolean equals(Object obj)
  {
    if (obj instanceof Point2I)
    {
      Point2I p2i = (Point2I) obj;
      return (getX() == p2i.getX()) && (getY() == p2i.getY());
    }
    return super.equals(obj);
  }

  @Override
  public String toString()
  {
    return "Point2I{" + getX() + "," + getY() + "}";
  }
}
