package itman.robert.b.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import itman.robert.b.a.d.a;
import java.util.List;

public class d extends a
{
  private Paint c = itman.robert.b.a.d.a().a();
  private float[] d = new float[3];
  private float e = 1.2F;

  public void d()
  {
    int m = this.b.size();
    int i = 0;
    float f2 = this.a.g.getWidth() / 2.0F;
    int n = this.a.a;
    float f3 = this.a.d;
    float f4 = this.a.b;
    float f5 = this.a.c;
    int j = 0;
    while (j < n)
    {
      float f6 = j / (n - 1);
      float f1 = (j - n / 2.0F) / n;
      f6 = f4 * f6;
      int k;
      label146: float f7;
      float f8;
      if (j == 0)
      {
        f1 = 0.0F;
        f1 = Math.max(1.5F + f3, f1 + f5);
        int i1 = Math.min(a(f6, f1), n * 2);
        k = 0;
        if (k >= i1)
          break label384;
        double d1 = 6.283185307179586D * k / i1 + 3.141592653589793D / i1 * ((j + 1) % 2);
        f7 = f2 + (float)(f6 * Math.cos(d1));
        f8 = f2 + (float)(f6 * Math.sin(d1));
        this.d[0] = (float)(d1 * 180.0D / 3.141592653589793D);
        this.d[1] = (f6 / f4);
        this.d[2] = this.a.f;
        this.c.setColor(Color.HSVToColor(this.d));
        this.c.setAlpha(c());
        this.a.g.drawCircle(f7, f8, f1 - f3, this.c);
        if (i < m)
          break label356;
        this.b.add(new itman.robert.b.b(f7, f8, this.d));
      }
      while (true)
      {
        i += 1;
        k += 1;
        break label146;
        f1 = this.e * f5 * f1;
        break;
        label356: ((itman.robert.b.b)this.b.get(i)).a(f7, f8, this.d);
      }
      label384: j += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.b.d
 * JD-Core Version:    0.6.0
 */