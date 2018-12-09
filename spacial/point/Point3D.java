package hyec.util.spacial.point;

import java.io.Serializable;

/**
 * class Point3D
 * <p>
 * A three dimensional point of doubles to represent a location in space.
 *
 * @author Selkie
 * @version 1.1
 */
public class Point3D implements Serializable, Cloneable
{
  /**
   * The X coordinate of this <code>Point3D</code>.
   *
   * @serial
   */
  public double x;

  /**
   * The Y coordinate of this <code>Point3D</code>.
   *
   * @serial
   */
  public double y;

  /**
   * The Z coordinate of this <code>Point3D</code>.
   *
   * @serial
   */
  public double z;

  /**
   * Constructs and initializes a <code>Point3D</code> with
   * coordinates (0,&nbsp;0,&nbsp;0).
   */
  public Point3D()
  {
    z = y = x = 0D;
  }

  /**
   * Constructs and initializes a <code>Point3D</code> with
   * the specified coordinates.
   *
   * @param x the X coordinate of the newly
   *          constructed <code>Point3D</code>
   * @param y the Y coordinate of the newly
   *          constructed <code>Point3D</code>
   * @param z the Z coordinate of the newly
   *          constructed <code>Point3D</code>
   */
  public Point3D(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Returns the X coordinate of this <code>Point3D</code> as
   * a <code>double</code>.
   *
   * @return the X coordinate of this <code>Point3D</code>.
   */
  public double getX()
  {
    return x;
  }

  /**
   * Returns the Y coordinate of this <code>Point3D</code> as
   * a <code>double</code>.
   *
   * @return the Y coordinate of this <code>Point3D</code>.
   */
  public double getY()
  {
    return y;
  }

  /**
   * Returns the Z coordinate of this <code>Point3D</code> as
   * an <code>double</code>.
   *
   * @return the Z coordinate of this <code>Point3D</code>.
   */
  public double getZ()
  {
    return z;
  }

  /**
   * Sets the location of this <code>Point3D</code> to the
   * specified coordinates.
   *
   * @param x the new X coordinate of this {@code Point3I}
   * @param y the new Y coordinate of this {@code Point3I}
   * @param z the new Z coordinate of this {@code Point3I}
   */
  public void set(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Sets the location of this <code>Point3D</code> to the same
   * coordinates as the specified <code>Point3D</code> object.
   *
   * @param p the specified <code>Point3D</code> to which to set
   *          this <code>Point3D</code>
   */
  public void set(Point3D p)
  {
    set(p.getX(), p.getY(), p.getZ());
  }

  /**
   * Returns the square of the distance from this
   * <code>Point3D</code> to a specified <code>Point3D</code>.
   *
   * @param pt the specified point to be measured
   *           against this <code>Point3D</code>
   * @return the square of the distance between this
   * <code>Point3D</code> to a specified <code>Point3D</code>.
   */
  public double distanceSq(Point3D pt)
  {
    double dx = pt.getX() - this.getX();
    double dy = pt.getY() - this.getY();
    double dz = pt.getZ() - this.getZ();
    return (dx * dx + dy * dy + dz * dz);
  }

  /**
   * Returns the distance from this <code>Point3D</code> to a
   * specified <code>Point3D</code>.
   *
   * @param pt the specified point to be measured
   *           against this <code>Point3D</code>
   * @return the distance between this <code>Point3D</code> and
   * the specified <code>Point3D</code>.
   */
  public double distance(Point3D pt)
  {
    return Math.sqrt(distanceSq(pt));
  }

  /**
   * Returns a new <code>Point3D</code> that has the position of
   * the two <code>Point3D</code>s added together.
   *
   * @param pt the specified point to be added to this <code>Point3D</code>.
   * @return the point who's position is the sum of this <code>Point3D</code>
   * and the specified <code>Point3D</code>.
   */
  public Point3D add(Point3D pt)
  {
    return new Point3D(this.getX() + pt.getX(), this.getY() + pt.getY(), this.getZ() + pt.getZ());
  }

  /**
   * Returns a new <code>Point3D</code> that has the position of
   * the this <code>Point3D</code> added to the coordinates.
   *
   * @param x the X component to be added to this <code>Point3D</code>.
   * @param y the Y component to be added to this <code>Point3D</code>.
   * @param z the Z component to be added to this <code>Point3D</code>.
   * @return the point who's position is the sum of this <code>Point3D</code>
   * and the specified coordinates.
   */
  public Point3D add(double x, double y, double z)
  {
    return new Point3D(this.getX() + x, this.getY() + y, this.getZ() + z);
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
    try
    {
      return super.clone();
    } catch (CloneNotSupportedException e)
    {
      // this shouldn't happen, since we are Cloneable
      throw new InternalError(e);
    }
  }

  /**
   * Determines whether or not two points are equal. Two instances of
   * <code>Point3D</code> are equal if the values of their
   * <code>x</code>, <code>y</code>, and <code>z</code> member fields,
   * representing their position in the coordinate space, are the same.
   *
   * @param obj an object to be compared with this <code>Point3D</code>
   * @return <code>true</code> if the object to be compared is
   * an instance of <code>Point3D</code> and has
   * the same values; <code>false</code> otherwise.
   */
  public boolean equals(Object obj)
  {
    if (obj instanceof Point3D)
    {
      Point3D p3i = (Point3D) obj;
      return (getX() == p3i.getX()) && (getY() == p3i.getY()) && (getZ() == p3i.getZ());
    }
    return super.equals(obj);
  }

  @Override
  public String toString()
  {
    return "Point3D{" + getX() + "," + getY() + "," + getZ() + "}";
  }
}
