package hyec.util.spacial.vector;

import hyec.util.spacial.point.Point2D;

public class Vector2D
{
  public double x1, y1, x2, y2;

  public Vector2D(double x1, double y1, double x2, double y2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public Vector2D(Point2D p1)
  {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = p1.x;
    this.y2 = p1.y;
  }

  public Vector2D(double x1, double y1)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x1;
    this.y2 = y1;
  }

  public Vector2D(Point2D p1, double x2, double y2)
  {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = x2;
    this.y2 = y2;
  }

  public Vector2D(double x1, double y1, Point2D p2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = p2.x;
    this.y2 = p2.y;
  }

  public Vector2D(Point2D p1, Point2D p2)
  {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = p2.x;
    this.y2 = p2.y;
  }

  public Point2D get1()
  {
    return new Point2D(x1, y1);
  }

  public Point2D get2()
  {
    return new Point2D(x2, y2);
  }

  public Point2D getD()
  {
    return new Point2D(x2 - x1, y2 - y1);
  }

  public void set1(Point2D newPrimaryPoint)
  {
    set1(newPrimaryPoint.x, newPrimaryPoint.y);
  }

  public void set1(double newx, double newy)
  {
    x1 = newx;
    y1 = newy;
  }

  public void set2(Point2D newSecondaryPoint)
  {
    set2(newSecondaryPoint.x, newSecondaryPoint.y);
  }

  public void set2(double newx2, double newy2)
  {
    x2 = newx2;
    y2 = newy2;
  }

  public void setD(Point2D newDelta)
  {
    setD(newDelta.x, newDelta.y);
  }

  public void setD(double xD, double yD)
  {
    x2 = x1 + xD;
    y2 = y1 + yD;
  }

  public void translate(Point2D offset)
  {
    translate(offset.x, offset.y);
  }

  public void translate(double xo, double yo)
  {
    x1 += xo;
    y1 += yo;
    x2 += xo;
    y2 += yo;
  }

  public double magnitude()
  {
    return Math.sqrt(magnitudeSq());
  }

  public double magnitudeSq()
  {
    return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
  }

  public void setMag(double len) {double agl = angle(); x2=x1+Math.cos(agl)*len; y2=y1+Math.sin(agl)*len;}

  public double angle() {return Math.atan2(y2-y1,x2-x1);}
  public double angleDeg() {return Math.toDegrees(angle());}

  public double area()
  {
    return (x2 - x1) * (y2 - y1);
  }

  public double width() {return Math.abs(x2-x1);}
  public double height() {return Math.abs(x2-x1);}

  public boolean within(Point2D loc)
  {
    return ((loc.x >= x1 && loc.x <= x2) || (loc.x >= x2 && loc.x <= x1)) && ((loc.y >= y1 && loc.y <= y2) || (loc.y >= y2 && loc.y <= y1));
  }

  public Vector2D clone()
  {
    return new Vector2D(x1, y1, x2, y2);
  }

  public double swzlp_x1() {return x1;}
  public double swzlp_x2() {return x2;}
  public double swzlp_y1() {return y1;}
  public double swzlp_y2() {return y2;}
  public double[] swzla_x1() {return new double[]{x1};}
  public double[] swzla_x2() {return new double[]{x2};}
  public double[] swzla_y1() {return new double[]{y1};}
  public double[] swzla_y2() {return new double[]{y2};}

  public Point2D swzlp_x1_x1() {return new Point2D(x1,x1);}
  public Point2D swzlp_x1_x2() {return new Point2D(x1,x2);}
  public Point2D swzlp_x1_y1() {return new Point2D(x1,y1);}
  public Point2D swzlp_x1_y2() {return new Point2D(x1,y2);}
  public Point2D swzlp_x2_x1() {return new Point2D(x2,x1);}
  public Point2D swzlp_x2_x2() {return new Point2D(x2,x2);}
  public Point2D swzlp_x2_y1() {return new Point2D(x2,y1);}
  public Point2D swzlp_x2_y2() {return new Point2D(x2,y2);}
  public Point2D swzlp_y1_x1() {return new Point2D(y1,x1);}
  public Point2D swzlp_y1_x2() {return new Point2D(y1,x2);}
  public Point2D swzlp_y1_y1() {return new Point2D(y1,y1);}
  public Point2D swzlp_y1_y2() {return new Point2D(y1,y2);}
  public Point2D swzlp_y2_x1() {return new Point2D(y2,x1);}
  public Point2D swzlp_y2_x2() {return new Point2D(y2,x2);}
  public Point2D swzlp_y2_y1() {return new Point2D(y2,y1);}
  public Point2D swzlp_y2_y2() {return new Point2D(y2,y2);}

  public double[] swzla_x1_x1() {return new double[]{x1,x1};}
  public double[] swzla_x1_x2() {return new double[]{x1,x2};}
  public double[] swzla_x1_y1() {return new double[]{x1,y1};}
  public double[] swzla_x1_y2() {return new double[]{x1,y2};}
  public double[] swzla_x2_x1() {return new double[]{x2,x1};}
  public double[] swzla_x2_x2() {return new double[]{x2,x2};}
  public double[] swzla_x2_y1() {return new double[]{x2,y1};}
  public double[] swzla_x2_y2() {return new double[]{x2,y2};}
  public double[] swzla_y1_x1() {return new double[]{y1,x1};}
  public double[] swzla_y1_x2() {return new double[]{y1,x2};}
  public double[] swzla_y1_y1() {return new double[]{y1,y1};}
  public double[] swzla_y1_y2() {return new double[]{y1,y2};}
  public double[] swzla_y2_x1() {return new double[]{y2,x1};}
  public double[] swzla_y2_x2() {return new double[]{y2,x2};}
  public double[] swzla_y2_y1() {return new double[]{y2,y1};}
  public double[] swzla_y2_y2() {return new double[]{y2,y2};}
}
