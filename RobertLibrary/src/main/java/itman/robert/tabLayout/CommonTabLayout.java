package itman.robert.tabLayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import itman.robert.tabLayout.widget.MsgView;
import java.util.ArrayList;

public class CommonTabLayout extends FrameLayout
  implements ValueAnimator.AnimatorUpdateListener
{
  private boolean A;
  private int B;
  private int C;
  private float D;
  private int E;
  private int F;
  private float G;
  private float H;
  private float I;
  private int J;
  private int K;
  private int L;
  private boolean M;
  private boolean N;
  private int O;
  private float P;
  private float Q;
  private float R;
  private int S;
  private ValueAnimator T;
  private OvershootInterpolator U = new OvershootInterpolator(1.5F);
  private itman.robert.tabLayout.b.a V;
  private boolean W = true;
  private Context a;
  private Paint aa = new Paint(1);
  private SparseArray<Boolean> ab = new SparseArray();
  private itman.robert.tabLayout.a.b ac;
  private a ad = new a();
  private a ae = new a();
  private ArrayList<itman.robert.tabLayout.a.a> b = new ArrayList();
  private LinearLayout c;
  private int d;
  private int e;
  private int f;
  private Rect g = new Rect();
  private GradientDrawable h = new GradientDrawable();
  private Paint i = new Paint(1);
  private Paint j = new Paint(1);
  private Paint k = new Paint(1);
  private Path l = new Path();
  private int m = 0;
  private float n;
  private boolean o;
  private float p;
  private int q;
  private float r;
  private float s;
  private float t;
  private float u;
  private float v;
  private float w;
  private float x;
  private long y;
  private boolean z;

  public CommonTabLayout(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public CommonTabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CommonTabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    setClipChildren(false);
    setClipToPadding(false);
    this.a = paramContext;
    this.c = new LinearLayout(paramContext);
    addView(this.c);
    a(paramContext, paramAttributeSet);
    String str = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
    if (str.equals("-1"));
    while (true)
    {
      this.T = ValueAnimator.ofObject(new b(), new Object[] { this.ae, this.ad });
      this.T.addUpdateListener(this);
      return;
      if (str.equals("-2"))
        continue;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842997 });
      this.S = paramContext.getDimensionPixelSize(0, -2);
      paramContext.recycle();
    }
  }

  private void a(int paramInt, View paramView)
  {
    ((TextView)paramView.findViewById(a.e.tv_tab_title)).setText(((itman.robert.tabLayout.a.a)this.b.get(paramInt)).a());
    ((ImageView)paramView.findViewById(a.e.iv_tab_icon)).setImageResource(((itman.robert.tabLayout.a.a)this.b.get(paramInt)).c());
    paramView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        int i = ((Integer)paramView.getTag()).intValue();
        if (CommonTabLayout.a(CommonTabLayout.this) != i)
        {
          CommonTabLayout.this.setCurrentTab(i);
          if (CommonTabLayout.b(CommonTabLayout.this) != null)
            CommonTabLayout.b(CommonTabLayout.this).a(i);
        }
        do
          return;
        while (CommonTabLayout.b(CommonTabLayout.this) == null);
        CommonTabLayout.b(CommonTabLayout.this).b(i);
      }
    });
    if (this.o);
    for (LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0F); ; localLayoutParams = new LinearLayout.LayoutParams(-2, -1))
    {
      if (this.p > 0.0F)
        localLayoutParams = new LinearLayout.LayoutParams((int)this.p, -1);
      this.c.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.CommonTabLayout);
    this.m = paramAttributeSet.getInt(a.k.CommonTabLayout_tl_indicator_style, 0);
    int i1 = a.k.CommonTabLayout_tl_indicator_color;
    float f1;
    if (this.m == 2)
    {
      paramContext = "#4B6A87";
      this.q = paramAttributeSet.getColor(i1, Color.parseColor(paramContext));
      int i2 = a.k.CommonTabLayout_tl_indicator_height;
      if (this.m != 1)
        break label638;
      f1 = 4.0F;
      this.r = paramAttributeSet.getDimension(i2, a(f1));
      i1 = a.k.CommonTabLayout_tl_indicator_width;
      if (this.m != 1)
        break label662;
      f1 = 10.0F;
      label102: this.s = paramAttributeSet.getDimension(i1, a(f1));
      i1 = a.k.CommonTabLayout_tl_indicator_corner_radius;
      if (this.m != 2)
        break label669;
      f1 = -1.0F;
      label135: this.t = paramAttributeSet.getDimension(i1, a(f1));
      this.u = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_indicator_margin_left, a(0.0F));
      i1 = a.k.CommonTabLayout_tl_indicator_margin_top;
      if (this.m != 2)
        break label674;
      f1 = 7.0F;
      label185: this.v = paramAttributeSet.getDimension(i1, a(f1));
      this.w = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_indicator_margin_right, a(0.0F));
      i1 = a.k.CommonTabLayout_tl_indicator_margin_bottom;
      if (this.m != 2)
        break label679;
      f1 = 7.0F;
      label235: this.x = paramAttributeSet.getDimension(i1, a(f1));
      this.z = paramAttributeSet.getBoolean(a.k.CommonTabLayout_tl_indicator_anim_enable, true);
      this.A = paramAttributeSet.getBoolean(a.k.CommonTabLayout_tl_indicator_bounce_enable, true);
      this.y = paramAttributeSet.getInt(a.k.CommonTabLayout_tl_indicator_anim_duration, -1);
      this.B = paramAttributeSet.getInt(a.k.CommonTabLayout_tl_indicator_gravity, 80);
      this.C = paramAttributeSet.getColor(a.k.CommonTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
      this.D = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_underline_height, a(0.0F));
      this.E = paramAttributeSet.getInt(a.k.CommonTabLayout_tl_underline_gravity, 80);
      this.F = paramAttributeSet.getColor(a.k.CommonTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
      this.G = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_divider_width, a(0.0F));
      this.H = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_divider_padding, a(12.0F));
      this.I = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_textsize, b(13.0F));
      this.J = paramAttributeSet.getColor(a.k.CommonTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
      this.K = paramAttributeSet.getColor(a.k.CommonTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
      this.L = paramAttributeSet.getInt(a.k.CommonTabLayout_tl_textBold, 0);
      this.M = paramAttributeSet.getBoolean(a.k.CommonTabLayout_tl_textAllCaps, false);
      this.N = paramAttributeSet.getBoolean(a.k.CommonTabLayout_tl_iconVisible, true);
      this.O = paramAttributeSet.getInt(a.k.CommonTabLayout_tl_iconGravity, 48);
      this.P = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_iconWidth, a(0.0F));
      this.Q = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_iconHeight, a(0.0F));
      this.R = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_iconMargin, a(2.5F));
      this.o = paramAttributeSet.getBoolean(a.k.CommonTabLayout_tl_tab_space_equal, true);
      this.p = paramAttributeSet.getDimension(a.k.CommonTabLayout_tl_tab_width, a(-1.0F));
      i1 = a.k.CommonTabLayout_tl_tab_padding;
      if ((!this.o) && (this.p <= 0.0F))
        break label684;
      f1 = a(0.0F);
    }
    while (true)
    {
      this.n = paramAttributeSet.getDimension(i1, f1);
      paramAttributeSet.recycle();
      return;
      paramContext = "#ffffff";
      break;
      label638: if (this.m == 2);
      for (i1 = -1; ; i1 = 2)
      {
        f1 = i1;
        break;
      }
      label662: f1 = -1.0F;
      break label102;
      label669: f1 = 0.0F;
      break label135;
      label674: f1 = 0.0F;
      break label185;
      label679: f1 = 0.0F;
      break label235;
      label684: f1 = a(10.0F);
    }
  }

  private void b()
  {
    int i1 = 0;
    if (i1 < this.f)
    {
      Object localObject1 = this.c.getChildAt(i1);
      ((View)localObject1).setPadding((int)this.n, 0, (int)this.n, 0);
      Object localObject2 = (TextView)((View)localObject1).findViewById(a.e.tv_tab_title);
      int i2;
      label63: label121: int i3;
      if (i1 == this.d)
      {
        i2 = this.J;
        ((TextView)localObject2).setTextColor(i2);
        ((TextView)localObject2).setTextSize(0, this.I);
        if (this.M)
          ((TextView)localObject2).setText(((TextView)localObject2).getText().toString().toUpperCase());
        if (this.L != 2)
          break label257;
        ((TextView)localObject2).getPaint().setFakeBoldText(true);
        localObject1 = (ImageView)((View)localObject1).findViewById(a.e.iv_tab_icon);
        if (!this.N)
          break label361;
        ((ImageView)localObject1).setVisibility(0);
        localObject2 = (itman.robert.tabLayout.a.a)this.b.get(i1);
        if (i1 != this.d)
          break label276;
        i2 = ((itman.robert.tabLayout.a.a)localObject2).b();
        label176: ((ImageView)localObject1).setImageResource(i2);
        if (this.P > 0.0F)
          break label287;
        i2 = -2;
        label194: if (this.Q > 0.0F)
          break label296;
        i3 = -2;
        label206: localObject2 = new LinearLayout.LayoutParams(i2, i3);
        if (this.O != 3)
          break label305;
        ((LinearLayout.LayoutParams)localObject2).rightMargin = (int)this.R;
        label235: ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      while (true)
      {
        i1 += 1;
        break;
        i2 = this.K;
        break label63;
        label257: if (this.L != 0)
          break label121;
        ((TextView)localObject2).getPaint().setFakeBoldText(false);
        break label121;
        label276: i2 = ((itman.robert.tabLayout.a.a)localObject2).c();
        break label176;
        label287: i2 = (int)this.P;
        break label194;
        label296: i3 = (int)this.Q;
        break label206;
        label305: if (this.O == 5)
        {
          ((LinearLayout.LayoutParams)localObject2).leftMargin = (int)this.R;
          break label235;
        }
        if (this.O == 80)
        {
          ((LinearLayout.LayoutParams)localObject2).topMargin = (int)this.R;
          break label235;
        }
        ((LinearLayout.LayoutParams)localObject2).bottomMargin = (int)this.R;
        break label235;
        label361: ((ImageView)localObject1).setVisibility(8);
      }
    }
  }

  private void c()
  {
    View localView = this.c.getChildAt(this.d);
    this.ad.a = localView.getLeft();
    this.ad.b = localView.getRight();
    localView = this.c.getChildAt(this.e);
    this.ae.a = localView.getLeft();
    this.ae.b = localView.getRight();
    if ((this.ae.a == this.ad.a) && (this.ae.b == this.ad.b))
    {
      invalidate();
      return;
    }
    this.T.setObjectValues(new Object[] { this.ae, this.ad });
    if (this.A)
      this.T.setInterpolator(this.U);
    long l1;
    if (this.y < 0L)
    {
      if (!this.A)
        break label201;
      l1 = 500L;
    }
    while (true)
    {
      this.y = l1;
      this.T.setDuration(this.y);
      this.T.start();
      return;
      label201: l1 = 250L;
    }
  }

  private void c(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.f)
    {
      Object localObject = this.c.getChildAt(i1);
      boolean bool;
      label28: TextView localTextView;
      label51: itman.robert.tabLayout.a.a locala;
      if (i1 == paramInt)
      {
        bool = true;
        localTextView = (TextView)((View)localObject).findViewById(a.e.tv_tab_title);
        if (!bool)
          break label133;
        i2 = this.J;
        localTextView.setTextColor(i2);
        localObject = (ImageView)((View)localObject).findViewById(a.e.iv_tab_icon);
        locala = (itman.robert.tabLayout.a.a)this.b.get(i1);
        if (!bool)
          break label141;
      }
      label133: label141: for (int i2 = locala.b(); ; i2 = locala.c())
      {
        ((ImageView)localObject).setImageResource(i2);
        if (this.L == 1)
          localTextView.getPaint().setFakeBoldText(bool);
        i1 += 1;
        break;
        bool = false;
        break label28;
        i2 = this.K;
        break label51;
      }
    }
  }

  private void d()
  {
    View localView = this.c.getChildAt(this.d);
    float f1 = localView.getLeft();
    float f2 = localView.getRight();
    this.g.left = (int)f1;
    this.g.right = (int)f2;
    if (this.s < 0.0F)
      return;
    f1 = localView.getLeft();
    f2 = (localView.getWidth() - this.s) / 2.0F;
    this.g.left = (int)(f2 + f1);
    this.g.right = (int)(this.g.left + this.s);
  }

  protected int a(float paramFloat)
  {
    return (int)(this.a.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
  }

  public void a()
  {
    this.c.removeAllViews();
    this.f = this.b.size();
    int i1 = 0;
    if (i1 < this.f)
    {
      View localView;
      if (this.O == 3)
        localView = View.inflate(this.a, a.g.layout_tab_left, null);
      while (true)
      {
        localView.setTag(Integer.valueOf(i1));
        a(i1, localView);
        i1 += 1;
        break;
        if (this.O == 5)
        {
          localView = View.inflate(this.a, a.g.layout_tab_right, null);
          continue;
        }
        if (this.O == 80)
        {
          localView = View.inflate(this.a, a.g.layout_tab_bottom, null);
          continue;
        }
        localView = View.inflate(this.a, a.g.layout_tab_top, null);
      }
    }
    b();
  }

  public void a(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt >= this.f)
      i1 = this.f - 1;
    MsgView localMsgView = (MsgView)this.c.getChildAt(i1).findViewById(a.e.rtv_msg_tip);
    if (localMsgView != null)
      localMsgView.setVisibility(8);
  }

  public void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i1 = paramInt;
    if (paramInt >= this.f)
      i1 = this.f - 1;
    Object localObject = this.c.getChildAt(i1);
    MsgView localMsgView = (MsgView)((View)localObject).findViewById(a.e.rtv_msg_tip);
    float f3;
    float f2;
    float f1;
    if (localMsgView != null)
    {
      localObject = (TextView)((View)localObject).findViewById(a.e.tv_tab_title);
      this.aa.setTextSize(this.I);
      this.aa.measureText(((TextView)localObject).getText().toString());
      f3 = this.aa.descent() - this.aa.ascent();
      localObject = (ViewGroup.MarginLayoutParams)localMsgView.getLayoutParams();
      f2 = this.Q;
      if (!this.N)
        break label320;
      f1 = f2;
      if (f2 <= 0.0F)
        f1 = this.a.getResources().getDrawable(((itman.robert.tabLayout.a.a)this.b.get(i1)).b()).getIntrinsicHeight();
      f2 = this.R;
    }
    while (true)
    {
      if ((this.O == 48) || (this.O == 80))
      {
        ((ViewGroup.MarginLayoutParams)localObject).leftMargin = a(paramFloat1);
        if (this.S > 0);
        for (paramInt = (int)(this.S - f3 - f1 - f2) / 2 - a(paramFloat2); ; paramInt = a(paramFloat2))
        {
          ((ViewGroup.MarginLayoutParams)localObject).topMargin = paramInt;
          localMsgView.setLayoutParams((ViewGroup.LayoutParams)localObject);
          return;
        }
      }
      ((ViewGroup.MarginLayoutParams)localObject).leftMargin = a(paramFloat1);
      if (this.S > 0);
      for (paramInt = (int)(this.S - Math.max(f3, f1)) / 2 - a(paramFloat2); ; paramInt = a(paramFloat2))
      {
        ((ViewGroup.MarginLayoutParams)localObject).topMargin = paramInt;
        break;
      }
      label320: f1 = f2;
      f2 = 0.0F;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    if (paramInt1 >= this.f)
      i1 = this.f - 1;
    MsgView localMsgView = (MsgView)this.c.getChildAt(i1).findViewById(a.e.rtv_msg_tip);
    localMsgView.setTypeface(Typeface.createFromAsset(this.a.getAssets(), "fonts/rmedium.ttf"));
    if (localMsgView != null)
    {
      itman.robert.tabLayout.b.b.a(localMsgView, paramInt2);
      if ((this.ab.get(i1) == null) || (!((Boolean)this.ab.get(i1)).booleanValue()));
    }
    else
    {
      return;
    }
    if (!this.N)
    {
      a(i1, 2.0F, 2.0F);
      this.ab.put(i1, Boolean.valueOf(true));
      return;
    }
    float f1;
    if ((this.O == 3) || (this.O == 5))
      f1 = 4.0F;
    while (true)
    {
      a(i1, 0.0F, f1);
      break;
      f1 = 0.0F;
    }
  }

  protected int b(float paramFloat)
  {
    return (int)(this.a.getResources().getDisplayMetrics().scaledDensity * paramFloat + 0.5F);
  }

  public MsgView b(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt >= this.f)
      i1 = this.f - 1;
    return (MsgView)this.c.getChildAt(i1).findViewById(a.e.rtv_msg_tip);
  }

  public int getCurrentTab()
  {
    return this.d;
  }

  public int getDividerColor()
  {
    return this.F;
  }

  public float getDividerPadding()
  {
    return this.H;
  }

  public float getDividerWidth()
  {
    return this.G;
  }

  public int getIconGravity()
  {
    return this.O;
  }

  public float getIconHeight()
  {
    return this.Q;
  }

  public float getIconMargin()
  {
    return this.R;
  }

  public float getIconWidth()
  {
    return this.P;
  }

  public long getIndicatorAnimDuration()
  {
    return this.y;
  }

  public int getIndicatorColor()
  {
    return this.q;
  }

  public float getIndicatorCornerRadius()
  {
    return this.t;
  }

  public float getIndicatorHeight()
  {
    return this.r;
  }

  public float getIndicatorMarginBottom()
  {
    return this.x;
  }

  public float getIndicatorMarginLeft()
  {
    return this.u;
  }

  public float getIndicatorMarginRight()
  {
    return this.w;
  }

  public float getIndicatorMarginTop()
  {
    return this.v;
  }

  public int getIndicatorStyle()
  {
    return this.m;
  }

  public float getIndicatorWidth()
  {
    return this.s;
  }

  public int getTabCount()
  {
    return this.f;
  }

  public float getTabPadding()
  {
    return this.n;
  }

  public float getTabWidth()
  {
    return this.p;
  }

  public int getTextBold()
  {
    return this.L;
  }

  public int getTextSelectColor()
  {
    return this.J;
  }

  public int getTextUnselectColor()
  {
    return this.K;
  }

  public float getTextsize()
  {
    return this.I;
  }

  public int getUnderlineColor()
  {
    return this.C;
  }

  public float getUnderlineHeight()
  {
    return this.D;
  }

  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    View localView = this.c.getChildAt(this.d);
    paramValueAnimator = (a)paramValueAnimator.getAnimatedValue();
    this.g.left = (int)paramValueAnimator.a;
    this.g.right = (int)paramValueAnimator.b;
    if (this.s < 0.0F);
    while (true)
    {
      invalidate();
      return;
      float f1 = paramValueAnimator.a;
      float f2 = (localView.getWidth() - this.s) / 2.0F;
      this.g.left = (int)(f1 + f2);
      this.g.right = (int)(this.g.left + this.s);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((isInEditMode()) || (this.f <= 0));
    int i2;
    int i3;
    label188: label373: label380: 
    do
      while (true)
      {
        return;
        i2 = getHeight();
        i3 = getPaddingLeft();
        if (this.G > 0.0F)
        {
          this.j.setStrokeWidth(this.G);
          this.j.setColor(this.F);
          int i1 = 0;
          while (i1 < this.f - 1)
          {
            View localView = this.c.getChildAt(i1);
            paramCanvas.drawLine(localView.getRight() + i3, this.H, localView.getRight() + i3, i2 - this.H, this.j);
            i1 += 1;
          }
        }
        if (this.D > 0.0F)
        {
          this.i.setColor(this.C);
          if (this.E == 80)
            paramCanvas.drawRect(i3, i2 - this.D, this.c.getWidth() + i3, i2, this.i);
        }
        else
        {
          if (!this.z)
            break label373;
          if (this.W)
          {
            this.W = false;
            d();
          }
        }
        while (true)
        {
          if (this.m != 1)
            break label380;
          if (this.r <= 0.0F)
            break;
          this.k.setColor(this.q);
          this.l.reset();
          this.l.moveTo(this.g.left + i3, i2);
          this.l.lineTo(this.g.left / 2 + i3 + this.g.right / 2, i2 - this.r);
          this.l.lineTo(this.g.right + i3, i2);
          this.l.close();
          paramCanvas.drawPath(this.l, this.k);
          return;
          paramCanvas.drawRect(i3, 0.0F, this.c.getWidth() + i3, this.D, this.i);
          break label188;
          d();
        }
        if (this.m != 2)
          break;
        if (this.r < 0.0F)
          this.r = (i2 - this.v - this.x);
        if (this.r <= 0.0F)
          continue;
        if ((this.t < 0.0F) || (this.t > this.r / 2.0F))
          this.t = (this.r / 2.0F);
        this.h.setColor(this.q);
        this.h.setBounds((int)this.u + i3 + this.g.left, (int)this.v, (int)(this.g.right + i3 - this.w), (int)(this.v + this.r));
        this.h.setCornerRadius(this.t);
        this.h.draw(paramCanvas);
        return;
      }
    while (this.r <= 0.0F);
    this.h.setColor(this.q);
    if (this.B == 80)
      this.h.setBounds((int)this.u + i3 + this.g.left, i2 - (int)this.r - (int)this.x, this.g.right + i3 - (int)this.w, i2 - (int)this.x);
    while (true)
    {
      this.h.setCornerRadius(this.t);
      this.h.draw(paramCanvas);
      return;
      this.h.setBounds((int)this.u + i3 + this.g.left, (int)this.v, this.g.right + i3 - (int)this.w, (int)this.r + (int)this.v);
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Parcelable localParcelable = paramParcelable;
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      this.d = paramParcelable.getInt("mCurrentTab");
      paramParcelable = paramParcelable.getParcelable("instanceState");
      localParcelable = paramParcelable;
      if (this.d != 0)
      {
        localParcelable = paramParcelable;
        if (this.c.getChildCount() > 0)
        {
          c(this.d);
          localParcelable = paramParcelable;
        }
      }
    }
    super.onRestoreInstanceState(localParcelable);
  }

  protected Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("instanceState", super.onSaveInstanceState());
    localBundle.putInt("mCurrentTab", this.d);
    return localBundle;
  }

  public void setCurrentTab(int paramInt)
  {
    this.e = this.d;
    this.d = paramInt;
    c(paramInt);
    if (this.V != null)
      this.V.a(paramInt);
    if (this.z)
    {
      c();
      return;
    }
    invalidate();
  }

  public void setDividerColor(int paramInt)
  {
    this.F = paramInt;
    invalidate();
  }

  public void setDividerPadding(float paramFloat)
  {
    this.H = a(paramFloat);
    invalidate();
  }

  public void setDividerWidth(float paramFloat)
  {
    this.G = a(paramFloat);
    invalidate();
  }

  public void setIconGravity(int paramInt)
  {
    this.O = paramInt;
    a();
  }

  public void setIconHeight(float paramFloat)
  {
    this.Q = a(paramFloat);
    b();
  }

  public void setIconMargin(float paramFloat)
  {
    this.R = a(paramFloat);
    b();
  }

  public void setIconVisible(boolean paramBoolean)
  {
    this.N = paramBoolean;
    b();
  }

  public void setIconWidth(float paramFloat)
  {
    this.P = a(paramFloat);
    b();
  }

  public void setIndicatorAnimDuration(long paramLong)
  {
    this.y = paramLong;
  }

  public void setIndicatorAnimEnable(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }

  public void setIndicatorBounceEnable(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }

  public void setIndicatorColor(int paramInt)
  {
    this.q = paramInt;
    invalidate();
  }

  public void setIndicatorCornerRadius(float paramFloat)
  {
    this.t = a(paramFloat);
    invalidate();
  }

  public void setIndicatorGravity(int paramInt)
  {
    this.B = paramInt;
    invalidate();
  }

  public void setIndicatorHeight(float paramFloat)
  {
    this.r = a(paramFloat);
    invalidate();
  }

  public void setIndicatorStyle(int paramInt)
  {
    this.m = paramInt;
    invalidate();
  }

  public void setIndicatorWidth(float paramFloat)
  {
    this.s = a(paramFloat);
    invalidate();
  }

  public void setOnTabSelectListener(itman.robert.tabLayout.a.b paramb)
  {
    this.ac = paramb;
  }

  public void setTabData(ArrayList<itman.robert.tabLayout.a.a> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
      throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
    this.b.clear();
    this.b.addAll(paramArrayList);
    a();
  }

  public void setTabPadding(float paramFloat)
  {
    this.n = a(paramFloat);
    b();
  }

  public void setTabSpaceEqual(boolean paramBoolean)
  {
    this.o = paramBoolean;
    b();
  }

  public void setTabWidth(float paramFloat)
  {
    this.p = a(paramFloat);
    b();
  }

  public void setTextAllCaps(boolean paramBoolean)
  {
    this.M = paramBoolean;
    b();
  }

  public void setTextBold(int paramInt)
  {
    this.L = paramInt;
    b();
  }

  public void setTextSelectColor(int paramInt)
  {
    this.J = paramInt;
    b();
  }

  public void setTextUnselectColor(int paramInt)
  {
    this.K = paramInt;
    b();
  }

  public void setTextsize(float paramFloat)
  {
    this.I = b(paramFloat);
    b();
  }

  public void setUnderlineColor(int paramInt)
  {
    this.C = paramInt;
    invalidate();
  }

  public void setUnderlineGravity(int paramInt)
  {
    this.E = paramInt;
    invalidate();
  }

  public void setUnderlineHeight(float paramFloat)
  {
    this.D = a(paramFloat);
    invalidate();
  }

  class a
  {
    public float a;
    public float b;

    a()
    {
    }
  }

  class b
    implements TypeEvaluator<CommonTabLayout.a>
  {
    b()
    {
    }

    public CommonTabLayout.a a(float paramFloat, CommonTabLayout.a parama1, CommonTabLayout.a parama2)
    {
      float f1 = parama1.a;
      float f2 = parama2.a;
      float f3 = parama1.a;
      float f4 = parama1.b;
      float f5 = parama2.b;
      float f6 = parama1.b;
      parama1 = new CommonTabLayout.a(CommonTabLayout.this);
      parama1.a = (f1 + (f2 - f3) * paramFloat);
      parama1.b = (f4 + (f5 - f6) * paramFloat);
      return parama1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.tabLayout.CommonTabLayout
 * JD-Core Version:    0.6.0
 */