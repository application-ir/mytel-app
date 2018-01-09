package itman.robert.groupchatwebrtc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.quickblox.b.g;
import com.quickblox.videochat.webrtc.n;
import com.quickblox.videochat.webrtc.p.a;
import itman.robert.groupchatwebrtc.a.a.a;
import itman.robert.groupchatwebrtc.e.e;
import itman.robert.groupchatwebrtc.e.m;
import itman.robert.groupchatwebrtc.services.CallService;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.h;
import itman.robert.tabLayout.a.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class OpponentsActivity extends a
{
  private static final String r = OpponentsActivity.class.getSimpleName();
  private static final long s = TimeUnit.SECONDS.toMillis(10L);
  private itman.robert.groupchatwebrtc.e.d A;
  private itman.robert.groupchatwebrtc.a.a t;
  private ListView u;
  private com.quickblox.e.b.a v;
  private ArrayList<com.quickblox.e.b.a> w;
  private itman.robert.groupchatwebrtc.b.b x;
  private boolean y;
  private m z;

  private boolean a(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    boolean bool1 = paramArrayList.retainAll(this.w);
    boolean bool2 = this.w.retainAll(paramArrayList);
    return (!bool1) && (!bool2);
  }

  private void b(boolean paramBoolean)
  {
    PermissionsActivity.a(this, paramBoolean, itman.robert.groupchatwebrtc.e.b.a);
  }

  private void c(boolean paramBoolean)
  {
    if (this.t.a().size() > 6)
    {
      itman.robert.c.c.d.b(String.format(getString(a.j.error_max_opponents_count), new Object[] { Integer.valueOf(6) }));
      return;
    }
    Log.d(r, "startCall()");
    ArrayList localArrayList = itman.robert.groupchatwebrtc.e.a.a(this.t.a());
    if (paramBoolean);
    for (p.a locala = p.a.a; ; locala = p.a.b)
    {
      n localn = com.quickblox.videochat.webrtc.k.a(getApplicationContext()).a(localArrayList, locala);
      m.a(this).d(localn);
      e.a(localArrayList, this.v.e());
      CallActivity.a(this, false);
      Log.d(r, "conferenceType = " + locala);
      return;
    }
  }

  private void e(int paramInt)
  {
    if (paramInt > 1);
    for (int i = a.j.tile_many_users_selected; ; i = a.j.title_one_user_selected)
    {
      a(String.format(getString(i), new Object[] { Integer.valueOf(paramInt) }));
      return;
    }
  }

  private void f(int paramInt)
  {
    if (paramInt < 1)
      j();
    while (true)
    {
      invalidateOptionsMenu();
      return;
      k();
      e(paramInt);
    }
  }

  private void n()
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
      this.y = localBundle.getBoolean("isRunForCall");
    this.v = this.o.b();
    this.x = itman.robert.groupchatwebrtc.b.b.a(getApplicationContext());
    this.z = m.a(getApplicationContext());
  }

  private void o()
  {
    d(a.j.dlg_loading_opponents);
    String str = (String)itman.robert.c.c.c.a().b("current_room_name");
    this.q.a(str, new com.quickblox.c.b()
    {
      public void a(com.quickblox.c.c.b paramb)
      {
        OpponentsActivity.this.l();
        OpponentsActivity.this.a(a.j.loading_users_error, paramb, new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            OpponentsActivity.c(OpponentsActivity.this);
          }
        });
      }

      public void a(ArrayList<com.quickblox.e.b.a> paramArrayList, Bundle paramBundle)
      {
        new itman.robert.groupchatwebrtc.a();
        OpponentsActivity.this.l();
        OpponentsActivity.a(OpponentsActivity.this).a(paramArrayList, true, itman.robert.groupchatwebrtc.a.a);
        OpponentsActivity.b(OpponentsActivity.this);
      }
    });
  }

  private void p()
  {
    this.u = ((ListView)findViewById(a.e.list_opponents));
  }

  private void q()
  {
    if (this.w != null)
    {
      ArrayList localArrayList = this.x.a();
      localArrayList.remove(this.o.b());
      if (a(localArrayList))
        return;
    }
    r();
  }

  private void r()
  {
    this.w = this.x.a();
    Log.d(r, "proceedInitUsersList currentOpponentsList= " + this.w);
    this.w.remove(this.o.b());
    this.t = new itman.robert.groupchatwebrtc.a.a(this, this.w);
    this.t.a(new a.a()
    {
      public void a(int paramInt)
      {
        OpponentsActivity.a(OpponentsActivity.this, paramInt);
      }
    });
    this.u.setAdapter(this.t);
  }

  private boolean s()
  {
    if (!g.b().k())
    {
      itman.robert.c.c.d.a(a.j.dlg_signal_error);
      t();
      return false;
    }
    return true;
  }

  private void t()
  {
    if (this.o.c())
      CallService.a(this, this.o.b());
  }

  private void u()
  {
    SettingsActivity.a(this);
  }

  private void v()
  {
    x();
    w();
    y();
    z();
  }

  private void w()
  {
    CallService.a(this);
  }

  private void x()
  {
    if (this.p.a(this))
    {
      Log.d(r, "unsubscribeFromPushes()");
      this.p.b("");
    }
  }

  private void y()
  {
    itman.robert.groupchatwebrtc.e.k.a(getApplicationContext());
    this.q.a(this.v.b().intValue(), new com.quickblox.c.b()
    {
      public void a(com.quickblox.c.c.b paramb)
      {
        Log.e(OpponentsActivity.m(), "Current user wasn't deleted from QB " + paramb);
      }

      public void a(Void paramVoid, Bundle paramBundle)
      {
        Log.d(OpponentsActivity.m(), "Current user was deleted from QB");
      }
    });
  }

  private void z()
  {
    b.a(this);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.g.activity_opponents);
    n();
    j();
    p();
    o();
    if ((this.y) && (this.z.a() != null))
      CallActivity.a(this, true);
    this.A = new itman.robert.groupchatwebrtc.e.d(getApplicationContext());
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if ((this.t != null) && (!this.t.a().isEmpty()))
      getMenuInflater().inflate(a.h.activity_selected_opponents, paramMenu);
    while (true)
    {
      return super.onCreateOptionsMenu(paramMenu);
      getMenuInflater().inflate(a.h.activity_opponents, paramMenu);
    }
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (paramIntent.getExtras() != null)
    {
      this.y = paramIntent.getExtras().getBoolean("isRunForCall");
      if ((this.y) && (this.z.a() != null))
        CallActivity.a(this, true);
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == a.e.update_opponents_list)
      o();
    while (true)
    {
      return true;
      if (i == a.e.settings)
      {
        u();
        return true;
      }
      if (i == a.e.log_out)
      {
        v();
        return true;
      }
      if (i == a.e.start_video_call)
      {
        if (s())
          c(true);
        if (!this.A.a(itman.robert.groupchatwebrtc.e.b.a))
          continue;
        b(false);
        return true;
      }
      if (i != a.e.start_audio_call)
        break;
      if (s())
        c(false);
      if (!this.A.a(new String[] { itman.robert.groupchatwebrtc.e.b.a[1] }))
        continue;
      b(true);
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }

  protected void onResume()
  {
    super.onResume();
    q();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.activities.OpponentsActivity
 * JD-Core Version:    0.6.0
 */