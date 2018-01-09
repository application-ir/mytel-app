package itman.robert.groupchatwebrtc.c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.a.f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.quickblox.videochat.webrtc.i;
import com.quickblox.videochat.webrtc.n;
import com.quickblox.videochat.webrtc.p.a;
import com.quickblox.videochat.webrtc.p.b;
import com.quickblox.videochat.webrtc.view.QBRTCSurfaceView;
import itman.robert.groupchatwebrtc.a.b.b;
import itman.robert.groupchatwebrtc.activities.CallActivity.d;
import itman.robert.tabLayout.a.b;
import itman.robert.tabLayout.a.c;
import itman.robert.tabLayout.a.d;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.h;
import itman.robert.tabLayout.a.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.List<Litman.robert.groupchatwebrtc.a.b.b;>;
import java.util.Map;
import org.webrtc.VideoRenderer;
import org.webrtc.e.c;
import org.webrtc.n.c;
import org.webrtc.s;

public class g extends b
  implements com.quickblox.videochat.webrtc.a.c, com.quickblox.videochat.webrtc.a.d, itman.robert.groupchatwebrtc.a.b.a, CallActivity.d, Serializable
{
  private com.quickblox.videochat.webrtc.view.a A;
  private TextView B;
  private Map<Integer, com.quickblox.videochat.webrtc.view.a> C;
  private itman.robert.groupchatwebrtc.a.b D;
  private c E;
  private int F;
  private int G;
  private List<com.quickblox.e.b.a> H;
  private boolean I;
  private boolean J;
  private boolean K = true;
  private boolean L;
  private String o = g.class.getSimpleName();
  private ToggleButton p;
  private View q;
  private boolean r = false;
  private LinearLayout s;
  private QBRTCSurfaceView t;
  private QBRTCSurfaceView u;
  private a v = a.a;
  private RecyclerView w;
  private SparseArray<b.b> x;
  private List<b.b> y;
  private boolean z;

  private int a(int paramInt1, int paramInt2, float paramFloat)
  {
    return paramInt1 / paramInt2 - (int)(2.0F * paramFloat) - 2;
  }

  private b.b a(Integer paramInteger)
  {
    b.b localb2 = (b.b)this.x.get(paramInteger.intValue());
    b.b localb1 = localb2;
    if (localb2 == null)
    {
      localb2 = b(paramInteger);
      localb1 = localb2;
      if (localb2 != null)
      {
        this.x.append(paramInteger.intValue(), localb2);
        localb1 = localb2;
      }
    }
    return localb1;
  }

  private void a(int paramInt, QBRTCSurfaceView paramQBRTCSurfaceView, com.quickblox.videochat.webrtc.view.a parama)
  {
    if (paramInt != 0)
      this.G = paramInt;
    a(paramQBRTCSurfaceView, parama, true);
  }

  private void a(int paramInt, String paramString)
  {
    if (this.z)
      this.B.setText(paramString);
    b.b localb;
    do
    {
      return;
      localb = b(Integer.valueOf(paramInt));
    }
    while (localb == null);
    localb.a(paramString);
  }

  private void a(MenuItem paramMenuItem)
  {
    if ((this.c == null) || (this.v == a.b));
    com.quickblox.videochat.webrtc.g localg;
    do
    {
      return;
      localg = this.c.h();
    }
    while (localg == null);
    this.p.setEnabled(false);
    localg.a(new e.c(paramMenuItem)
    {
      public void a(String paramString)
      {
        Log.d(g.b(g.this), "camera switch error " + paramString);
        g.d(g.this).setEnabled(true);
      }

      public void a(boolean paramBoolean)
      {
        Log.d(g.b(g.this), "camera switched, bool = " + paramBoolean);
        g.b(g.this, paramBoolean);
        g.a(g.this, this.a);
        g.c(g.this);
      }
    });
  }

  private void a(QBRTCSurfaceView paramQBRTCSurfaceView, com.quickblox.videochat.webrtc.view.a parama, boolean paramBoolean)
  {
    parama.b(parama.a());
    parama.a(new VideoRenderer(paramQBRTCSurfaceView));
    if (!paramBoolean)
      a(paramQBRTCSurfaceView, this.K);
    parama = this.o;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean);
    for (paramQBRTCSurfaceView = "remote"; ; paramQBRTCSurfaceView = "local")
    {
      Log.d(parama, paramQBRTCSurfaceView + " Track is rendering");
      return;
    }
  }

  private b.b b(Integer paramInteger)
  {
    if (this.y == null)
    {
      Log.d(this.o, "viewHolders == null");
      return null;
    }
    Iterator localIterator = this.y.iterator();
    while (localIterator.hasNext())
    {
      b.b localb = (b.b)localIterator.next();
      Log.d(this.o, "getViewForOpponent holder user id is : " + localb.y());
      if (paramInteger.equals(Integer.valueOf(localb.y())))
        return localb;
    }
    return null;
  }

  private void b(int paramInt)
  {
    int i = this.q.getMeasuredWidth();
    Log.i(this.o, "onGlobalLayout : gridWidth=" + i + " columnsCount= " + paramInt);
    paramInt = a(i, paramInt, getResources().getDimension(a.c.grid_item_divider));
    Log.i(this.o, "onGlobalLayout : cellSize=" + paramInt);
    this.D = new itman.robert.groupchatwebrtc.a.b(getActivity(), this.c, this.d, paramInt, (int)getResources().getDimension(a.c.item_height));
    this.D.a(this);
    this.w.setAdapter(this.D);
  }

  private void b(int paramInt, String paramString)
  {
    b.b localb = b(Integer.valueOf(paramInt));
    if (localb == null)
    {
      Log.d("UPDATE_USERS", "holder == null");
      return;
    }
    Log.d("UPDATE_USERS", "holder != null");
    localb.b(paramString);
  }

  private void b(MenuItem paramMenuItem)
  {
    if (this.K)
    {
      Log.d(this.o, "CameraFront now!");
      paramMenuItem.setIcon(a.d.ic_camera_front);
      return;
    }
    Log.d(this.o, "CameraRear now!");
    paramMenuItem.setIcon(a.d.ic_camera_rear);
  }

  private void b(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    int i = 0;
    while (i < this.H.size())
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        com.quickblox.e.b.a locala = (com.quickblox.e.b.a)localIterator.next();
        if (!locala.equals(this.H.get(i)))
          continue;
        this.H.set(i, locala);
      }
      i += 1;
    }
  }

  private void b(boolean paramBoolean)
  {
    if ((this.c != null) && (this.c.h() != null))
      this.e.d(paramBoolean);
    if ((this.I) && (!this.p.isEnabled()))
      this.p.setEnabled(true);
  }

  private void c(int paramInt)
  {
    Iterator localIterator = o().iterator();
    while (localIterator.hasNext())
      ((b.b)localIterator.next()).A().setVisibility(paramInt);
  }

  private void c(Integer paramInteger)
  {
    b.b localb = b(paramInteger);
    if (localb == null);
    do
      return;
    while (paramInteger.intValue() == this.G);
    localb.A().setBackgroundColor(Color.parseColor("#000000"));
  }

  private void c(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    this.h.postDelayed(new Runnable(paramArrayList)
    {
      public void run()
      {
        Iterator localIterator = this.a.iterator();
        while (localIterator.hasNext())
        {
          com.quickblox.e.b.a locala = (com.quickblox.e.b.a)localIterator.next();
          Log.d("UPDATE_USERS", "foreach, user = " + locala.e());
          g.a(g.this, locala.b().intValue(), locala.e());
        }
      }
    }
    , 2000L);
  }

  private void d(int paramInt)
  {
    Iterator localIterator = this.H.iterator();
    while (localIterator.hasNext())
    {
      com.quickblox.e.b.a locala = (com.quickblox.e.b.a)localIterator.next();
      if (locala.b().intValue() != this.G)
        continue;
      this.D.a(paramInt, locala);
    }
  }

  private void e(int paramInt)
  {
    Object localObject = this.w.getChildAt(paramInt);
    localObject = (b.b)this.w.b((View)localObject);
    this.y.set(paramInt, localObject);
  }

  private void f(int paramInt)
  {
    com.quickblox.videochat.webrtc.view.a locala1 = (com.quickblox.videochat.webrtc.view.a)l().get(Integer.valueOf(paramInt));
    com.quickblox.videochat.webrtc.view.a locala2 = (com.quickblox.videochat.webrtc.view.a)l().get(Integer.valueOf(this.G));
    QBRTCSurfaceView localQBRTCSurfaceView = b(Integer.valueOf(paramInt)).A();
    if (locala2 != null)
    {
      a(0, localQBRTCSurfaceView, locala2);
      Log.d(this.o, "_remoteVideoView enabled");
    }
    if (locala1 != null)
    {
      a(paramInt, this.t, locala1);
      Log.d(this.o, "fullscreen enabled");
    }
  }

  private void g(int paramInt)
  {
    if (this.z);
    b.b localb;
    do
    {
      return;
      localb = a(Integer.valueOf(paramInt));
    }
    while (localb == null);
    getActivity().runOnUiThread(new Runnable(localb)
    {
      public void run()
      {
        this.a.z().setVisibility(8);
      }
    });
  }

  private void i()
  {
    if (this.c != null)
      this.c.a(this);
  }

  private void j()
  {
    if (this.c != null)
      this.c.b(this);
  }

  private void k()
  {
    ViewGroup.LayoutParams localLayoutParams = this.u.getLayoutParams();
    int i = getResources().getDisplayMetrics().widthPixels;
    Log.d(this.o, "screenWidthPx " + i);
    localLayoutParams.width = (int)(i * 0.3D);
    localLayoutParams.height = (localLayoutParams.width / 2 * 3);
    this.u.setLayoutParams(localLayoutParams);
  }

  private Map<Integer, com.quickblox.videochat.webrtc.view.a> l()
  {
    if (this.C == null)
      this.C = new HashMap();
    return this.C;
  }

  private int m()
  {
    return this.d.size() - 1;
  }

  private void n()
  {
    Log.d(this.o, "Camera was switched!");
    if (this.L);
    for (QBRTCSurfaceView localQBRTCSurfaceView = this.t; ; localQBRTCSurfaceView = this.u)
    {
      a(localQBRTCSurfaceView, this.K);
      b(true);
      return;
    }
  }

  private List<b.b> o()
  {
    if (this.y != null)
      return this.y;
    int j = this.w.getChildCount();
    this.y = new ArrayList();
    int i = 0;
    while (i < j)
    {
      Object localObject = this.w.getChildAt(i);
      localObject = (b.b)this.w.b((View)localObject);
      this.y.add(localObject);
      i += 1;
    }
    return (List<b.b>)this.y;
  }

  private void p()
  {
    if (this.D.c().isEmpty());
    int i;
    Object localObject;
    do
    {
      return;
      i = this.D.e(0).intValue();
      localObject = (com.quickblox.videochat.webrtc.view.a)l().get(Integer.valueOf(i));
      if (localObject == null)
      {
        Log.d(this.o, "setAnotherUserToFullScreen opponentVideoTrack == null");
        return;
      }
      a(i, this.t, (com.quickblox.videochat.webrtc.view.a)localObject);
      Log.d(this.o, "fullscreen enabled");
      localObject = b(Integer.valueOf(i));
    }
    while (localObject == null);
    this.D.f(((b.b)localObject).e());
    ((b.b)localObject).A().c();
    Log.d(this.o, "onConnectionClosedForUser opponentsAdapter.removeItem= " + i);
  }

  public void a(int paramInt)
  {
    int i = this.D.e(paramInt).intValue();
    Log.d(this.o, "USer onItemClick= " + i);
    if ((!l().containsKey(Integer.valueOf(i))) || (this.c.a(Integer.valueOf(i)).a().ordinal() == p.b.i.ordinal()))
      return;
    d(paramInt);
    e(paramInt);
    f(i);
  }

  protected void a(View paramView)
  {
    super.a(paramView);
    this.x = new SparseArray(this.d.size());
    this.u = ((QBRTCSurfaceView)paramView.findViewById(a.e.local_video_view));
    k();
    this.u.setZOrderMediaOverlay(true);
    if (!this.z)
    {
      this.w = ((RecyclerView)paramView.findViewById(a.e.grid_opponents));
      this.w.a(new b(getActivity(), a.c.grid_item_divider));
      this.w.setHasFixedSize(true);
      int i = m();
      LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager(getActivity(), 0, false);
      this.w.setLayoutManager(localLinearLayoutManager);
      this.w.setItemAnimator(null);
      this.w.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(i)
      {
        public void onGlobalLayout()
        {
          g.a(g.this, this.a);
          g.a(g.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
      });
    }
    this.B = ((TextView)paramView.findViewById(a.e.connectionStatusLocal));
    this.p = ((ToggleButton)paramView.findViewById(a.e.toggle_camera));
    this.p.setVisibility(0);
    this.s = ((LinearLayout)paramView.findViewById(a.e.element_set_video_buttons));
    a(false);
  }

  public void a(n paramn, com.quickblox.videochat.webrtc.b.a parama)
  {
  }

  public void a(n paramn, com.quickblox.videochat.webrtc.view.a parama)
  {
    Log.d(this.o, "onLocalVideoTrackReceive() run");
    this.A = parama;
    this.L = true;
    if (this.t != null)
      a(this.t, this.A, false);
    if ((!this.z) || (this.t != null));
    do
    {
      return;
      Log.d(this.o, "onLocalVideoTrackReceive init localView");
      this.t = ((QBRTCSurfaceView)this.q.findViewById(a.e.remote_video_view));
      this.t.setOnClickListener(this.E);
    }
    while (this.A == null);
    a(this.t, this.A, false);
  }

  public void a(n paramn, Integer paramInteger)
  {
    g(paramInteger.intValue());
    a(paramInteger.intValue(), getString(a.j.text_status_no_answer));
  }

  public void a(n paramn, Integer paramInteger, Map<String, String> paramMap)
  {
    a(paramInteger.intValue(), getString(a.j.text_status_rejected));
  }

  public void a(b.b paramb, int paramInt)
  {
    Log.i(this.o, "OnBindLastViewHolder position=" + paramInt);
    if (!this.r);
    do
      return;
    while (this.z);
    this.h.postDelayed(new Runnable()
    {
      public void run()
      {
        if (g.e(g.this) != null);
        do
        {
          return;
          g.b(g.this, 8);
          Log.i(g.b(g.this), "OnBindLastViewHolder init localView");
          g.a(g.this, (QBRTCSurfaceView)g.f(g.this).findViewById(a.e.remote_video_view));
          g.e(g.this).setOnClickListener(g.g(g.this));
        }
        while (g.h(g.this) == null);
        Log.d(g.b(g.this), "OnBindLastViewHolder.fillVideoView localVideoTrack");
        g localg = g.this;
        if (g.i(g.this));
        for (QBRTCSurfaceView localQBRTCSurfaceView = g.e(g.this); ; localQBRTCSurfaceView = g.j(g.this))
        {
          g.a(localg, localQBRTCSurfaceView, g.h(g.this), false);
          return;
        }
      }
    }
    , 500L);
  }

  public void a(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    super.a(paramArrayList);
    b(paramArrayList);
    Log.d("UPDATE_USERS", "updateOpponentsList(), newUsers = " + paramArrayList);
    c(paramArrayList);
  }

  protected void a(s params, boolean paramBoolean)
  {
    a(params, paramBoolean, n.c.b);
  }

  protected void a(s params, boolean paramBoolean, n.c paramc)
  {
    Log.i(this.o, "updateVideoView mirror:" + paramBoolean + ", scalingType = " + paramc);
    params.setScalingType(paramc);
    params.setMirror(paramBoolean);
    params.requestLayout();
  }

  protected void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.p.setEnabled(paramBoolean);
    this.p.setActivated(paramBoolean);
  }

  protected void b()
  {
    this.i.setBackgroundColor(android.support.v4.content.a.c(getActivity(), a.b.grey_transparent_50));
    this.j.setTextColor(android.support.v4.content.a.c(getActivity(), a.b.white));
    this.k.setTextColor(android.support.v4.content.a.c(getActivity(), a.b.white));
  }

  public void b(n paramn, Integer paramInteger)
  {
    a(paramInteger.intValue(), getString(a.j.text_status_hang_up));
    Log.d(this.o, "onReceiveHangUpFromUser userId= " + paramInteger);
    if ((!this.z) && (paramInteger.intValue() == this.G))
    {
      Log.d(this.o, "setAnotherUserToFullScreen call userId= " + paramInteger);
      p();
    }
  }

  public void b(n paramn, Integer paramInteger, Map<String, String> paramMap)
  {
    a(paramInteger.intValue(), getString(a.j.accepted));
  }

  protected void c()
  {
    this.m.setVisibility(0);
    this.m.setBackgroundColor(android.support.v4.content.a.c(getActivity(), a.b.black_transparent_50));
    this.m.setTitleTextColor(android.support.v4.content.a.c(getActivity(), a.b.white));
    this.m.setSubtitleTextColor(android.support.v4.content.a.c(getActivity(), a.b.white));
  }

  public void c(n paramn, Integer paramInteger)
  {
    a(paramInteger.intValue(), getString(a.j.text_status_closed));
    if (!this.z)
    {
      Log.d(this.o, "onConnectionClosedForUser videoTrackMap.remove(userId)= " + paramInteger);
      l().remove(paramInteger);
      c(paramInteger);
    }
  }

  protected void d()
  {
    this.n = ((android.support.v7.a.d)getActivity()).i().a();
    this.n.a(false);
  }

  protected void e()
  {
    super.e();
    this.p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
      {
        g localg = g.this;
        if (paramBoolean);
        for (paramCompoundButton = g.a.c; ; paramCompoundButton = g.a.b)
        {
          g.a(localg, paramCompoundButton);
          g.a(g.this, paramBoolean);
          return;
        }
      }
    });
  }

  int f()
  {
    return a.g.fragment_video_conversation;
  }

  protected void g()
  {
    super.g();
    this.E = new c();
    this.F = this.d.size();
    this.H = Collections.synchronizedList(new ArrayList(this.d.size()));
    this.H.addAll(this.d);
    this.f = ((Chronometer)getActivity().findViewById(a.e.timer_chronometer_action_bar));
    if (this.d.size() == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.z = bool;
      this.r = p.a.a.equals(this.c.e());
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(a.h.conversation_fragment, paramMenu);
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.q = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    i();
    return this.q;
  }

  public void onDetach()
  {
    super.onDetach();
    j();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == a.e.camera_switch)
    {
      Log.d("Conversation", "camera_switch");
      a(paramMenuItem);
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }

  public void onPause()
  {
    if (this.v != a.b)
      b(false);
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if (this.v != a.b)
      b(true);
  }

  public void onStart()
  {
    super.onStart();
    if (!this.J)
    {
      this.e.a(this);
      this.e.a(this);
      this.J = true;
    }
  }

  public void onStop()
  {
    super.onStop();
    if (this.I)
    {
      this.e.b(this);
      this.e.b(this);
      this.J = false;
      return;
    }
    Log.d(this.o, "We are in dialing process yet!");
  }

  private static enum a
  {
  }

  class b extends RecyclerView.g
  {
    private int b;

    public b(Context paramInt, int arg3)
    {
      int i;
      this.b = paramInt.getResources().getDimensionPixelSize(i);
    }

    public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
    {
      paramRect.set(this.b, this.b, this.b, this.b);
    }
  }

  class c
    implements View.OnClickListener
  {
    private long b = 0L;

    c()
    {
    }

    private void a()
    {
      if (g.this.n.d())
      {
        b();
        return;
      }
      c();
    }

    private void b()
    {
      g.this.n.c();
      g.j(g.this).setVisibility(4);
      g.l(g.this).setVisibility(8);
      if (!g.m(g.this))
        d();
    }

    private void c()
    {
      g.this.n.b();
      g.j(g.this).setVisibility(0);
      g.l(g.this).setVisibility(0);
      if (!g.m(g.this))
        e();
    }

    private void d()
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)g.a(g.this).getLayoutParams();
      localLayoutParams.addRule(12);
      localLayoutParams.setMargins(0, 0, 0, 0);
      g.a(g.this).setLayoutParams(localLayoutParams);
    }

    private void e()
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)g.a(g.this).getLayoutParams();
      localLayoutParams.addRule(12, 0);
      localLayoutParams.setMargins(0, 0, 0, (int)g.this.getResources().getDimension(a.c.margin_common));
      g.a(g.this).setLayoutParams(localLayoutParams);
    }

    public void onClick(View paramView)
    {
      if (SystemClock.uptimeMillis() - this.b < 1000L);
      do
      {
        return;
        this.b = SystemClock.uptimeMillis();
      }
      while (!g.k(g.this));
      a();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.c.g
 * JD-Core Version:    0.6.0
 */