package itman.robert.b.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import itman.robert.b.d;
import itman.robert.b.e;
import itman.robert.tabLayout.a.c;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;

public class b
{
  private android.support.v7.a.c.a a;
  private LinearLayout b;
  private itman.robert.b.c c;
  private itman.robert.b.c.c d;
  private itman.robert.b.c.b e;
  private EditText f;
  private LinearLayout g;
  private boolean h = true;
  private boolean i = true;
  private boolean j = false;
  private boolean k = false;
  private int l = 1;
  private int m = 0;
  private Integer[] n = { null, null, null, null, null };

  private b(Context paramContext, int paramInt)
  {
    this.m = b(paramContext, a.c.default_slider_margin);
    int i1 = b(paramContext, a.c.default_slider_margin_btw_title);
    this.a = new android.support.v7.a.c.a(paramContext, paramInt);
    this.b = new LinearLayout(paramContext);
    this.b.setOrientation(1);
    this.b.setGravity(1);
    this.b.setPadding(this.m, i1, this.m, this.m);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
    localLayoutParams.weight = 1.0F;
    this.c = new itman.robert.b.c(paramContext);
    this.b.addView(this.c, localLayoutParams);
    this.a.b(this.b);
  }

  public static b a(Context paramContext, int paramInt)
  {
    return new b(paramContext, paramInt);
  }

  private Integer a(Integer[] paramArrayOfInteger)
  {
    int i1 = 0;
    Integer localInteger = Integer.valueOf(0);
    while (true)
    {
      if ((i1 >= paramArrayOfInteger.length) || (paramArrayOfInteger[i1] == null))
        return localInteger;
      localInteger = Integer.valueOf((i1 + 1) / 2);
      i1 += 1;
    }
  }

  private void a(DialogInterface paramDialogInterface, a parama)
  {
    parama.a(paramDialogInterface, this.c.getSelectedColor(), this.c.getAllColors());
  }

  private static int b(Context paramContext, int paramInt)
  {
    return (int)(paramContext.getResources().getDimension(paramInt) + 0.5F);
  }

  private int b(Integer[] paramArrayOfInteger)
  {
    Integer localInteger = a(paramArrayOfInteger);
    if (localInteger == null)
      return -1;
    return paramArrayOfInteger[localInteger.intValue()].intValue();
  }

  public android.support.v7.a.c a()
  {
    Context localContext = this.a.a();
    this.c.a(this.n, a(this.n).intValue());
    Object localObject;
    if (this.h)
    {
      localObject = new LinearLayout.LayoutParams(-1, b(localContext, a.c.default_slider_height));
      this.d = new itman.robert.b.c.c(localContext);
      this.d.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.b.addView(this.d);
      this.c.setLightnessSlider(this.d);
      this.d.setColor(b(this.n));
    }
    if (this.i)
    {
      localObject = new LinearLayout.LayoutParams(-1, b(localContext, a.c.default_slider_height));
      this.e = new itman.robert.b.c.b(localContext);
      this.e.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.b.addView(this.e);
      this.c.setAlphaSlider(this.e);
      this.e.setColor(b(this.n));
    }
    int i1;
    if (this.j)
    {
      localObject = new LinearLayout.LayoutParams(-2, -2);
      this.f = ((EditText)View.inflate(localContext, a.g.picker_edit, null));
      this.f.setFilters(new InputFilter[] { new InputFilter.AllCaps() });
      this.f.setSingleLine();
      this.f.setVisibility(8);
      if (this.i)
      {
        i1 = 9;
        this.f.setFilters(new InputFilter[] { new InputFilter.LengthFilter(i1) });
        this.b.addView(this.f, (ViewGroup.LayoutParams)localObject);
        this.f.setText(e.a(b(this.n), this.i));
        this.c.setColorEdit(this.f);
      }
    }
    else if (this.k)
    {
      this.g = ((LinearLayout)View.inflate(localContext, a.g.color_preview, null));
      this.g.setVisibility(8);
      this.b.addView(this.g);
      if (this.n.length != 0)
        break label451;
      ((ImageView)View.inflate(localContext, a.g.color_selector, null)).setImageDrawable(new ColorDrawable(-1));
    }
    while (true)
    {
      this.g.setVisibility(0);
      this.c.a(this.g, a(this.n));
      return this.a.b();
      i1 = 7;
      break;
      label451: i1 = 0;
      while ((i1 < this.n.length) && (i1 < this.l) && (this.n[i1] != null))
      {
        localObject = (LinearLayout)View.inflate(localContext, a.g.color_selector, null);
        ((ImageView)((LinearLayout)localObject).findViewById(a.e.image_preview)).setImageDrawable(new ColorDrawable(this.n[i1].intValue()));
        this.g.addView((View)localObject);
        i1 += 1;
      }
    }
  }

  public b a(int paramInt)
  {
    this.n[0] = Integer.valueOf(paramInt);
    return this;
  }

  public b a(itman.robert.b.c.a parama)
  {
    parama = c.a(parama);
    this.c.setRenderer(parama);
    return this;
  }

  public b a(d paramd)
  {
    this.c.a(paramd);
    return this;
  }

  public b a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.c(paramCharSequence, paramOnClickListener);
    return this;
  }

  public b a(CharSequence paramCharSequence, a parama)
  {
    this.a.a(paramCharSequence, new DialogInterface.OnClickListener(parama)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        b.a(b.this, paramDialogInterface, this.a);
      }
    });
    return this;
  }

  public b a(String paramString)
  {
    this.a.a(paramString);
    return this;
  }

  public b b(int paramInt)
  {
    this.c.setDensity(paramInt);
    return this;
  }

  public b b(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.b(paramCharSequence, paramOnClickListener);
    return this;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.a.b
 * JD-Core Version:    0.6.0
 */