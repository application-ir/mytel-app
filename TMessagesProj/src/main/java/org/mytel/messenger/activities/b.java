package itman.robert.groupchatwebrtc.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import com.quickblox.c.d.h;
import com.quickblox.c.d.j;
import itman.robert.c.c.d;
import itman.robert.groupchatwebrtc.e.f;
import itman.robert.groupchatwebrtc.e.k;
import itman.robert.groupchatwebrtc.e.l;
import itman.robert.groupchatwebrtc.services.CallService;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.h;
import itman.robert.tabLayout.a.j;

public class b extends a
{
  private String r = b.class.getSimpleName();
  private EditText s;
  private EditText t;
  private com.quickblox.e.b.a u;

  private com.quickblox.e.b.a a(String paramString1, String paramString2)
  {
    h localh = null;
    Object localObject = localh;
    if (!TextUtils.isEmpty(paramString1))
    {
      localObject = localh;
      if (!TextUtils.isEmpty(paramString2))
      {
        localh = new h();
        localh.add(paramString2);
        localObject = new com.quickblox.e.b.a();
        ((com.quickblox.e.b.a)localObject).b(paramString1);
        ((com.quickblox.e.b.a)localObject).d(s());
        ((com.quickblox.e.b.a)localObject).a("x6Bt0VDy5");
        ((com.quickblox.e.b.a)localObject).a(localh);
      }
    }
    return (com.quickblox.e.b.a)localObject;
  }

  public static void a(Context paramContext)
  {
    paramContext.startActivity(new Intent(paramContext, b.class));
  }

  private void a(com.quickblox.e.b.a parama)
  {
    d(a.j.dlg_creating_new_user);
    this.q.b(parama, new com.quickblox.c.b(parama)
    {
      public void a(com.quickblox.c.c.b paramb)
      {
        if (paramb.a() == 422)
        {
          b.a(b.this, this.a, true);
          return;
        }
        b.this.l();
        d.b(a.j.sign_up_error);
      }

      public void a(com.quickblox.e.b.a parama, Bundle paramBundle)
      {
        b.a(b.this, parama);
      }
    });
  }

  private void a(com.quickblox.e.b.a parama, boolean paramBoolean)
  {
    this.q.c(parama, new f(paramBoolean)
    {
      public void a(com.quickblox.c.c.b paramb)
      {
        b.this.l();
        d.b(a.j.sign_up_error);
      }

      public void a(com.quickblox.e.b.a parama, Bundle paramBundle)
      {
        if (this.a)
        {
          b.b(b.this, parama);
          return;
        }
        b.a(b.this);
      }
    });
  }

  private void b(com.quickblox.e.b.a parama)
  {
    parama.a("x6Bt0VDy5");
    this.u = parama;
    e(parama);
  }

  private void c(com.quickblox.e.b.a parama)
  {
    itman.robert.c.c.c localc = itman.robert.c.c.c.a();
    localc.a("current_room_name", parama.p().get(0));
    localc.a(parama);
  }

  private void d(com.quickblox.e.b.a parama)
  {
    this.q.a(parama.b().intValue(), new com.quickblox.c.b()
    {
      public void a(com.quickblox.c.c.b paramb)
      {
        b.this.l();
        d.b(a.j.sign_up_error);
      }

      public void a(Void paramVoid, Bundle paramBundle)
      {
        k.a(b.this.getApplicationContext());
        b.c(b.this, b.b(b.this));
      }
    });
  }

  private void e(com.quickblox.e.b.a parama)
  {
    CallService.a(this, parama, createPendingResult(1002, new Intent(this, CallService.class), 0));
  }

  private void m()
  {
    c(a.j.title_login_activity);
    this.s = ((EditText)findViewById(a.e.user_name));
    this.s.addTextChangedListener(new a(this.s, null));
    this.t = ((EditText)findViewById(a.e.chat_room_name));
    this.t.addTextChangedListener(new a(this.t, null));
  }

  private boolean n()
  {
    return l.b(this, this.t);
  }

  private boolean o()
  {
    return l.a(this, this.s);
  }

  private void p()
  {
    itman.robert.c.c.a.a(this.s);
    itman.robert.c.c.a.a(this.t);
  }

  private com.quickblox.e.b.a q()
  {
    return a(String.valueOf(this.s.getText()), String.valueOf(this.t.getText()));
  }

  private void r()
  {
    if (this.p.a(this))
    {
      Log.d(this.r, "subscribeToPushes()");
      this.p.a("");
    }
  }

  private String s()
  {
    return j.a(this);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 1002)
    {
      l();
      boolean bool = paramIntent.getBooleanExtra("login_result", false);
      paramIntent = paramIntent.getStringExtra("login_error_message");
      if (bool)
      {
        c(this.u);
        a(this.u, false);
      }
    }
    else
    {
      return;
    }
    d.b(getString(a.j.login_chat_login_error) + paramIntent);
    this.s.setText(this.u.e());
    this.t.setText((CharSequence)this.u.p().get(0));
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.g.activity_login);
    m();
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(a.h.activity_login, paramMenu);
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == a.e.menu_login_user_done)
    {
      if ((o()) && (n()))
      {
        p();
        a(q());
      }
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }

  private class a
    implements TextWatcher
  {
    private EditText b;

    private a(EditText arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public void afterTextChanged(Editable paramEditable)
    {
    }

    public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      this.b.setError(null);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.activities.b
 * JD-Core Version:    0.6.0
 */