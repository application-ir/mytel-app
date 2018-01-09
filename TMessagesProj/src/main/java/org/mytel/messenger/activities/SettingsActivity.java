package itman.robert.groupchatwebrtc.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import itman.robert.c.c.d;
import itman.robert.groupchatwebrtc.c.f;
import itman.robert.groupchatwebrtc.view.SeekBarPreference;
import itman.robert.tabLayout.a.j;

public class SettingsActivity extends a
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  private String r;
  private f s;

  public static void a(Context paramContext)
  {
    paramContext.startActivity(new Intent(paramContext, SettingsActivity.class));
  }

  private void a(SharedPreferences paramSharedPreferences)
  {
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    localEditor.putInt(this.r, Integer.parseInt(getString(a.j.pref_startbitratevalue_default)));
    localEditor.apply();
    a(paramSharedPreferences, this.r);
  }

  private void a(SharedPreferences paramSharedPreferences, String paramString)
  {
    Preference localPreference = this.s.findPreference(paramString);
    if ((localPreference instanceof EditTextPreference))
    {
      ((EditTextPreference)localPreference).setText(paramSharedPreferences.getString(paramString, ""));
      return;
    }
    if ((localPreference instanceof SeekBarPreference))
    {
      localPreference.setSummary(String.valueOf(paramSharedPreferences.getInt(paramString, 0)));
      return;
    }
    localPreference.setSummary(paramSharedPreferences.getString(paramString, ""));
  }

  private void m()
  {
    this.n.a(a.j.actionbar_title_settings);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    m();
    this.s = new f();
    getFragmentManager().beginTransaction().replace(16908290, this.s).commit();
    this.r = getString(a.j.pref_startbitratevalue_key);
  }

  protected void onPause()
  {
    super.onPause();
    this.s.getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
  }

  protected void onResume()
  {
    super.onResume();
    this.s.getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
  }

  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    int i;
    if (paramString.equals(this.r))
    {
      i = paramSharedPreferences.getInt(this.r, Integer.parseInt(getString(a.j.pref_startbitratevalue_default)));
      if (i != 0)
        break label42;
      a(paramSharedPreferences);
    }
    label42: 
    do
      return;
    while (i <= 2000);
    d.b("Max value is:2000");
    a(paramSharedPreferences);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.activities.SettingsActivity
 * JD-Core Version:    0.6.0
 */