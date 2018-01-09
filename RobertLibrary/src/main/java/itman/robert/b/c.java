package itman.robert.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import itman.robert.b.a.d.a;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends View
{
  private Bitmap a;
  private Canvas b;
  private int c = 10;
  private float d = 1.0F;
  private float e = 1.0F;
  private int f = 0;
  private Integer[] g = { null, null, null, null, null };
  private int h = 0;
  private Integer i;
  private Integer j;
  private Paint k = itman.robert.b.a.d.a().a(0).a();
  private Paint l = itman.robert.b.a.d.a().a(-1).a();
  private Paint m = itman.robert.b.a.d.a().a(-16777216).a();
  private Paint n = itman.robert.b.a.d.a().a();
  private b o;
  private ArrayList<d> p = new ArrayList();
  private itman.robert.b.c.c q;
  private itman.robert.b.c.b r;
  private EditText s;
  private TextWatcher t = new TextWatcher()
  {
    public void afterTextChanged(Editable paramEditable)
    {
    }

    public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      try
      {
        paramInt1 = Color.parseColor(paramCharSequence.toString());
        c.this.b(paramInt1, false);
        return;
      }
      catch (Exception paramCharSequence)
      {
      }
    }
  };
  private LinearLayout u;
  private itman.robert.b.b.c v;
  private int w;
  private int x;

  public c(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  private b a(float paramFloat1, float paramFloat2)
  {
    Object localObject = null;
    double d1 = 1.7976931348623157E+308D;
    Iterator localIterator = this.v.b().iterator();
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      double d2 = localb.a(paramFloat1, paramFloat2);
      if (d1 <= d2)
        break label74;
      localObject = localb;
      d1 = d2;
    }
    label74: 
    while (true)
    {
      break;
      return localObject;
    }
  }

  private b a(int paramInt)
  {
    Object localObject2 = new float[3];
    Color.colorToHSV(paramInt, localObject2);
    Object localObject1 = null;
    double d1 = 1.7976931348623157E+308D;
    double d3 = localObject2[1];
    double d4 = Math.cos(localObject2[0] * 3.141592653589793D / 180.0D);
    double d5 = localObject2[1];
    double d6 = Math.sin(localObject2[0] * 3.141592653589793D / 180.0D);
    Iterator localIterator = this.v.b().iterator();
    if (localIterator.hasNext())
    {
      localObject2 = (b)localIterator.next();
      float[] arrayOfFloat = ((b)localObject2).c();
      double d8 = arrayOfFloat[1];
      double d9 = Math.cos(arrayOfFloat[0] * 3.141592653589793D / 180.0D);
      double d2 = arrayOfFloat[1];
      double d7 = Math.sin(arrayOfFloat[0] * 3.141592653589793D / 180.0D);
      d8 = d4 * d3 - d8 * d9;
      d2 = d6 * d5 - d7 * d2;
      d2 = d2 * d2 + d8 * d8;
      if (d2 >= d1)
        break label222;
      localObject1 = localObject2;
      d1 = d2;
    }
    label222: 
    while (true)
    {
      break;
      return localObject1;
    }
  }

  private void a()
  {
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    if (i2 < i1)
      i1 = i2;
    while (true)
    {
      if (i1 <= 0)
        return;
      if (this.a == null)
      {
        this.a = Bitmap.createBitmap(i1, i1, Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
        this.n.setShader(itman.robert.b.a.d.a(8));
      }
      b();
      invalidate();
      return;
    }
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ColorPickerPreference);
    this.c = paramContext.getInt(a.k.ColorPickerPreference_density, 10);
    this.i = Integer.valueOf(paramContext.getInt(a.k.ColorPickerPreference_initialColor, -1));
    this.j = Integer.valueOf(paramContext.getInt(a.k.ColorPickerPreference_pickerColorEditTextColor, -1));
    paramAttributeSet = itman.robert.b.a.c.a(a.a(paramContext.getInt(a.k.ColorPickerPreference_wheelType, 0)));
    this.w = paramContext.getResourceId(a.k.ColorPickerPreference_alphaSliderView, 0);
    this.x = paramContext.getResourceId(a.k.ColorPickerPreference_lightnessSliderView, 0);
    setRenderer(paramAttributeSet);
    setDensity(this.c);
    a(this.i.intValue(), true);
    paramContext.recycle();
  }

  private void b()
  {
    this.b.drawColor(0, PorterDuff.Mode.CLEAR);
    if (this.v == null)
      return;
    float f1 = this.b.getWidth() / 2.0F;
    f1 = f1 - 2.05F - f1 / this.c;
    float f2 = f1 / (this.c - 1) / 2.0F;
    itman.robert.b.b.b localb = this.v.a();
    localb.a = this.c;
    localb.b = f1;
    localb.c = f2;
    localb.d = 2.05F;
    localb.e = this.e;
    localb.f = this.d;
    localb.g = this.b;
    this.v.a(localb);
    this.v.d();
  }

  private void setColorPreviewColor(int paramInt)
  {
    if ((this.u == null) || (this.g == null) || (this.h > this.g.length) || (this.g[this.h] == null));
    View localView;
    do
    {
      do
        return;
      while ((this.u.getChildCount() == 0) || (this.u.getVisibility() != 0));
      localView = this.u.getChildAt(this.h);
    }
    while (!(localView instanceof LinearLayout));
    ((ImageView)((LinearLayout)localView).findViewById(a.e.image_preview)).setImageDrawable(new a(paramInt));
  }

  private void setColorText(int paramInt)
  {
    if (this.s == null)
      return;
    EditText localEditText = this.s;
    if (this.r != null);
    for (boolean bool = true; ; bool = false)
    {
      localEditText.setText(e.a(paramInt, bool));
      return;
    }
  }

  private void setColorToSliders(int paramInt)
  {
    if (this.q != null)
      this.q.setColor(paramInt);
    if (this.r != null)
      this.r.setColor(paramInt);
  }

  private void setHighlightedColor(int paramInt)
  {
    int i2 = this.u.getChildCount();
    if ((i2 == 0) || (this.u.getVisibility() != 0))
      return;
    int i1 = 0;
    label25: Object localObject;
    if (i1 < i2)
    {
      localObject = this.u.getChildAt(i1);
      if ((localObject instanceof LinearLayout))
        break label55;
    }
    while (true)
    {
      i1 += 1;
      break label25;
      break;
      label55: localObject = (LinearLayout)localObject;
      if (i1 == paramInt)
      {
        ((LinearLayout)localObject).setBackgroundColor(-1);
        continue;
      }
      ((LinearLayout)localObject).setBackgroundColor(0);
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    this.e = e.a(paramInt);
    this.d = arrayOfFloat[2];
    this.g[this.h] = Integer.valueOf(paramInt);
    this.i = Integer.valueOf(paramInt);
    setColorPreviewColor(paramInt);
    setColorToSliders(paramInt);
    if ((this.s != null) && (paramBoolean))
      setColorText(paramInt);
    if (this.v.b() != null)
      this.o = a(paramInt);
  }

  public void a(LinearLayout paramLinearLayout, Integer paramInteger)
  {
    if (paramLinearLayout == null);
    Integer localInteger;
    int i2;
    do
    {
      return;
      this.u = paramLinearLayout;
      localInteger = paramInteger;
      if (paramInteger == null)
        localInteger = Integer.valueOf(0);
      i2 = paramLinearLayout.getChildCount();
    }
    while ((i2 == 0) || (paramLinearLayout.getVisibility() != 0));
    int i1 = 0;
    label43: if (i1 < i2)
    {
      paramInteger = paramLinearLayout.getChildAt(i1);
      if ((paramInteger instanceof LinearLayout))
        break label69;
    }
    while (true)
    {
      i1 += 1;
      break label43;
      break;
      label69: paramInteger = (LinearLayout)paramInteger;
      if (i1 == localInteger.intValue())
        paramInteger.setBackgroundColor(-1);
      paramInteger = (ImageView)paramInteger.findViewById(a.e.image_preview);
      paramInteger.setClickable(true);
      paramInteger.setTag(Integer.valueOf(i1));
      paramInteger.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (paramView == null);
          do
          {
            return;
            paramView = paramView.getTag();
          }
          while ((paramView == null) || (!(paramView instanceof Integer)));
          c.this.setSelectedColor(((Integer)paramView).intValue());
        }
      });
    }
  }

  public void a(d paramd)
  {
    this.p.add(paramd);
  }

  public void a(Integer[] paramArrayOfInteger, int paramInt)
  {
    this.g = paramArrayOfInteger;
    this.h = paramInt;
    Integer localInteger = this.g[this.h];
    paramArrayOfInteger = localInteger;
    if (localInteger == null)
      paramArrayOfInteger = Integer.valueOf(-1);
    a(paramArrayOfInteger.intValue(), true);
  }

  public void b(int paramInt, boolean paramBoolean)
  {
    a(paramInt, paramBoolean);
    a();
    invalidate();
  }

  public Integer[] getAllColors()
  {
    return this.g;
  }

  public int getSelectedColor()
  {
    int i1 = 0;
    if (this.o != null)
      i1 = Color.HSVToColor(this.o.a(this.d));
    return e.a(this.e, i1);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.w != 0)
      setAlphaSlider((itman.robert.b.c.b)getRootView().findViewById(this.w));
    if (this.x != 0)
      setLightnessSlider((itman.robert.b.c.c)getRootView().findViewById(this.x));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(this.f);
    if (this.a != null)
      paramCanvas.drawBitmap(this.a, 0.0F, 0.0F, null);
    if (this.o != null)
    {
      float f1 = (paramCanvas.getWidth() / 2.0F - 2.05F) / this.c / 2.0F;
      this.k.setColor(Color.HSVToColor(this.o.a(this.d)));
      this.k.setAlpha((int)(this.e * 255.0F));
      paramCanvas.drawCircle(this.o.a(), this.o.b(), f1 * 2.0F, this.l);
      paramCanvas.drawCircle(this.o.a(), this.o.b(), 1.5F * f1, this.m);
      paramCanvas.drawCircle(this.o.a(), this.o.b(), f1, this.n);
      paramCanvas.drawCircle(this.o.a(), this.o.b(), f1, this.k);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = 0;
    super.onMeasure(paramInt1, paramInt2);
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i1;
    if (i3 == 0)
      i1 = paramInt1;
    while (true)
    {
      int i4 = View.MeasureSpec.getMode(paramInt2);
      if (i4 == 0);
      while (true)
      {
        paramInt2 = i1;
        if (paramInt1 < i1)
          paramInt2 = paramInt1;
        setMeasuredDimension(paramInt2, paramInt2);
        return;
        if (i3 == -2147483648)
        {
          i1 = View.MeasureSpec.getSize(paramInt1);
          break;
        }
        if (i3 != 1073741824)
          break label116;
        i1 = View.MeasureSpec.getSize(paramInt1);
        break;
        if (i4 == -2147483648)
        {
          paramInt1 = View.MeasureSpec.getSize(paramInt2);
          continue;
        }
        paramInt1 = i2;
        if (i3 != 1073741824)
          continue;
        paramInt1 = View.MeasureSpec.getSize(paramInt2);
      }
      label116: i1 = 0;
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
      this.o = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      int i1 = getSelectedColor();
      this.i = Integer.valueOf(i1);
      setColorToSliders(i1);
      invalidate();
      continue;
      i1 = getSelectedColor();
      if (this.p != null)
      {
        paramMotionEvent = this.p.iterator();
        while (paramMotionEvent.hasNext())
        {
          d locald = (d)paramMotionEvent.next();
          try
          {
            locald.a(i1);
          }
          catch (Exception localException)
          {
          }
        }
      }
      setColorToSliders(i1);
      setColorText(i1);
      setColorPreviewColor(i1);
      invalidate();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    a();
    this.o = a(this.i.intValue());
  }

  public void setAlphaSlider(itman.robert.b.c.b paramb)
  {
    this.r = paramb;
    if (paramb != null)
    {
      this.r.setColorPicker(this);
      this.r.setColor(getSelectedColor());
    }
  }

  public void setAlphaValue(float paramFloat)
  {
    this.e = paramFloat;
    this.i = Integer.valueOf(Color.HSVToColor(e.a(this.e), this.o.a(this.d)));
    EditText localEditText;
    int i1;
    if (this.s != null)
    {
      localEditText = this.s;
      i1 = this.i.intValue();
      if (this.r == null)
        break label110;
    }
    label110: for (boolean bool = true; ; bool = false)
    {
      localEditText.setText(e.a(i1, bool));
      if ((this.q != null) && (this.i != null))
        this.q.setColor(this.i.intValue());
      a();
      invalidate();
      return;
    }
  }

  public void setColorEdit(EditText paramEditText)
  {
    this.s = paramEditText;
    if (this.s != null)
    {
      this.s.setVisibility(0);
      this.s.addTextChangedListener(this.t);
      setColorEditTextColor(this.j.intValue());
    }
  }

  public void setColorEditTextColor(int paramInt)
  {
    this.j = Integer.valueOf(paramInt);
    if (this.s != null)
      this.s.setTextColor(paramInt);
  }

  public void setDensity(int paramInt)
  {
    this.c = Math.max(2, paramInt);
    invalidate();
  }

  public void setLightness(float paramFloat)
  {
    this.d = paramFloat;
    this.i = Integer.valueOf(Color.HSVToColor(e.a(this.e), this.o.a(paramFloat)));
    EditText localEditText;
    int i1;
    if (this.s != null)
    {
      localEditText = this.s;
      i1 = this.i.intValue();
      if (this.r == null)
        break label107;
    }
    label107: for (boolean bool = true; ; bool = false)
    {
      localEditText.setText(e.a(i1, bool));
      if ((this.r != null) && (this.i != null))
        this.r.setColor(this.i.intValue());
      a();
      invalidate();
      return;
    }
  }

  public void setLightnessSlider(itman.robert.b.c.c paramc)
  {
    this.q = paramc;
    if (paramc != null)
    {
      this.q.setColorPicker(this);
      this.q.setColor(getSelectedColor());
    }
  }

  public void setRenderer(itman.robert.b.b.c paramc)
  {
    this.v = paramc;
    invalidate();
  }

  public void setSelectedColor(int paramInt)
  {
    if ((this.g == null) || (this.g.length < paramInt));
    Integer localInteger;
    do
    {
      return;
      this.h = paramInt;
      setHighlightedColor(paramInt);
      localInteger = this.g[paramInt];
    }
    while (localInteger == null);
    b(localInteger.intValue(), true);
  }

  public static enum a
  {
    public static a a(int paramInt)
    {
      switch (paramInt)
      {
      default:
        return a;
      case 0:
        return a;
      case 1:
      }
      return b;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.c
 * JD-Core Version:    0.6.0
 */