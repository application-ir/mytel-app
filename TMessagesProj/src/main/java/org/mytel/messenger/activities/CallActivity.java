package itman.robert.groupchatwebrtc.activities;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickblox.videochat.webrtc.a.a;
import com.quickblox.videochat.webrtc.a.b;
import com.quickblox.videochat.webrtc.a.c;
import com.quickblox.videochat.webrtc.l;
import com.quickblox.videochat.webrtc.n;
import com.quickblox.videochat.webrtc.n.a;
import com.quickblox.videochat.webrtc.p.a;
import com.quickblox.videochat.webrtc.s.b;
import itman.robert.groupchatwebrtc.d.b.b;
import itman.robert.groupchatwebrtc.e.f;
import itman.robert.groupchatwebrtc.e.h;
import itman.robert.groupchatwebrtc.e.i;
import itman.robert.groupchatwebrtc.e.m;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.i;
import itman.robert.tabLayout.a.j;
import itman.robert.tabLayout.a.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.e.a;

public class CallActivity extends a
  implements com.quickblox.videochat.webrtc.a.a, com.quickblox.videochat.webrtc.a.d, com.quickblox.videochat.webrtc.a.e, itman.robert.groupchatwebrtc.c.c, itman.robert.groupchatwebrtc.c.e, b.b
{
  private static final String r = CallActivity.class.getSimpleName();
  private c A;
  private a B;
  private boolean C = true;
  private SharedPreferences D;
  private h E;
  private LinearLayout F;
  private com.quickblox.videochat.webrtc.a G;
  private itman.robert.groupchatwebrtc.d.b H;
  private m I;
  private itman.robert.groupchatwebrtc.b.b J;
  private ArrayList<b> K = new ArrayList();
  private List<Integer> L;
  private boolean M;
  private boolean N;
  private long O;
  private int P;
  private boolean Q;
  private boolean R;
  private boolean S = true;
  private itman.robert.groupchatwebrtc.e.d T;
  private n s;
  private Runnable t;
  private Handler u;
  private boolean v = true;
  private String w;
  private boolean x;
  private com.quickblox.videochat.webrtc.k y;
  private d z;

  private void A()
  {
    this.G = com.quickblox.videochat.webrtc.a.a(this, new a.b()
    {
      public void a(a.a parama)
      {
        if (CallActivity.b(CallActivity.this))
        {
          if (CallActivity.c(CallActivity.this).c() != a.a.c)
            break label68;
          CallActivity.a(CallActivity.this, true);
        }
        while (true)
        {
          if (CallActivity.d(CallActivity.this))
            itman.robert.c.c.d.a("Audio device switched to  " + parama);
          return;
          label68: if (CallActivity.c(CallActivity.this).c() != a.a.a)
            continue;
          CallActivity.a(CallActivity.this, false);
        }
      }
    });
    this.N = p.a.a.equals(this.s.e());
    if (this.N)
    {
      this.G.a(a.a.a);
      Log.d(r, "AppRTCAudioManager.AudioDevice.SPEAKER_PHONE");
    }
    while (true)
    {
      this.G.a(new a.c()
      {
        public void a(boolean paramBoolean1, boolean paramBoolean2)
        {
          CallActivity.b(CallActivity.this, paramBoolean1);
          String str;
          if (CallActivity.b(CallActivity.this))
          {
            StringBuilder localStringBuilder = new StringBuilder().append("Headset ");
            if (paramBoolean1)
            {
              str = "plugged";
              itman.robert.c.c.d.a(str);
            }
          }
          else if (CallActivity.e(CallActivity.this) != null)
          {
            if (!paramBoolean1)
            {
              CallActivity.c(CallActivity.this, false);
              if (!CallActivity.f(CallActivity.this))
                break label122;
              CallActivity.a(CallActivity.this, a.a.c);
            }
          }
          while (true)
          {
            CallActivity.e(CallActivity.this).a(paramBoolean1, CallActivity.f(CallActivity.this));
            return;
            str = "unplugged";
            break;
            label122: CallActivity.a(CallActivity.this, a.a.a);
          }
        }
      });
      this.G.a();
      return;
      this.G.a(a.a.c);
      this.R = true;
      Log.d(r, "AppRTCAudioManager.AudioDevice.EARPIECE");
    }
  }

  private void B()
  {
    this.y = com.quickblox.videochat.webrtc.k.a(this);
    this.y.a(new e.a()
    {
      public void a()
      {
      }

      public void a(int paramInt)
      {
      }

      public void a(String paramString)
      {
        CallActivity.a(CallActivity.this, "Camera error: " + paramString);
      }

      public void b()
      {
      }

      public void b(String paramString)
      {
        CallActivity.a(CallActivity.this, "Camera freezed: " + paramString);
        CallActivity.this.n();
      }
    });
    l.a(Integer.valueOf(6));
    i.a(this.L, this.D, this);
    i.a(this);
    l.a(true);
    this.y.a(this);
    this.y.b();
    this.B = new a(null);
    com.quickblox.b.g.b().a(this.B);
  }

  private void C()
  {
    this.P = (i.a(this.D, this, a.j.pref_disconnect_time_interval_key, a.j.pref_disconnect_time_interval_default_value) * 1000);
    this.O = (System.currentTimeMillis() + this.P);
  }

  private void D()
  {
    if (this.O < System.currentTimeMillis())
      n();
  }

  private void E()
  {
    this.H = new itman.robert.groupchatwebrtc.d.b(getApplication());
  }

  private void F()
  {
    this.u = new Handler(Looper.myLooper());
    this.t = new Runnable()
    {
      public void run()
      {
        if (CallActivity.h(CallActivity.this) == null)
          return;
        n.a locala = CallActivity.h(CallActivity.this).f();
        if (n.a.b.equals(locala))
          CallActivity.this.m();
        while (true)
        {
          itman.robert.c.c.d.b("Call was stopped by timer");
          return;
          CallActivity.i(CallActivity.this).a();
          CallActivity.this.n();
        }
      }
    };
  }

  private n G()
  {
    return this.s;
  }

  private void H()
  {
    Log.d(r, "QBRTCSession in addIncomeCallFragment is " + this.s);
    if (this.s != null)
    {
      itman.robert.groupchatwebrtc.c.d locald = new itman.robert.groupchatwebrtc.c.d();
      itman.robert.groupchatwebrtc.e.c.a(getFragmentManager(), a.e.fragment_container, locald, "income_call_fragment");
      return;
    }
    Log.d(r, "SKIP addIncomeCallFragment method");
  }

  private void I()
  {
    Iterator localIterator = this.K.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a();
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    runOnUiThread(new Runnable(paramBoolean, paramInt)
    {
      public void run()
      {
        if (this.a)
        {
          ((TextView)CallActivity.g(CallActivity.this).findViewById(a.e.notification)).setText(this.b);
          if (CallActivity.g(CallActivity.this).getParent() == null)
            ((ViewGroup)CallActivity.this.findViewById(a.e.fragment_container)).addView(CallActivity.g(CallActivity.this));
          return;
        }
        ((ViewGroup)CallActivity.this.findViewById(a.e.fragment_container)).removeView(CallActivity.g(CallActivity.this));
      }
    });
  }

  private void a(long paramLong)
  {
    this.u.postAtTime(this.t, SystemClock.uptimeMillis() + paramLong);
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, CallActivity.class);
    localIntent.putExtra("conversation_reason", paramBoolean);
    localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private void a(a.a parama)
  {
    new Handler().postDelayed(new Runnable(parama)
    {
      public void run()
      {
        CallActivity.c(CallActivity.this, true);
        CallActivity.c(CallActivity.this).b(this.a);
      }
    }
    , 500L);
  }

  private void a(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    b(paramArrayList);
  }

  private void b(String paramString)
  {
    runOnUiThread(new Runnable(paramString)
    {
      public void run()
      {
        itman.robert.c.c.d.a(this.a);
      }
    });
  }

  private void b(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    Iterator localIterator = this.K.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(paramArrayList);
  }

  private void e(int paramInt)
  {
    runOnUiThread(new Runnable(paramInt)
    {
      public void run()
      {
        itman.robert.c.c.d.a(this.a);
      }
    });
  }

  private void e(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      F();
      w();
      H();
      v();
      return;
    }
    i(paramBoolean);
  }

  private void f(boolean paramBoolean)
  {
    PermissionsActivity.a(this, paramBoolean, itman.robert.groupchatwebrtc.e.b.a);
  }

  private void g(boolean paramBoolean)
  {
    if ((this.s != null) && (this.s.h() != null))
      this.s.h().b(paramBoolean);
  }

  private void h(boolean paramBoolean)
  {
    if ((this.s != null) && (this.s.h() != null))
      this.s.h().a(paramBoolean);
  }

  private void i(boolean paramBoolean)
  {
    if (this.N);
    for (Object localObject = new itman.robert.groupchatwebrtc.c.g(); ; localObject = new itman.robert.groupchatwebrtc.c.a())
    {
      localObject = itman.robert.groupchatwebrtc.c.b.a((itman.robert.groupchatwebrtc.c.b)localObject, paramBoolean);
      itman.robert.groupchatwebrtc.e.c.a(getFragmentManager(), a.e.fragment_container, (Fragment)localObject, "conversation_call_fragment");
      return;
    }
  }

  private void v()
  {
    if (this.T.a(itman.robert.groupchatwebrtc.e.b.a))
      if (this.N)
        break label28;
    label28: for (boolean bool = true; ; bool = false)
    {
      f(bool);
      return;
    }
  }

  private void w()
  {
    ArrayList localArrayList = this.J.a();
    Object localObject = new ArrayList();
    ((ArrayList)localObject).addAll(this.L);
    if (this.x)
      ((ArrayList)localObject).add(this.s.c());
    localArrayList = itman.robert.groupchatwebrtc.e.k.b(localArrayList, (List)localObject);
    if (!localArrayList.isEmpty())
    {
      localObject = new itman.robert.groupchatwebrtc.a();
      this.q.a(localArrayList, new f((itman.robert.groupchatwebrtc.a)localObject)
      {
        public void a(ArrayList<com.quickblox.e.b.a> paramArrayList, Bundle paramBundle)
        {
          paramBundle = CallActivity.a(CallActivity.this);
          itman.robert.groupchatwebrtc.a locala = this.a;
          paramBundle.a(paramArrayList, false, itman.robert.groupchatwebrtc.a.a);
          CallActivity.a(CallActivity.this, paramArrayList);
        }
      });
    }
  }

  private boolean x()
  {
    this.s = this.I.a();
    return this.s != null;
  }

  private void y()
  {
    this.J = itman.robert.groupchatwebrtc.b.b.a(getApplicationContext());
    this.L = this.s.d();
  }

  private void z()
  {
    this.x = getIntent().getExtras().getBoolean("conversation_reason");
  }

  public void a(com.quickblox.videochat.webrtc.a.d paramd)
  {
    if (this.s != null)
      this.s.a(paramd);
  }

  public void a(n paramn)
  {
    Log.d(r, "Session " + paramn.b() + " start stop session");
    if (paramn.equals(G()))
    {
      Log.d(r, "Stop session");
      if (this.G != null)
        this.G.b();
      o();
      this.v = true;
      finish();
    }
  }

  public void a(n paramn, com.quickblox.videochat.webrtc.b.a parama)
  {
  }

  public void a(n paramn, Integer paramInteger)
  {
    if (!paramn.equals(G()))
      return;
    if (this.z != null)
      this.z.a(paramn, paramInteger);
    this.E.a();
  }

  public void a(n paramn, Integer paramInteger, Map<String, String> paramMap)
  {
    if (!paramn.equals(G()))
      return;
    if (this.z != null)
      this.z.a(paramn, paramInteger, paramMap);
    this.E.a();
  }

  public void a(s.b paramb, Integer paramInteger)
  {
  }

  public void a(s.b paramb, Integer paramInteger, com.quickblox.videochat.webrtc.b.b paramb1)
  {
    e(a.j.dlg_signal_error);
  }

  public void a(b paramb)
  {
    this.K.add(paramb);
  }

  public void a(c paramc)
  {
    this.A = paramc;
    p();
  }

  public void a(d paramd)
  {
    this.z = paramd;
  }

  public void b(com.quickblox.videochat.webrtc.a.d paramd)
  {
    if (this.s != null)
      this.s.b(paramd);
  }

  public void b(n paramn)
  {
    Log.d(r, "Session " + paramn.b() + " are income");
    if (G() != null)
    {
      Log.d(r, "Stop new session. Device now is busy");
      paramn.c(null);
    }
  }

  public void b(n paramn, Integer paramInteger)
  {
    a(0L);
  }

  public void b(n paramn, Integer paramInteger, Map<String, String> paramMap)
  {
    if (!paramn.equals(G()))
      return;
    if (this.z != null)
      this.z.b(paramn, paramInteger, paramMap);
    this.E.a();
  }

  public void b(b paramb)
  {
    this.K.remove(paramb);
  }

  public void b(c paramc)
  {
    this.A = null;
  }

  public void b(d paramd)
  {
    this.z = null;
  }

  public void b(boolean paramBoolean)
  {
    StringBuilder localStringBuilder;
    if (this.M)
    {
      localStringBuilder = new StringBuilder().append("Internet connection ");
      if (!paramBoolean)
        break label42;
    }
    label42: for (String str = "available"; ; str = " unavailable")
    {
      b(str);
      return;
    }
  }

  public void c(n paramn)
  {
    if (paramn.equals(G()))
    {
      paramn.b(this);
      I();
    }
  }

  public void c(n paramn, Integer paramInteger)
  {
    if ((this.w != null) && (this.w.equals("wifi_disabled")))
    {
      setResult(1001, new Intent());
      finish();
    }
  }

  public void c(n paramn, Integer paramInteger, Map<String, String> paramMap)
  {
    if (paramn.equals(G()))
    {
      if (paramInteger.equals(paramn.c()))
      {
        n();
        Log.d(r, "initiator hung up the call");
      }
      if (this.z != null)
        this.z.b(paramn, paramInteger);
      paramn = this.J.a(paramInteger);
      if (paramn == null)
        break label119;
    }
    label119: for (paramn = paramn.e(); ; paramn = String.valueOf(paramInteger))
    {
      b("User " + paramn + " " + getString(a.j.text_status_hang_up) + " conversation");
      return;
    }
  }

  public void c(boolean paramBoolean)
  {
    g(paramBoolean);
  }

  public void d(n paramn)
  {
    if (paramn != null)
    {
      Log.d(r, "Init new QBRTCSession");
      this.s = paramn;
      this.s.a(this);
      this.s.a(this);
    }
  }

  public void d(boolean paramBoolean)
  {
    h(paramBoolean);
  }

  public void m()
  {
    if (G() != null)
      G().c(new HashMap());
  }

  public void n()
  {
    this.E.a();
    if (G() != null)
      G().d(new HashMap());
  }

  public void o()
  {
    Log.d(r, "Release current session");
    if (this.s != null)
    {
      this.s.b(this);
      this.s.b(this);
      this.y.b(this);
      this.s = null;
    }
  }

  public void onBackPressed()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.g.activity_main);
    getWindow();
    getWindow().addFlags(6815872);
    z();
    this.I = m.a(this);
    if (!x())
    {
      finish();
      Log.d(r, "finish CallActivity");
      return;
    }
    y();
    d(this.s);
    PreferenceManager.setDefaultValues(this, a.l.preferences, false);
    this.D = PreferenceManager.getDefaultSharedPreferences(this);
    B();
    A();
    E();
    this.E = new h(this, a.i.beep);
    this.F = ((LinearLayout)View.inflate(this, a.g.connection_popup, null));
    this.T = new itman.robert.groupchatwebrtc.e.d(getApplicationContext());
    e(this.x);
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    this.H.b(this);
  }

  protected void onResume()
  {
    super.onResume();
    this.H.a(this);
  }

  protected void onStop()
  {
    super.onStop();
    com.quickblox.b.g.b().b(this.B);
  }

  public void p()
  {
    if (this.x)
      this.A.a(this.Q, this.R);
  }

  public void q()
  {
    if (this.s != null)
    {
      i(true);
      return;
    }
    Log.d(r, "SKIP addConversationFragment method");
  }

  public void r()
  {
    m();
  }

  public void s()
  {
    n();
  }

  public void t()
  {
    if ((this.G.c() == a.a.b) || (this.G.c() == a.a.c))
    {
      this.G.b(a.a.a);
      return;
    }
    this.G.b(a.a.c);
  }

  private class a extends org.b.a.b
  {
    private a()
    {
    }

    public void a(int paramInt)
    {
      Log.i(CallActivity.u(), "reconnectingIn " + paramInt);
      if (!CallActivity.b(CallActivity.this))
        CallActivity.k(CallActivity.this);
    }

    public void a(Exception paramException)
    {
      CallActivity.a(CallActivity.this, a.j.connection_was_lost, true);
      CallActivity.j(CallActivity.this);
    }

    public void b()
    {
      CallActivity.a(CallActivity.this, a.j.connection_was_lost, false);
    }
  }

  public static abstract interface b
  {
    public abstract void a();

    public abstract void a(ArrayList<com.quickblox.e.b.a> paramArrayList);
  }

  public static abstract interface c
  {
    public abstract void a(boolean paramBoolean1, boolean paramBoolean2);
  }

  public static abstract interface d
  {
    public abstract void a(n paramn, Integer paramInteger);

    public abstract void a(n paramn, Integer paramInteger, Map<String, String> paramMap);

    public abstract void b(n paramn, Integer paramInteger);

    public abstract void b(n paramn, Integer paramInteger, Map<String, String> paramMap);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.activities.CallActivity
 * JD-Core Version:    0.6.0
 */