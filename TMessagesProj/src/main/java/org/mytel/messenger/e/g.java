package itman.robert.groupchatwebrtc.e;

import android.util.SparseArray;
import com.quickblox.videochat.webrtc.p.b;
import itman.robert.tabLayout.a.j;

public class g
{
  private static final SparseArray<Integer> a = new SparseArray();

  static
  {
    a.put(p.b.d.ordinal(), Integer.valueOf(a.j.opponent_pending));
    a.put(p.b.e.ordinal(), Integer.valueOf(a.j.text_status_connect));
    a.put(p.b.f.ordinal(), Integer.valueOf(a.j.text_status_checking));
    a.put(p.b.g.ordinal(), Integer.valueOf(a.j.text_status_connected));
    a.put(p.b.h.ordinal(), Integer.valueOf(a.j.text_status_disconnected));
    a.put(p.b.i.ordinal(), Integer.valueOf(a.j.opponent_closed));
    a.put(p.b.j.ordinal(), Integer.valueOf(a.j.text_status_disconnected));
    a.put(p.b.k.ordinal(), Integer.valueOf(a.j.text_status_no_answer));
    a.put(p.b.l.ordinal(), Integer.valueOf(a.j.text_status_no_answer));
    a.put(p.b.m.ordinal(), Integer.valueOf(a.j.text_status_rejected));
    a.put(p.b.n.ordinal(), Integer.valueOf(a.j.text_status_hang_up));
  }

  public static Integer a(p.b paramb)
  {
    return (Integer)a.get(paramb.ordinal());
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.g
 * JD-Core Version:    0.6.0
 */