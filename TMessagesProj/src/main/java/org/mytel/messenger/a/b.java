package itman.robert.groupchatwebrtc.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.quickblox.e.b.a;
import com.quickblox.videochat.webrtc.i;
import com.quickblox.videochat.webrtc.n;
import com.quickblox.videochat.webrtc.p.b;
import com.quickblox.videochat.webrtc.view.QBRTCSurfaceView;
import itman.robert.groupchatwebrtc.e.g;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import java.util.List;

public class b extends RecyclerView.a<b>
{
  private static final String a = b.class.getSimpleName();
  private final int b;
  private final int c;
  private Context d;
  private n e;
  private List<a> f;
  private LayoutInflater g;
  private a h;

  public b(Context paramContext, n paramn, List<a> paramList, int paramInt1, int paramInt2)
  {
    this.d = paramContext;
    this.e = paramn;
    this.f = paramList;
    this.g = LayoutInflater.from(paramContext);
    this.c = paramInt1;
    this.b = paramInt2;
    Log.d(a, "item width=" + this.c + ", item height=" + this.b);
  }

  public int a()
  {
    return this.f.size();
  }

  public void a(int paramInt, a parama)
  {
    this.f.set(paramInt, parama);
    c(paramInt);
  }

  public void a(a parama)
  {
    this.h = parama;
  }

  public void a(b paramb, int paramInt)
  {
    Object localObject = (a)this.f.get(paramInt);
    int i = ((a)localObject).b().intValue();
    paramb.l.setText(((a)localObject).e());
    paramb.c(i);
    localObject = this.e.a(Integer.valueOf(i)).a();
    Log.d(a, "state ordinal= " + ((p.b)localObject).ordinal());
    paramb.a(this.d.getResources().getString(g.a((p.b)localObject).intValue()));
    if (paramInt == this.f.size() - 1)
      this.h.a(paramb, paramInt);
  }

  public long b(int paramInt)
  {
    return paramInt;
  }

  public b c(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup = this.g.inflate(a.g.list_item_opponent_from_call, null);
    paramViewGroup.findViewById(a.e.innerLayout).setLayoutParams(new FrameLayout.LayoutParams(this.c, this.b));
    paramViewGroup = new b(paramViewGroup);
    b.a(paramViewGroup, new b.b.a()
    {
      public void a(int paramInt)
      {
        b.a(b.this).a(paramInt);
      }
    });
    paramViewGroup.b(true);
    return paramViewGroup;
  }

  public List<a> c()
  {
    return this.f;
  }

  public Integer e(int paramInt)
  {
    return ((a)this.f.get(paramInt)).b();
  }

  public void f(int paramInt)
  {
    this.f.remove(paramInt);
    d(paramInt);
    a(paramInt, this.f.size());
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);

    public abstract void a(b.b paramb, int paramInt);
  }

  public static class b extends RecyclerView.v
    implements View.OnClickListener
  {
    TextView l;
    TextView m;
    QBRTCSurfaceView n;
    ProgressBar o;
    private int p;
    private a q;

    public b(View paramView)
    {
      super();
      paramView.setOnClickListener(this);
      this.l = ((TextView)paramView.findViewById(a.e.opponentName));
      this.m = ((TextView)paramView.findViewById(a.e.connectionStatus));
      this.n = ((QBRTCSurfaceView)paramView.findViewById(a.e.opponentView));
      this.o = ((ProgressBar)paramView.findViewById(a.e.progress_bar_adapter));
    }

    private void a(a parama)
    {
      this.q = parama;
    }

    public QBRTCSurfaceView A()
    {
      return this.n;
    }

    public void a(String paramString)
    {
      this.m.setText(paramString);
    }

    public void b(String paramString)
    {
      this.l.setText(paramString);
    }

    public void b(boolean paramBoolean)
    {
      Log.d("OpponentsAdapter", "show? " + paramBoolean);
      QBRTCSurfaceView localQBRTCSurfaceView = this.n;
      if (paramBoolean);
      for (int i = 0; ; i = 8)
      {
        localQBRTCSurfaceView.setVisibility(i);
        return;
      }
    }

    public void c(int paramInt)
    {
      this.p = paramInt;
    }

    public void onClick(View paramView)
    {
      this.q.a(e());
    }

    public int y()
    {
      return this.p;
    }

    public ProgressBar z()
    {
      return this.o;
    }

    public static abstract interface a
    {
      public abstract void a(int paramInt);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.a.b
 * JD-Core Version:    0.6.0
 */