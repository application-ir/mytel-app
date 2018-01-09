package itman.robert.groupchatwebrtc.c;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import itman.robert.tabLayout.a.l;

public class f extends PreferenceFragment
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(a.l.preferences);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    if (paramLayoutInflater != null)
      ((ListView)paramLayoutInflater.findViewById(16908298)).setPadding(0, 0, 0, 0);
    return paramLayoutInflater;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.c.f
 * JD-Core Version:    0.6.0
 */