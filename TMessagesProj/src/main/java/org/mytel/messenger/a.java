package itman.robert.groupchatwebrtc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.quickblox.b.g;
import com.quickblox.videochat.webrtc.k;
import com.quickblox.videochat.webrtc.p.a;
import itman.robert.groupchatwebrtc.activities.CallActivity;
import itman.robert.groupchatwebrtc.activities.PermissionsActivity;
import itman.robert.groupchatwebrtc.e.d;
import itman.robert.groupchatwebrtc.e.e;
import itman.robert.groupchatwebrtc.e.m;
import itman.robert.groupchatwebrtc.services.CallService;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class a
{
  public static ConcurrentHashMap<String, String> a;
  public static itman.robert.groupchatwebrtc.d.c d;
  itman.robert.c.c.c b;
  protected itman.robert.c.a.c c;
  private String e;
  private String f;
  private String g;
  private Activity h;
  private d i;

  public a()
  {
  }

  public a(Activity paramActivity, String paramString1, String paramString2, String paramString3, itman.robert.groupchatwebrtc.d.c paramc)
  {
    this.g = paramString1;
    this.h = paramActivity;
    this.e = paramString2;
    this.f = paramString3;
    d = paramc;
    this.b = itman.robert.c.c.c.a();
    this.c = new itman.robert.c.a.c();
  }

  public a(Activity paramActivity, String paramString1, String paramString2, String paramString3, itman.robert.groupchatwebrtc.d.c paramc, ConcurrentHashMap<String, String> paramConcurrentHashMap)
  {
    a = paramConcurrentHashMap;
    this.g = paramString1;
    this.h = paramActivity;
    this.e = paramString2;
    this.f = paramString3;
    d = paramc;
    this.b = itman.robert.c.c.c.a();
    this.c = new itman.robert.c.a.c();
  }

  private void a(boolean paramBoolean)
  {
    PermissionsActivity.a(this.h, paramBoolean, itman.robert.groupchatwebrtc.e.b.a);
  }

  private void a(boolean paramBoolean, com.quickblox.e.b.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(parama);
    localArrayList = itman.robert.groupchatwebrtc.e.a.a(localArrayList);
    if (paramBoolean);
    for (parama = p.a.a; ; parama = p.a.b)
    {
      parama = k.a(this.h).a(localArrayList, parama);
      m.a(this.h).d(parama);
      e.a(localArrayList, this.b.b().e());
      CallActivity.a(this.h, false);
      return;
    }
  }

  private void b()
  {
    String str = (String)itman.robert.c.c.c.a().b("current_room_name");
    d.a(str, new com.quickblox.c.b()
    {
      public void a(com.quickblox.c.c.b paramb)
      {
      }

      public void a(ArrayList<com.quickblox.e.b.a> paramArrayList, Bundle paramBundle)
      {
        itman.robert.groupchatwebrtc.b.b.a(a.a(a.this)).a(paramArrayList, true, a.a);
      }
    });
  }

  private boolean c()
  {
    if (!g.b().k())
    {
      d();
      return false;
    }
    return true;
  }

  private void d()
  {
    if (this.b.c())
    {
      com.quickblox.e.b.a locala = this.b.b();
      CallService.a(this.h, locala);
    }
  }

  public com.quickblox.e.b.a a(String paramString)
  {
    ArrayList localArrayList = itman.robert.groupchatwebrtc.b.b.a(this.h).a();
    int j = 0;
    while (j < localArrayList.size())
    {
      if (((com.quickblox.e.b.a)localArrayList.get(j)).g().equals(paramString))
        return (com.quickblox.e.b.a)localArrayList.get(j);
      j += 1;
    }
    return null;
  }

  public void a()
  {
    Object localObject = new Intent(this.h, CallService.class);
    localObject = this.h.createPendingResult(1002, (Intent)localObject, 0);
    itman.robert.c.c.c localc = itman.robert.c.c.c.a();
    CallService.a(this.h, localc.b(), (PendingIntent)localObject);
    b();
  }

  public void a(com.quickblox.e.b.a parama)
  {
    this.i = new d(this.h);
    if (c())
      a(true, parama);
    if (this.i.a(itman.robert.groupchatwebrtc.e.b.a))
      a(false);
  }

  public void b(com.quickblox.e.b.a parama)
  {
    this.i = new d(this.h);
    if (c())
      a(false, parama);
    if (this.i.a(new String[] { itman.robert.groupchatwebrtc.e.b.a[1] }))
      a(true);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.a
 * JD-Core Version:    0.6.0
 */