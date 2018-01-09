package itman.robert.groupchatwebrtc.d;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.quickblox.b.g;
import com.quickblox.b.l;
import java.util.concurrent.TimeUnit;

public class a
{
  private static final long a = TimeUnit.SECONDS.toMillis(30L);
  private static final String b = a.class.getSimpleName();
  private static final BroadcastReceiver c = new BroadcastReceiver()
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      Log.v(a.c(), "Ping Alarm broadcast received");
      if (a.d())
      {
        Log.d(a.c(), "Calling pingServer for connection ");
        paramContext = g.b().j();
        if (paramContext != null)
          paramContext.a(new com.quickblox.c.b()
          {
            public void a(com.quickblox.c.c.b paramb)
            {
              if (a.e() != null)
                a.e().a();
            }

            public void a(Void paramVoid, Bundle paramBundle)
            {
            }
          });
        return;
      }
      Log.d(a.c(), "NOT calling pingServerIfNecessary (disabled) on connection ");
    }
  };
  private static Context d;
  private static PendingIntent e;
  private static AlarmManager f;
  private static boolean g = true;
  private static a h;
  private static org.b.b.g.a i;

  public static a a()
  {
    monitorenter;
    try
    {
      if (h == null)
        h = new a();
      a locala = h;
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void a(Context paramContext)
  {
    d = paramContext;
    paramContext.registerReceiver(c, new IntentFilter("com.quickblox.chat.ping.ACTION"));
    f = (AlarmManager)paramContext.getSystemService("alarm");
    e = PendingIntent.getBroadcast(paramContext, 0, new Intent("com.quickblox.chat.ping.ACTION"), 0);
    f.setInexactRepeating(2, SystemClock.elapsedRealtime() + a, a, e);
  }

  public static void b()
  {
    if (d != null)
      d.unregisterReceiver(c);
    if (f != null)
      f.cancel(e);
    i = null;
    h = null;
  }

  public void a(org.b.b.g.a parama)
  {
    i = parama;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.d.a
 * JD-Core Version:    0.6.0
 */