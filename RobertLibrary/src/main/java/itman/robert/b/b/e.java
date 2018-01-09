package itman.robert.b.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import itman.robert.b.a.d;
import itman.robert.b.a.d.a;
import java.util.List;

public class e extends a
{
  private Paint c = d.a().a();
  private float[] d = new float[3];

  public void d()
  {
    int m = this.b.size();
    int i = 0;
    float f1 = this.a.g.getWidth() / 2.0F;
    int n = this.a.a;
    float f2 = this.a.b;
    int j = 0;
    while (j < n)
    {
      float f3 = f2 * (j / (n - 1));
      float f4 = this.a.c;
      int i1 = a(f3, f4);
      int k = 0;
      if (k < i1)
      {
        double d1 = 6.283185307179586D * k / i1 + 3.141592653589793D / i1 * ((j + 1) % 2);
        float f5 = f1 + (float)(f3 * Math.cos(d1));
        float f6 = f1 + (float)(f3 * Math.sin(d1));
        this.d[0] = (float)(d1 * 180.0D / 3.141592653589793D);
        this.d[1] = (f3 / f2);
        this.d[2] = this.a.f;
        this.c.setColor(Color.HSVToColor(this.d));
        this.c.setAlpha(c());
        this.a.g.drawCircle(f5, f6, f4 - this.a.d, this.c);
        if (i >= m)
          this.b.add(new itman.robert.b.b(f5, f6, this.d));
        while (true)
        {
          i += 1;
          k += 1;
          break;
          ((itman.robert.b.b)this.b.get(i)).a(f5, f6, this.d);
        }
      }
      j += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.b.e
 * JD-Core Version:    0.6.0
 */