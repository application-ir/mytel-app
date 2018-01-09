package itman.robert.b;

import F;
import android.graphics.Color;

public class b
{
  private float a;
  private float b;
  private float[] c = new float[3];
  private float[] d;
  private int e;

  public b(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat)
  {
    a(paramFloat1, paramFloat2, paramArrayOfFloat);
  }

  public double a(float paramFloat1, float paramFloat2)
  {
    double d1 = this.a - paramFloat1;
    double d2 = this.b - paramFloat2;
    return d1 * d1 + d2 * d2;
  }

  public float a()
  {
    return this.a;
  }

  public void a(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c[0] = paramArrayOfFloat[0];
    this.c[1] = paramArrayOfFloat[1];
    this.c[2] = paramArrayOfFloat[2];
    this.e = Color.HSVToColor(this.c);
  }

  public float[] a(float paramFloat)
  {
    if (this.d == null)
      this.d = ((float[])this.c.clone());
    this.d[0] = this.c[0];
    this.d[1] = this.c[1];
    this.d[2] = paramFloat;
    return this.d;
  }

  public float b()
  {
    return this.b;
  }

  public float[] c()
  {
    return this.c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.b
 * JD-Core Version:    0.6.0
 */