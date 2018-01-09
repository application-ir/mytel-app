package itman.robert.groupchatwebrtc.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.preference.ListPreference;
import android.text.TextUtils;
import android.util.AttributeSet;

public class ListPreferenceCompat extends ListPreference
{
  public ListPreferenceCompat(Context paramContext)
  {
    super(paramContext);
  }

  public ListPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @TargetApi(21)
  public ListPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  @TargetApi(21)
  public ListPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }

  public void setValue(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 19)
      super.setValue(paramString);
    String str;
    do
    {
      return;
      str = getValue();
      super.setValue(paramString);
    }
    while (TextUtils.equals(paramString, str));
    notifyChanged();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.view.ListPreferenceCompat
 * JD-Core Version:    0.6.0
 */