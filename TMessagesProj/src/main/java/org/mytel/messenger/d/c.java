package itman.robert.groupchatwebrtc.d;

import android.os.Bundle;
import android.util.Log;
import com.quickblox.c.j.d;
import itman.robert.groupchatwebrtc.e.f;
import itman.robert.groupchatwebrtc.e.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class c
{
  private String a = c.class.getSimpleName();

  private void a(f<com.quickblox.a.a.b> paramf)
  {
    if (j.a())
    {
      if (j.c())
      {
        paramf.a(null, null);
        return;
      }
      paramf.a(null);
      return;
    }
    if (itman.robert.c.c.c.a().c())
    {
      b(paramf);
      return;
    }
    c(paramf);
  }

  private void b(com.quickblox.c.b<com.quickblox.a.a.b> paramb)
  {
    a(itman.robert.c.c.c.a().b(), new com.quickblox.c.b(paramb)
    {
      public void a(com.quickblox.a.a.b paramb, Bundle paramBundle)
      {
        j.b();
        this.a.a(paramb, paramBundle);
      }

      public void a(com.quickblox.c.c.b paramb)
      {
        this.a.a(paramb);
        Log.d(c.a(c.this), "Error creating session with user");
      }
    });
  }

  private void c(com.quickblox.c.b<com.quickblox.a.a.b> paramb)
  {
    a(new com.quickblox.c.b(paramb)
    {
      public void a(com.quickblox.a.a.b paramb, Bundle paramBundle)
      {
        this.a.a(paramb, paramBundle);
      }

      public void a(com.quickblox.c.c.b paramb)
      {
        this.a.a(paramb);
        Log.d(c.a(c.this), "Error creating session");
      }
    });
  }

  public void a(int paramInt, com.quickblox.c.b<Void> paramb)
  {
    com.quickblox.e.a.a(paramInt, paramb);
  }

  public void a(com.quickblox.c.b<com.quickblox.a.a.b> paramb)
  {
    com.quickblox.a.a.a(paramb);
  }

  public void a(com.quickblox.e.b.a parama, com.quickblox.c.b<com.quickblox.a.a.b> paramb)
  {
    com.quickblox.a.a.a(parama, paramb);
  }

  public void a(String paramString, com.quickblox.c.b<ArrayList<com.quickblox.e.b.a>> paramb)
  {
    a(new f(paramString, paramb)
    {
      public void a(com.quickblox.a.a.b paramb, Bundle paramBundle)
      {
        paramb = new d();
        paramBundle = new LinkedList();
        paramBundle.add(this.a);
        com.quickblox.e.a.b(paramBundle, paramb, this.b);
      }
    });
  }

  public void a(Collection<Integer> paramCollection, com.quickblox.c.b<ArrayList<com.quickblox.e.b.a>> paramb)
  {
    a(new f(paramCollection, paramb)
    {
      public void a(com.quickblox.a.a.b paramb, Bundle paramBundle)
      {
        com.quickblox.e.a.a(this.a, null, this.b);
      }
    });
  }

  public void b(com.quickblox.e.b.a parama, com.quickblox.c.b<com.quickblox.e.b.a> paramb)
  {
    c(new com.quickblox.c.b(parama, paramb)
    {
      public void a(com.quickblox.a.a.b paramb, Bundle paramBundle)
      {
        com.quickblox.e.a.b(this.a, this.b);
      }

      public void a(com.quickblox.c.c.b paramb)
      {
        this.b.a(paramb);
      }
    });
  }

  public void c(com.quickblox.e.b.a parama, com.quickblox.c.b<com.quickblox.e.b.a> paramb)
  {
    com.quickblox.e.a.a(parama, paramb);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.d.c
 * JD-Core Version:    0.6.0
 */