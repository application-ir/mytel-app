package itman.robert.b.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import itman.robert.b.a.d;
import itman.robert.b.a.d.a;
import itman.robert.b.c;
import itman.robert.b.e;

public class b extends a
{
  public int j;
  private Paint k = d.a().a();
  private Paint l = d.a().a();
  private Paint m = d.a().a();
  private Paint n = d.a().a(-1).a(PorterDuff.Mode.CLEAR).a();
  private c o;

  public b(Context paramContext)
  {
    super(paramContext);
  }

  protected void a(float paramFloat)
  {
    if (this.o != null)
      this.o.setAlphaValue(paramFloat);
  }

  protected void a(Canvas paramCanvas)
  {
    int i2 = paramCanvas.getWidth();
    int i3 = paramCanvas.getHeight();
    paramCanvas.drawRect(0.0F, 0.0F, i2, i3, this.k);
    int i4 = Math.max(2, i2 / 256);
    int i = 0;
    while (i <= i2)
    {
      float f = i / (i2 - 1);
      this.l.setColor(this.j);
      this.l.setAlpha(Math.round(f * 255.0F));
      paramCanvas.drawRect(i, 0.0F, i + i4, i3, this.l);
      int i1;
      i += i4;
    }
  }

  protected void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    this.m.setColor(this.j);
    this.m.setAlpha(Math.round(this.i * 255.0F));
    paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g, this.n);
    if (this.i < 1.0F)
      paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g * 0.75F, this.k);
    paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g * 0.75F, this.m);
  }

  protected void b()
  {
    super.b();
    this.k.setShader(d.a(this.h / 2));
  }

  public void setColor(int paramInt)
  {
    this.j = paramInt;
    this.i = e.a(paramInt);
    if (this.c != null)
    {
      a();
      invalidate();
    }
  }

  public void setColorPicker(c paramc)
  {
    this.o = paramc;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.c.b
 * JD-Core Version:    0.6.0
 */