package itman.robert.groupchatwebrtc.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import itman.robert.c.c.e;
import itman.robert.tabLayout.a.d;
import itman.robert.tabLayout.a.e;
import itman.robert.tabLayout.a.g;
import java.util.List;

public class a extends itman.robert.c.b.b.b<com.quickblox.e.b.a>
{
  private a e;

  public a(Context paramContext, List<com.quickblox.e.b.a> paramList)
  {
    super(paramContext, paramList);
  }

  public void a(a parama)
  {
    if (parama != null)
      this.e = parama;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.quickblox.e.b.a locala;
    if (paramView == null)
    {
      paramView = this.a.inflate(a.g.item_opponents_list, null);
      paramViewGroup = new b();
      paramViewGroup.a = ((ImageView)paramView.findViewById(a.e.image_opponent_icon));
      paramViewGroup.b = ((TextView)paramView.findViewById(a.e.opponentsName));
      paramView.setTag(paramViewGroup);
      locala = (com.quickblox.e.b.a)getItem(paramInt);
      if (locala != null)
      {
        paramViewGroup.b.setText(locala.e());
        if (!this.d.contains(locala))
          break label157;
        paramView.setBackgroundResource(itman.robert.tabLayout.a.b.background_color_selected_user_item);
        paramViewGroup.a.setBackgroundDrawable(e.b(itman.robert.c.c.b.b(itman.robert.tabLayout.a.b.icon_background_color_selected_user)));
        paramViewGroup.a.setImageResource(a.d.ic_checkmark);
      }
    }
    while (true)
    {
      paramView.setOnClickListener(new View.OnClickListener(paramInt)
      {
        public void onClick(View paramView)
        {
          a.this.a(this.a);
          a.b(a.this).a(a.a(a.this).size());
        }
      });
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      label157: paramView.setBackgroundResource(itman.robert.tabLayout.a.b.background_color_normal_user_item);
      paramViewGroup.a.setBackgroundDrawable(e.a(locala.b().intValue()));
      paramViewGroup.a.setImageResource(a.d.ic_person);
    }
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }

  public static class b
  {
    ImageView a;
    TextView b;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.a.a
 * JD-Core Version:    0.6.0
 */