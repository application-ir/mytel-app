package itman.robert.groupchatwebrtc.d;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class b
{
  private final ConnectivityManager a;
  private Set<b> b = new CopyOnWriteArraySet();

  public b(Application paramApplication)
  {
    this.a = ((ConnectivityManager)paramApplication.getSystemService("connectivity"));
    IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    paramApplication.registerReceiver(new a(null), localIntentFilter);
  }

  public void a(b paramb)
  {
    this.b.add(paramb);
    paramb.b(a());
  }

  public boolean a()
  {
    NetworkInfo localNetworkInfo = this.a.getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }

  public void b(b paramb)
  {
    this.b.remove(paramb);
  }

  private class a extends BroadcastReceiver
  {
    private a()
    {
    }

    public void onReceive(Context paramContext, Intent paramIntent)
    {
      boolean bool = b.this.a();
      paramContext = b.a(b.this).iterator();
      while (paramContext.hasNext())
        ((b.b)paramContext.next()).b(bool);
    }
  }

  public static abstract interface b
  {
    public abstract void b(boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.d.b
 * JD-Core Version:    0.6.0
 */