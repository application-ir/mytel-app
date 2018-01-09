package itman.robert.groupchatwebrtc.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import itman.robert.tabLayout.a.j;

public abstract class a extends itman.robert.c.b.a.a
{
  itman.robert.c.c.c o;
  protected itman.robert.c.a.c p;
  protected itman.robert.groupchatwebrtc.d.c q;
  private ProgressDialog r;

  protected void a(int paramInt, Exception paramException, View.OnClickListener paramOnClickListener)
  {
  }

  public void a(String paramString)
  {
    if (this.n != null)
      this.n.b(paramString);
  }

  void d(int paramInt)
  {
    if (this.r == null)
    {
      this.r = new ProgressDialog(this);
      this.r.setIndeterminate(true);
      this.r.setCancelable(false);
      this.r.setCanceledOnTouchOutside(false);
      1 local1 = new DialogInterface.OnKeyListener()
      {
        public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
        {
          return paramInt == 4;
        }
      };
      this.r.setOnKeyListener(local1);
    }
    this.r.setMessage(getString(paramInt));
    this.r.show();
  }

  public void j()
  {
    String str1 = "";
    String str2 = (String)this.o.b("current_room_name", "");
    if (this.o.b() != null)
      str1 = this.o.b().e();
    a(str2);
    a(String.format(getString(a.j.subtitle_text_logged_in_as), new Object[] { str1 }));
  }

  public void k()
  {
    if (this.n != null)
      this.n.b(null);
  }

  void l()
  {
    if (this.r != null)
      this.r.dismiss();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.q = itman.robert.groupchatwebrtc.a.d;
    this.o = itman.robert.c.c.c.a();
    this.p = new itman.robert.c.a.c();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.activities.a
 * JD-Core Version:    0.6.0
 */