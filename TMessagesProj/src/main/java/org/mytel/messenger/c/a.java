package itman.robert.groupchatwebrtc.c;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.quickblox.c.d.h;
import itman.robert.c.c.e;
import itman.robert.groupchatwebrtc.activities.CallActivity.c;
import itman.robert.tabLayout.a.b;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import itman.robert.tabLayout.a.j;
import java.util.ArrayList;

public class a extends b
  implements CallActivity.c
{
  private static final String o = a.class.getSimpleName();
  private ToggleButton p;
  private TextView q;
  private TextView r;
  private TextView s;
  private boolean t;

  private void i()
  {
    if (this.d.size() < 2)
      this.q.setVisibility(4);
  }

  private String j()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.d);
    localArrayList.remove(0);
    return itman.robert.groupchatwebrtc.e.a.a(localArrayList);
  }

  protected void a(View paramView)
  {
    super.a(paramView);
    this.f = ((Chronometer)paramView.findViewById(a.e.chronometer_timer_audio_call));
    ((ImageView)paramView.findViewById(a.e.image_caller_avatar)).setBackgroundDrawable(e.a(((com.quickblox.e.b.a)this.d.get(0)).b().intValue()));
    this.q = ((TextView)paramView.findViewById(a.e.text_also_on_call));
    i();
    this.r = ((TextView)paramView.findViewById(a.e.text_caller_name));
    this.r.setText(((com.quickblox.e.b.a)this.d.get(0)).e());
    this.s = ((TextView)paramView.findViewById(a.e.text_other_inc_users));
    this.s.setText(j());
    this.p = ((ToggleButton)paramView.findViewById(a.e.toggle_speaker));
    this.p.setVisibility(0);
    a(false);
  }

  public void a(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    super.a(paramArrayList);
    this.r.setText(((com.quickblox.e.b.a)this.d.get(0)).e());
    this.s.setText(j());
  }

  protected void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (!this.t)
      this.p.setEnabled(paramBoolean);
    this.p.setActivated(paramBoolean);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.t = paramBoolean1;
    ToggleButton localToggleButton;
    if (this.g)
    {
      localToggleButton = this.p;
      if (paramBoolean1)
        break label43;
    }
    label43: for (boolean bool = true; ; bool = false)
    {
      localToggleButton.setEnabled(bool);
      if (!paramBoolean1)
        break;
      this.p.setChecked(true);
      return;
    }
    if (paramBoolean2)
    {
      this.p.setChecked(true);
      return;
    }
    this.p.setChecked(false);
  }

  protected void b()
  {
    this.i.setBackgroundColor(android.support.v4.content.a.c(getActivity(), a.b.white));
    this.j.setTextColor(android.support.v4.content.a.c(getActivity(), a.b.text_color_outgoing_opponents_names_audio_call));
    this.k.setTextColor(android.support.v4.content.a.c(getActivity(), a.b.text_color_call_type));
  }

  protected void c()
  {
    this.m.setVisibility(0);
    this.m.setBackgroundColor(android.support.v4.content.a.c(getActivity(), a.b.white));
    this.m.setTitleTextColor(android.support.v4.content.a.c(getActivity(), a.b.toolbar_title_color));
    this.m.setSubtitleTextColor(android.support.v4.content.a.c(getActivity(), a.b.toolbar_subtitle_color));
  }

  protected void d()
  {
    this.n.a((CharSequence)this.l.p().get(0));
    this.n.b(String.format(getString(a.j.subtitle_text_logged_in_as), new Object[] { this.l.e() }));
  }

  protected void e()
  {
    super.e();
    this.p.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        a.this.e.t();
      }
    });
  }

  int f()
  {
    return a.g.fragment_audio_conversation;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public void onStart()
  {
    super.onStart();
    this.e.a(this);
  }

  public void onStop()
  {
    super.onStop();
    this.e.b(this);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.c.a
 * JD-Core Version:    0.6.0
 */