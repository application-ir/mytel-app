package itman.robert.groupchatwebrtc.services;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.quickblox.b.r;
import com.quickblox.b.t;
import com.quickblox.b.u;
import com.quickblox.videochat.webrtc.k;
import com.quickblox.videochat.webrtc.l;
import itman.robert.groupchatwebrtc.e.i;
import itman.robert.groupchatwebrtc.e.m;

public class CallService extends Service
{
  private static final String a = CallService.class.getSimpleName();
  private com.quickblox.b.g b;
  private k c;
  private PendingIntent d;
  private int e;
  private com.quickblox.e.b.a f;

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, CallService.class);
    localIntent.putExtra("command_for_service", 2);
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, com.quickblox.e.b.a parama)
  {
    a(paramContext, parama, null);
  }

  public static void a(Context paramContext, com.quickblox.e.b.a parama, PendingIntent paramPendingIntent)
  {
    Intent localIntent = new Intent(paramContext, CallService.class);
    localIntent.putExtra("command_for_service", 1);
    localIntent.putExtra("qb_user", parama);
    localIntent.putExtra("pending_Intent", paramPendingIntent);
    paramContext.startService(localIntent);
  }

  private void a(Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
    {
      this.e = paramIntent.getIntExtra("command_for_service", 0);
      this.d = ((PendingIntent)paramIntent.getParcelableExtra("pending_Intent"));
      this.f = ((com.quickblox.e.b.a)paramIntent.getSerializableExtra("qb_user"));
    }
  }

  private void a(com.quickblox.e.b.a parama)
  {
    this.b.a(parama, new com.quickblox.c.b()
    {
      public void a(com.quickblox.c.c.b paramb)
      {
        Log.d(CallService.a(), "login onError " + paramb.getMessage());
        CallService localCallService = CallService.this;
        if (paramb.getMessage() != null);
        for (paramb = paramb.getMessage(); ; paramb = "Login error")
        {
          CallService.a(localCallService, false, paramb);
          return;
        }
      }

      public void a(com.quickblox.e.b.a parama, Bundle paramBundle)
      {
        Log.d(CallService.a(), "login onSuccess");
        CallService.a(CallService.this);
      }
    });
  }

  private void a(boolean paramBoolean, String paramString)
  {
    if (this.d != null)
      Log.d(a, "sendResultToActivity()");
    Object localObject;
    try
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("login_result", paramBoolean);
      ((Intent)localObject).putExtra("login_error_message", paramString);
      this.d.send(this, 1002, (Intent)localObject);
      return;
    }
    catch (PendingIntent.CanceledException paramString)
    {
      paramString = paramString.getMessage();
      localObject = a;
      if (paramString == null);
    }
    while (true)
    {
      Log.d((String)localObject, paramString);
      return;
      paramString = "Error sending result to activity";
    }
  }

  private void b()
  {
    if (this.e == 1)
      d();
    do
      return;
    while (this.e != 2);
    h();
  }

  private void c()
  {
    if (this.b == null)
    {
      com.quickblox.b.g.a(true);
      com.quickblox.b.g.a(60L);
      this.b = com.quickblox.b.g.b();
    }
  }

  private void d()
  {
    if (!this.b.k())
    {
      a(this.f);
      return;
    }
    a(true, null);
  }

  private void e()
  {
    f();
    g();
    a(true, null);
  }

  private void f()
  {
    itman.robert.groupchatwebrtc.d.a.a(this);
    itman.robert.groupchatwebrtc.d.a.a().a(new org.b.b.g.a()
    {
      public void a()
      {
        Log.d(CallService.a(), "Ping chat server failed");
      }
    });
  }

  private void g()
  {
    this.c = k.a(getApplicationContext());
    this.b.i().a(new com.quickblox.b.b.g()
    {
      public void a(r paramr, boolean paramBoolean)
      {
        if (!paramBoolean)
          CallService.b(CallService.this).a((u)paramr);
      }
    });
    l.a(true);
    i.a(this);
    this.c.a(m.a(this));
    this.c.b();
  }

  private void h()
  {
    i();
  }

  private void i()
  {
    if (this.c != null)
      this.c.e();
    itman.robert.groupchatwebrtc.d.a.b();
    if (this.b != null)
      this.b.a(new com.quickblox.c.b()
      {
        public void a(com.quickblox.c.c.b paramb)
        {
          Log.d(CallService.a(), "logout onError " + paramb.getMessage());
          CallService.c(CallService.this).f();
        }

        public void a(Void paramVoid, Bundle paramBundle)
        {
          CallService.c(CallService.this).f();
        }
      });
    stopSelf();
  }

  public IBinder onBind(Intent paramIntent)
  {
    Log.d(a, "Service onBind)");
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    c();
    Log.d(a, "Service onCreate()");
  }

  public void onDestroy()
  {
    Log.d(a, "Service onDestroy()");
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Log.d(a, "Service started");
    a(paramIntent);
    b();
    return 3;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.services.CallService
 * JD-Core Version:    0.6.0
 */