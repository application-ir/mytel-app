package itman.robert.groupchatwebrtc.e;

import android.content.Context;
import android.util.Log;
import com.quickblox.videochat.webrtc.a.b;
import com.quickblox.videochat.webrtc.n;
import itman.robert.groupchatwebrtc.activities.CallActivity;

public class m extends b
{
  private static final String a = m.class.getSimpleName();
  private static m b;
  private static n d;
  private Context c;

  private m(Context paramContext)
  {
    this.c = paramContext;
  }

  public static m a(Context paramContext)
  {
    if (b == null)
      b = new m(paramContext);
    return b;
  }

  public n a()
  {
    return d;
  }

  public void a(n paramn)
  {
    Log.d(a, "onSessionClosed WebRtcSessionManager");
    if (paramn.equals(a()))
      d(null);
  }

  public void b(n paramn)
  {
    Log.d(a, "onReceiveNewSession to WebRtcSessionManager");
    if (d == null)
    {
      d(paramn);
      CallActivity.a(this.c, true);
    }
  }

  public void d(n paramn)
  {
    d = paramn;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.m
 * JD-Core Version:    0.6.0
 */