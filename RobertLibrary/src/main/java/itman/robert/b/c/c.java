package itman.robert.b.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import itman.robert.b.a.d;
import itman.robert.b.a.d.a;
import itman.robert.b.e;

public class c extends a
{
  private int j;
  private Paint k = d.a().a();
  private Paint l = d.a().a();
  private Paint m = d.a().a(-1).a(PorterDuff.Mode.CLEAR).a();
  private itman.robert.b.c n;

  public c(Context paramContext)
  {
    super(paramContext);
  }

  protected void a(float paramFloat)
  {
    if (this.n != null)
      this.n.setLightness(paramFloat);
  }

  protected void a(Canvas paramCanvas)
  {
    int i2 = paramCanvas.getWidth();
    int i3 = paramCanvas.getHeight();
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(this.j, arrayOfFloat);
    int i4 = Math.max(2, i2 / 256);
    int i = 0;
    while (i <= i2)
    {
      arrayOfFloat[2] = (i / (i2 - 1));
      this.k.setColor(Color.HSVToColor(arrayOfFloat));
      paramCanvas.drawRect(i, 0.0F, i + i4, i3, this.k);
      int i1;
      i += i4;
    }
  }

  protected void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    this.l.setColor(e.a(this.j, this.i));
    paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g, this.m);
    paramCanvas.drawCircle(paramFloat1, paramFloat2, this.g * 0.75F, this.l);
  }

  public void setColor(int paramInt)
  {
    this.j = paramInt;
    this.i = e.b(paramInt);
    if (this.c != null)
    {
      a();
      invalidate();
    }
  }

  public void setColorPicker(itman.robert.b.c paramc)
  {
    this.n = paramc;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.c.c
 * JD-Core Version:    0.6.0
 */