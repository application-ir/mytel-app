package itman.robert.tabLayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import itman.robert.tabLayout.a.k;

public class MsgView extends TextView
{
  private Context a;
  private GradientDrawable b = new GradientDrawable();
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;

  public MsgView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MsgView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MsgView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.MsgView);
    this.c = paramContext.getColor(a.k.MsgView_mv_backgroundColor, 0);
    this.d = paramContext.getDimensionPixelSize(a.k.MsgView_mv_cornerRadius, 0);
    this.e = paramContext.getDimensionPixelSize(a.k.MsgView_mv_strokeWidth, 0);
    this.f = paramContext.getColor(a.k.MsgView_mv_strokeColor, 0);
    this.g = paramContext.getBoolean(a.k.MsgView_mv_isRadiusHalfHeight, false);
    this.h = paramContext.getBoolean(a.k.MsgView_mv_isWidthHeightEqual, false);
    paramContext.recycle();
  }

  private void a(GradientDrawable paramGradientDrawable, int paramInt1, int paramInt2)
  {
    paramGradientDrawable.setColor(paramInt1);
    paramGradientDrawable.setCornerRadius(this.d);
    paramGradientDrawable.setStroke(this.e, paramInt2);
  }

  protected int a(float paramFloat)
  {
    return (int)(this.a.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
  }

  public boolean a()
  {
    return this.g;
  }

  public boolean b()
  {
    return this.h;
  }

  public void c()
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    a(this.b, this.c, this.f);
    GradientDrawable localGradientDrawable = this.b;
    localStateListDrawable.addState(new int[] { -16842919 }, localGradientDrawable);
    if (Build.VERSION.SDK_INT >= 16)
    {
      setBackground(localStateListDrawable);
      return;
    }
    setBackgroundDrawable(localStateListDrawable);
  }

  public int getBackgroundColor()
  {
    return this.c;
  }

  public int getCornerRadius()
  {
    return this.d;
  }

  public int getStrokeColor()
  {
    return this.f;
  }

  public int getStrokeWidth()
  {
    return this.e;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (a())
    {
      setCornerRadius(getHeight() / 2);
      return;
    }
    c();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((b()) && (getWidth() > 0) && (getHeight() > 0))
    {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), 1073741824);
      super.onMeasure(paramInt1, paramInt1);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setBackgroundColor(int paramInt)
  {
    this.c = paramInt;
    c();
  }

  public void setCornerRadius(int paramInt)
  {
    this.d = a(paramInt);
    c();
  }

  public void setIsRadiusHalfHeight(boolean paramBoolean)
  {
    this.g = paramBoolean;
    c();
  }

  public void setIsWidthHeightEqual(boolean paramBoolean)
  {
    this.h = paramBoolean;
    c();
  }

  public void setStrokeColor(int paramInt)
  {
    this.f = paramInt;
    c();
  }

  public void setStrokeWidth(int paramInt)
  {
    this.e = a(paramInt);
    c();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.tabLayout.widget.MsgView
 * JD-Core Version:    0.6.0
 */