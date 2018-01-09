package itman.robert.groupchatwebrtc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.a;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.j;

public class PermissionsActivity extends android.support.v7.a.d
{
  private itman.robert.groupchatwebrtc.e.d n;
  private boolean o;

  public static void a(Activity paramActivity, boolean paramBoolean, String[] paramArrayOfString)
  {
    Intent localIntent = new Intent(paramActivity, PermissionsActivity.class);
    localIntent.putExtra("extraPermissions", paramArrayOfString);
    localIntent.putExtra("checkAudio", paramBoolean);
    a.a(paramActivity, localIntent, null);
  }

  private void a(String paramString)
  {
    if (this.n.a(new String[] { paramString }))
    {
      b(new String[] { paramString });
      return;
    }
    m();
  }

  private void a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length > 1)
    {
      int i = 0;
      while (i < paramArrayOfInt.length)
      {
        if (paramArrayOfInt[i] != 0)
          itman.robert.c.c.d.b(getString(a.j.permission_unavailable, new Object[] { a.values()[i] }));
        i += 1;
      }
    }
    itman.robert.c.c.d.b(getString(a.j.permission_unavailable, new Object[] { a.b }));
  }

  private void a(String[] paramArrayOfString)
  {
    if (this.n.a(paramArrayOfString))
    {
      b(paramArrayOfString);
      return;
    }
    m();
  }

  private void b(String[] paramArrayOfString)
  {
    a.a(this, paramArrayOfString, 0);
  }

  private boolean b(int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramArrayOfInt[i] == -1)
        return false;
      i += 1;
    }
    return true;
  }

  private void j()
  {
    String[] arrayOfString = k();
    if (l())
    {
      a(arrayOfString[1]);
      return;
    }
    a(arrayOfString);
  }

  private String[] k()
  {
    return getIntent().getStringArrayExtra("extraPermissions");
  }

  private boolean l()
  {
    return getIntent().getBooleanExtra("checkAudio", false);
  }

  private void m()
  {
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((getIntent() == null) || (!getIntent().hasExtra("extraPermissions")))
      throw new RuntimeException("This Activity needs to be launched using the static startActivityForResult() method.");
    setContentView(a.g.activity_permissions);
    this.n = new itman.robert.groupchatwebrtc.e.d(this);
    this.o = true;
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramInt == 0) && (b(paramArrayOfInt)))
    {
      this.o = true;
      m();
      return;
    }
    this.o = false;
    a(paramArrayOfInt);
    finish();
  }

  protected void onResume()
  {
    super.onResume();
    if (this.o)
    {
      j();
      return;
    }
    this.o = true;
  }

  private static enum a
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.activities.PermissionsActivity
 * JD-Core Version:    0.6.0
 */