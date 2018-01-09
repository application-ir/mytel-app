package itman.robert.groupchatwebrtc.c;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.a.d;
import android.support.v7.a.f;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.quickblox.b.g;
import com.quickblox.videochat.webrtc.n;
import com.quickblox.videochat.webrtc.p.a;
import itman.robert.groupchatwebrtc.activities.CallActivity.b;
import itman.robert.groupchatwebrtc.e.k;
import itman.robert.groupchatwebrtc.e.m;
import itman.robert.tabLayout.a.e;
import java.util.ArrayList;

public abstract class b extends Fragment
  implements CallActivity.b
{
  private static final String o = b.class.getSimpleName();
  protected itman.robert.groupchatwebrtc.b.b a;
  protected m b;
  protected n c;
  protected ArrayList<com.quickblox.e.b.a> d;
  protected c e;
  protected Chronometer f;
  protected boolean g;
  protected a h;
  protected View i;
  protected TextView j;
  protected TextView k;
  protected com.quickblox.e.b.a l;
  protected Toolbar m;
  protected android.support.v7.a.a n;
  private boolean p;
  private p.a q;
  private ToggleButton r;
  private ImageButton s;
  private boolean t;

  public static b a(b paramb, boolean paramBoolean)
  {
    Log.d(o, "isIncomingCall =  " + paramBoolean);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("conversation_reason", paramBoolean);
    paramb.setArguments(localBundle);
    return paramb;
  }

  private void i()
  {
    b();
    this.j.setText(itman.robert.groupchatwebrtc.e.a.a(this.d));
  }

  private void j()
  {
    this.m = ((Toolbar)getActivity().findViewById(a.e.toolbar_call));
    c();
    ((d)getActivity()).a(this.m);
    this.n = ((d)getActivity()).i().a();
    d();
  }

  private void k()
  {
    if (this.f != null)
    {
      this.f.stop();
      this.g = false;
    }
  }

  private void l()
  {
    this.i.setVisibility(8);
  }

  private void m()
  {
    Log.v("UPDATE_USERS", "super initOpponentsList()");
    this.d = k.a(this.a.a(this.c.d()), this.c.d());
    com.quickblox.e.b.a locala2 = this.a.a(this.c.c());
    com.quickblox.e.b.a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new com.quickblox.e.b.a(this.c.c());
      locala1.b(String.valueOf(this.c.c()));
    }
    if (this.p)
    {
      this.d.add(locala1);
      this.d.remove(g.b().c());
    }
  }

  public void a()
  {
    if (this.c == null)
    {
      Log.d(o, "currentSession = null onCallStopped");
      return;
    }
    k();
    a(false);
  }

  protected void a(View paramView)
  {
    this.r = ((ToggleButton)paramView.findViewById(a.e.toggle_mic));
    this.s = ((ImageButton)paramView.findViewById(a.e.button_hangup_call));
    this.i = paramView.findViewById(a.e.layout_background_outgoing_screen);
    this.j = ((TextView)paramView.findViewById(a.e.text_outgoing_opponents_names));
    this.k = ((TextView)paramView.findViewById(a.e.text_ringing));
    if (this.p)
      l();
  }

  public void a(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    m();
  }

  protected void a(boolean paramBoolean)
  {
    this.r.setEnabled(paramBoolean);
    this.r.setActivated(paramBoolean);
  }

  protected abstract void b();

  protected abstract void c();

  protected abstract void d();

  protected void e()
  {
    this.r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
      {
        b.this.e.c(paramBoolean);
      }
    });
    this.s.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        b.this.a(false);
        b.a(b.this).setEnabled(false);
        b.a(b.this).setActivated(false);
        b.this.e.s();
        Log.d(b.h(), "Call is stopped");
      }
    });
  }

  abstract int f();

  protected void g()
  {
    this.l = g.b().c();
    this.a = itman.robert.groupchatwebrtc.b.b.a(getActivity().getApplicationContext());
    this.b = m.a(getActivity());
    this.c = this.b.a();
    if (getArguments() != null)
      this.p = getArguments().getBoolean("conversation_reason");
    m();
    this.q = this.c.e();
    Log.d(o, "opponents: " + this.d.toString());
    Log.d(o, "currentSession " + this.c.toString());
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      this.e = ((c)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException(paramActivity.toString() + " must implement ConversationFragmentCallbackListener");
  }

  public void onCreate(Bundle paramBundle)
  {
    setHasOptionsMenu(true);
    this.h = new a();
    this.e.a(this);
    super.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(f(), paramViewGroup, false);
    this.b = m.a(getActivity());
    this.c = this.b.a();
    if (this.c == null)
    {
      Log.d(o, "currentSession = null onCreateView");
      return paramLayoutInflater;
    }
    g();
    a(paramLayoutInflater);
    j();
    e();
    i();
    return paramLayoutInflater;
  }

  public void onDestroy()
  {
    this.e.b(this);
    super.onDestroy();
  }

  public void onStart()
  {
    super.onStart();
    if (this.c == null)
      Log.d(o, "currentSession = null onStart");
    do
      return;
    while (this.t);
    if (this.p)
      this.c.b(null);
    while (true)
    {
      this.t = true;
      return;
      this.c.a(null);
    }
  }

  class a extends Handler
  {
    a()
    {
    }

    public void dispatchMessage(Message paramMessage)
    {
      if ((b.this.isAdded()) && (b.this.getActivity() != null))
      {
        super.dispatchMessage(paramMessage);
        return;
      }
      Log.d(b.h(), "Fragment under destroying");
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.c.b
 * JD-Core Version:    0.6.0
 */