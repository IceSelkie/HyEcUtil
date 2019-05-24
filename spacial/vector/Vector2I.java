package hyec.util.spacial.vector;

import hyec.util.spacial.point.Point2I;

public class Vector2I
{
  public int x1, y1, x2, y2;

  public Vector2I(int x1, int y1, int x2, int y2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public Vector2I(Point2I p1)
  {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = p1.x;
    this.y2 = p1.y;
  }

  public Vector2I(int x1, int y1)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x1;
    this.y2 = y1;
  }

  public Vector2I(Point2I p1, int x2, int y2)
  {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = x2;
    this.y2 = y2;
  }

  public Vector2I(int x1, int y1, Point2I p2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = p2.x;
    this.y2 = p2.y;
  }

  public Vector2I(Point2I p1, Point2I p2)
  {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = p2.x;
    this.y2 = p2.y;
  }

  public Point2I get1()
  {
    return new Point2I(x1, y1);
  }

  public Point2I get2()
  {
    return new Point2I(x2, y2);
  }

  public Point2I getD()
  {
    return new Point2I(x2 - x1, y2 - y1);
  }

  public void set1(Point2I newPrimaryPoint)
  {
    set1(newPrimaryPoint.x, newPrimaryPoint.y);
  }

  public void set1(int newx, int newy)
  {
    x1 = newx;
    y1 = newy;
  }

  public void set2(Point2I newSecondaryPoint)
  {
    set2(newSecondaryPoint.x, newSecondaryPoint.y);
  }

  public void set2(int newx2, int newy2)
  {
    x2 = newx2;
    y2 = newy2;
  }

  public void setD(Point2I newDelta)
  {
    setD(newDelta.x, newDelta.y);
  }

  public void setD(int xD, int yD)
  {
    x2 = x1 + xD;
    y2 = y1 + yD;
  }

  public void translate(Point2I offset)
  {
    translate(offset.x, offset.y);
  }

  public void translate(int xo, int yo)
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

  public double angle() {return Math.atan2(y2-y1,x2-x1);}
  public double angleDeg() {return Math.toDegrees(angle());}

  public int area()
  {
    return (x2 - x1) * (y2 - y1);
  }

  public int width() {return Math.abs(x2-x1);}
  public int height() {return Math.abs(x2-x1);}

  public boolean within(Point2I loc)
  {
    return ((loc.x >= x1 && loc.x <= x2) || (loc.x >= x2 && loc.x <= x1)) && ((loc.y >= y1 && loc.y <= y2) || (loc.y >= y2 && loc.y <= y1));
  }

  public Vector2I clone()
  {
    return new Vector2I(x1, y1, x2, y2);
  }

  public int swzlp_x1() {return x1;}
  public int swzlp_x2() {return x2;}
  public int swzlp_y1() {return y1;}
  public int swzlp_y2() {return y2;}
  public int[] swzla_x1() {return new int[]{x1};}
  public int[] swzla_x2() {return new int[]{x2};}
  public int[] swzla_y1() {return new int[]{y1};}
  public int[] swzla_y2() {return new int[]{y2};}

  public Point2I swzlp_x1_x1() {return new Point2I(x1,x1);}
  public Point2I swzlp_x1_x2() {return new Point2I(x1,x2);}
  public Point2I swzlp_x1_y1() {return new Point2I(x1,y1);}
  public Point2I swzlp_x1_y2() {return new Point2I(x1,y2);}
  public Point2I swzlp_x2_x1() {return new Point2I(x2,x1);}
  public Point2I swzlp_x2_x2() {return new Point2I(x2,x2);}
  public Point2I swzlp_x2_y1() {return new Point2I(x2,y1);}
  public Point2I swzlp_x2_y2() {return new Point2I(x2,y2);}
  public Point2I swzlp_y1_x1() {return new Point2I(y1,x1);}
  public Point2I swzlp_y1_x2() {return new Point2I(y1,x2);}
  public Point2I swzlp_y1_y1() {return new Point2I(y1,y1);}
  public Point2I swzlp_y1_y2() {return new Point2I(y1,y2);}
  public Point2I swzlp_y2_x1() {return new Point2I(y2,x1);}
  public Point2I swzlp_y2_x2() {return new Point2I(y2,x2);}
  public Point2I swzlp_y2_y1() {return new Point2I(y2,y1);}
  public Point2I swzlp_y2_y2() {return new Point2I(y2,y2);}

  public int[] swzla_x1_x1() {return new int[]{x1,x1};}
  public int[] swzla_x1_x2() {return new int[]{x1,x2};}
  public int[] swzla_x1_y1() {return new int[]{x1,y1};}
  public int[] swzla_x1_y2() {return new int[]{x1,y2};}
  public int[] swzla_x2_x1() {return new int[]{x2,x1};}
  public int[] swzla_x2_x2() {return new int[]{x2,x2};}
  public int[] swzla_x2_y1() {return new int[]{x2,y1};}
  public int[] swzla_x2_y2() {return new int[]{x2,y2};}
  public int[] swzla_y1_x1() {return new int[]{y1,x1};}
  public int[] swzla_y1_x2() {return new int[]{y1,x2};}
  public int[] swzla_y1_y1() {return new int[]{y1,y1};}
  public int[] swzla_y1_y2() {return new int[]{y1,y2};}
  public int[] swzla_y2_x1() {return new int[]{y2,x1};}
  public int[] swzla_y2_x2() {return new int[]{y2,x2};}
  public int[] swzla_y2_y1() {return new int[]{y2,y1};}
  public int[] swzla_y2_y2() {return new int[]{y2,y2};}
}
