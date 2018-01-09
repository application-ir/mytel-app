package itman.robert.groupchatwebrtc.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.f;
import itman.robert.tabLayout.a.g;

public class SeekBarPreference extends Preference
  implements SeekBar.OnSeekBarChangeListener
{
  private Context a;
  private SeekBar b;
  private int c;
  private int d;
  private int e;
  private int f;

  public SeekBarPreference(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public SeekBarPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SeekBarPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.seekbar_preference);
    this.a = paramContext;
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = paramAttributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "max", a.f.pref_default_int_value);
    this.d = paramContext.getResources().getInteger(i);
    i = paramAttributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "min", a.f.pref_default_int_value);
    this.e = paramContext.getResources().getInteger(i);
    i = paramAttributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "stepSize", a.f.pref_default_int_value);
    this.f = paramContext.getResources().getInteger(i);
    Log.v("Attribute", "max = " + this.d);
    Log.v("Attribute", "min = " + this.e);
    Log.v("Attribute", "step = " + this.f);
  }

  public void a(int paramInt)
  {
    if (shouldPersist())
      persistInt(paramInt);
    if (paramInt != this.c)
    {
      this.c = paramInt;
      notifyChanged();
    }
    setSummary(String.valueOf(this.c));
  }

  protected void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.b = ((SeekBar)paramView.findViewById(a.e.seekbar));
    this.b.setMax(this.d);
    this.b.setProgress(this.c);
    this.b.setOnSeekBarChangeListener(this);
  }

  protected Object onGetDefaultValue(TypedArray paramTypedArray, int paramInt)
  {
    return Integer.valueOf(paramTypedArray.getInt(paramInt, 0));
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    int i = paramInt / this.f * this.f;
    paramInt = i;
    if (i <= this.e)
      paramInt = i + this.e;
    a(paramInt);
  }

  protected void onSetInitialValue(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean);
    for (int i = getPersistedInt(this.c); ; i = ((Integer)paramObject).intValue())
    {
      a(i);
      return;
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.view.SeekBarPreference
 * JD-Core Version:    0.6.0
 */