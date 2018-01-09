package itman.robert.groupchatwebrtc.e;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class c
{
  public static void a(FragmentManager paramFragmentManager, int paramInt, Fragment paramFragment, String paramString)
  {
    paramFragmentManager.beginTransaction().replace(paramInt, paramFragment, paramString).commitAllowingStateLoss();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.c
 * JD-Core Version:    0.6.0
 */