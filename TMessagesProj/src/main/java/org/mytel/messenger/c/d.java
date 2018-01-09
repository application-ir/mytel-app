package itman.robert.groupchatwebrtc.c;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.quickblox.b.g;
import com.quickblox.videochat.webrtc.n;
import com.quickblox.videochat.webrtc.p.a;
import itman.robert.groupchatwebrtc.b.b;
import itman.robert.groupchatwebrtc.e.a;
import itman.robert.groupchatwebrtc.e.h;
import itman.robert.groupchatwebrtc.e.k;
import itman.robert.groupchatwebrtc.e.m;
import itman.robert.tabLayout.a.d;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class d extends Fragment
  implements View.OnClickListener, Serializable
{
  private static final String a = d.class.getSimpleName();
  private static final long b = TimeUnit.SECONDS.toMillis(2L);
  private TextView c;
  private ImageButton d;
  private ImageButton e;
  private List<Integer> f;
  private Vibrator g;
  private p.a h;
  private long i = 0L;
  private h j;
  private e k;
  private n l;
  private b m;
  private TextView n;

  private Drawable a(int paramInt)
  {
    return itman.robert.c.c.e.a(paramInt);
  }

  private void a(View paramView)
  {
    this.c = ((TextView)paramView.findViewById(a.e.call_type));
    ((ImageView)paramView.findViewById(a.e.image_caller_avatar)).setBackgroundDrawable(a(this.l.c().intValue()));
    ((TextView)paramView.findViewById(a.e.text_caller_name)).setText(k.a(this.m.a(this.l.c()), this.l.c()));
    ((TextView)paramView.findViewById(a.e.text_other_inc_users)).setText(g());
    this.n = ((TextView)paramView.findViewById(a.e.text_also_on_call));
    e();
    this.d = ((ImageButton)paramView.findViewById(a.e.image_button_reject_call));
    this.e = ((ImageButton)paramView.findViewById(a.e.image_button_accept_call));
  }

  private void a(p.a parama)
  {
    int i2;
    if (parama == p.a.a)
    {
      i1 = 1;
      parama = this.c;
      if (i1 == 0)
        break label51;
      i2 = a.j.text_incoming_video_call;
      label22: parama.setText(i2);
      parama = this.e;
      if (i1 == 0)
        break label58;
    }
    label51: label58: for (int i1 = a.d.ic_video_white; ; i1 = a.d.ic_call)
    {
      parama.setImageResource(i1);
      return;
      i1 = 0;
      break;
      i2 = a.j.text_incoming_audio_call;
      break label22;
    }
  }

  private void a(boolean paramBoolean)
  {
    this.e.setEnabled(paramBoolean);
    this.d.setEnabled(paramBoolean);
  }

  private void c()
  {
    this.l = m.a(getActivity()).a();
    this.m = b.a(getActivity().getApplicationContext());
    if (this.l != null)
    {
      this.f = this.l.d();
      this.h = this.l.e();
      Log.d(a, this.h.toString() + "From onCreateView()");
    }
  }

  private void d()
  {
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
  }

  private void e()
  {
    if (this.f.size() < 2)
      this.n.setVisibility(4);
  }

  private void f()
  {
    Log.d(a, "stopCallNotification()");
    if (this.j != null)
      this.j.a();
    if (this.g != null)
      this.g.cancel();
  }

  private String g()
  {
    ArrayList localArrayList1 = this.m.a(this.f);
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.addAll(k.a(localArrayList1, this.f));
    localArrayList2.remove(g.b().c());
    Log.d(a, "opponentsIds = " + this.f);
    return a.a(localArrayList2);
  }

  private void h()
  {
    a(false);
    f();
    this.k.q();
    Log.d(a, "Call is started");
  }

  private void i()
  {
    a(false);
    f();
    this.k.r();
    Log.d(a, "Call is rejected");
  }

  public void a()
  {
    ((Toolbar)getActivity().findViewById(a.e.toolbar_call)).setVisibility(8);
  }

  public void b()
  {
    Log.d(a, "startCallNotification()");
    this.j.a(false);
    this.g = ((Vibrator)getActivity().getSystemService("vibrator"));
    if (this.g.hasVibrator())
      this.g.vibrate(new long[] { 0L, 1000L, 1000L }, 1);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      this.k = ((e)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException(paramActivity.toString() + " must implement OnCallEventsController");
  }

  public void onClick(View paramView)
  {
    if (SystemClock.uptimeMillis() - this.i < b);
    int i1;
    do
    {
      return;
      this.i = SystemClock.uptimeMillis();
      i1 = paramView.getId();
      if (i1 != a.e.image_button_reject_call)
        continue;
      i();
      return;
    }
    while (i1 != a.e.image_button_accept_call);
    h();
  }

  public void onCreate(Bundle paramBundle)
  {
    setRetainInstance(true);
    Log.d(a, "onCreate() from IncomeCallFragment");
    super.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.g.fragment_income_call, paramViewGroup, false);
    c();
    a();
    if (this.l != null)
    {
      a(paramLayoutInflater);
      a(this.h);
      d();
    }
    this.j = new h(getActivity());
    return paramLayoutInflater;
  }

  public void onStart()
  {
    super.onStart();
    b();
  }

  public void onStop()
  {
    f();
    super.onStop();
    Log.d(a, "onStop() from IncomeCallFragment");
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.c.d
 * JD-Core Version:    0.6.0
 */