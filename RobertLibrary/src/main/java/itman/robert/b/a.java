package itman.robert.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.ColorDrawable;
import itman.robert.b.a.d;
import itman.robert.b.a.d.a;

public class a extends ColorDrawable
{
  private float a;
  private Paint b = d.a().a(Paint.Style.STROKE).a(this.a).a(-1).a();
  private Paint c = d.a().a(Paint.Style.FILL).a(0).a();
  private Paint d = d.a().a(d.a(16)).a();

  public a()
  {
  }

  public a(int paramInt)
  {
    super(paramInt);
  }

  public void draw(Canvas paramCanvas)
  {
    paramCanvas.drawColor(0);
    float f = paramCanvas.getWidth() / 2.0F;
    this.a = (f / 12.0F);
    this.b.setStrokeWidth(this.a);
    this.c.setColor(getColor());
    paramCanvas.drawCircle(f, f, f - this.a * 1.5F, this.d);
    paramCanvas.drawCircle(f, f, f - this.a * 1.5F, this.c);
    //paramCanvas.drawCircle(f, f, f - this.a, this.b);
  }

  public void setColor(int paramInt)
  {
    super.setColor(paramInt);
    invalidateSelf();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.a
 * JD-Core Version:    0.6.0
 */