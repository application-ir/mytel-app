package itman.robert.b.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import itman.robert.tabLayout.a.c;

public abstract class a extends View
{
  protected Bitmap a;
  protected Canvas b;
  protected Bitmap c;
  protected Canvas d;
  protected d e;
  protected int f;
  protected int g = 20;
  protected int h = 5;
  protected float i = 1.0F;

  public a(Context paramContext)
  {
    super(paramContext);
  }

  protected int a(int paramInt)
  {
    return getResources().getDimensionPixelSize(paramInt);
  }

  protected void a()
  {
    this.g = a(a.c.default_slider_handler_radius);
    this.h = a(a.c.default_slider_bar_height);
    this.f = this.g;
    if (this.c == null)
      b();
    a(this.d);
    invalidate();
  }

  protected abstract void a(float paramFloat);

  protected abstract void a(Canvas paramCanvas);

  protected abstract void a(Canvas paramCanvas, float paramFloat1, float paramFloat2);

  protected void b()
  {
    int j = getWidth();
    int k = getHeight();
    this.c = Bitmap.createBitmap(j - this.f * 2, this.h, Bitmap.Config.ARGB_8888);
    this.d = new Canvas(this.c);
    if ((this.a == null) || (this.a.getWidth() != j) || (this.a.getHeight() != k))
    {
      if (this.a != null)
        this.a.recycle();
      this.a = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
      this.b = new Canvas(this.a);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.c != null) && (this.b != null))
    {
      this.b.drawColor(0, PorterDuff.Mode.CLEAR);
      this.b.drawBitmap(this.c, this.f, (getHeight() - this.c.getHeight()) / 2, null);
      float f1 = this.g;
      float f2 = this.i;
      float f3 = getWidth() - this.g * 2;
      float f4 = getHeight() / 2.0F;
      a(this.b, f1 + f2 * f3, f4);
      paramCanvas.drawBitmap(this.a, 0.0F, 0.0F, null);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getMode(paramInt1);
    if (j == 0);
    while (true)
    {
      j = View.MeasureSpec.getMode(paramInt2);
      if (j == 0);
      while (true)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        return;
        if (j == -2147483648)
        {
          paramInt1 = View.MeasureSpec.getSize(paramInt1);
          break;
        }
        if (j != 1073741824)
          break label92;
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        break;
        if (j == -2147483648)
        {
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          continue;
        }
        if (j == 1073741824)
        {
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          continue;
        }
        paramInt2 = 0;
      }
      label92: paramInt1 = 0;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      return true;
      if (this.c == null)
        continue;
      this.i = ((paramMotionEvent.getX() - this.f) / this.c.getWidth());
      this.i = Math.max(0.0F, Math.min(this.i, 1.0F));
      a(this.i);
      invalidate();
      continue;
      a(this.i);
      if (this.e != null)
        this.e.a(this.i);
      invalidate();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    a();
  }

  public void setOnValueChangedListener(d paramd)
  {
    this.e = paramd;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.c.a
 * JD-Core Version:    0.6.0
 */