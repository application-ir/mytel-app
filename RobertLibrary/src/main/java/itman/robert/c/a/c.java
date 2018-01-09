package itman.robert.c.a;

import android.app.Activity;
import android.app.Dialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.quickblox.c.d.j;
import com.quickblox.d.b.l;
import java.util.ArrayList;

public class c
{
  private static final String a = c.class.getSimpleName();

  private void d(String paramString)
  {
    new AsyncTask()
    {
      protected String a(String[] paramArrayOfString)
      {
        try
        {
          paramArrayOfString = com.google.android.gms.iid.a.c(itman.robert.c.a.a()).b(paramArrayOfString[0], "GCM", null);
          return paramArrayOfString;
        }
        catch (java.io.IOException paramArrayOfString)
        {
          Log.w(c.d(), paramArrayOfString);
        }
        return null;
      }

      protected void a(String paramString)
      {
        if (TextUtils.isEmpty(paramString))
        {
          Log.w(c.d(), "Device wasn't registered in GCM");
          return;
        }
        Log.i(c.d(), "Device registered in GCM, regId=" + paramString);
        l locall = new l();
        locall.a(com.quickblox.d.b.f.a);
        locall.b(j.a(itman.robert.c.a.a()));
        locall.a(paramString);
        locall.a(com.quickblox.d.b.b.a);
        com.quickblox.d.b.a(locall, new com.quickblox.c.b(paramString)
        {
          public void a(com.quickblox.c.c.b paramb)
          {
            Log.w(c.d(), "Unable to subscribe for QB push messages; " + paramb.toString());
          }

          public void a(ArrayList<l> paramArrayList, Bundle paramBundle)
          {
            Log.i(c.d(), "Successfully subscribed for QB push messages");
            c.this.c(this.a);
          }
        });
      }
    }
    .execute(new String[] { paramString });
  }

  private int e()
  {
    return com.google.android.gms.common.b.a().a(itman.robert.c.a.a());
  }

  private void e(String paramString)
  {
    new AsyncTask()
    {
      protected Void a(String[] paramArrayOfString)
      {
        try
        {
          com.google.android.gms.iid.a.c(itman.robert.c.a.a()).a(paramArrayOfString[0], "GCM");
          return null;
        }
        catch (java.io.IOException paramArrayOfString)
        {
          Log.w(c.d(), paramArrayOfString);
        }
        return null;
      }

      protected void a(Void paramVoid)
      {
        c.this.b();
      }
    }
    .execute(new String[] { paramString });
  }

  public void a(String paramString)
  {
    if (TextUtils.isEmpty(c()))
      d(paramString);
  }

  public boolean a()
  {
    return e() == 0;
  }

  public boolean a(Activity paramActivity)
  {
    com.google.android.gms.common.b localb = com.google.android.gms.common.b.a();
    int i = localb.a(paramActivity);
    if (i != 0)
    {
      if (localb.a(i))
        localb.a(paramActivity, i, 9000).show();
      while (true)
      {
        return false;
        Log.i(a, "This device is not supported.");
        paramActivity.finish();
      }
    }
    return true;
  }

  protected void b()
  {
    itman.robert.c.c.c.a().a("registration_id");
    itman.robert.c.c.c.a().a("appVersion");
  }

  public void b(String paramString)
  {
    if (!TextUtils.isEmpty(c()))
      e(paramString);
  }

  protected String c()
  {
    if (((Integer)itman.robert.c.c.c.a().b("appVersion", Integer.valueOf(-2147483648))).intValue() != itman.robert.c.c.f.a())
    {
      Log.i(a, "App version changed.");
      return "";
    }
    return (String)itman.robert.c.c.c.a().b("registration_id", "");
  }

  protected void c(String paramString)
  {
    int i = itman.robert.c.c.f.a();
    Log.i(a, "Saving gcmRegId on app version " + i);
    itman.robert.c.c.c.a().a("registration_id", paramString);
    itman.robert.c.c.c.a().a("appVersion", Integer.valueOf(i));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.a.c
 * JD-Core Version:    0.6.0
 */