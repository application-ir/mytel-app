package itman.robert.tabLayout.b;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout.LayoutParams;
import itman.robert.tabLayout.widget.MsgView;

public class b
{
  public static void a(MsgView paramMsgView, int paramInt)
  {
    if (paramMsgView == null)
      return;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramMsgView.getLayoutParams();
    DisplayMetrics localDisplayMetrics = paramMsgView.getResources().getDisplayMetrics();
    paramMsgView.setVisibility(0);
    if (paramInt <= 0)
    {
      paramMsgView.setStrokeWidth(0);
      paramMsgView.setText("");
      localLayoutParams.width = (int)(localDisplayMetrics.density * 5.0F);
      localLayoutParams.height = (int)(localDisplayMetrics.density * 5.0F);
      paramMsgView.setLayoutParams(localLayoutParams);
      return;
    }
    localLayoutParams.height = (int)(localDisplayMetrics.density * 18.0F);
    if ((paramInt > 0) && (paramInt < 10))
    {
      localLayoutParams.width = (int)(localDisplayMetrics.density * 18.0F);
      paramMsgView.setText(paramInt + "");
    }
    while (true)
    {
      paramMsgView.setLayoutParams(localLayoutParams);
      return;
      if ((paramInt > 9) && (paramInt < 100))
      {
        localLayoutParams.width = -2;
        paramMsgView.setPadding((int)(localDisplayMetrics.density * 6.0F), 0, (int)(localDisplayMetrics.density * 6.0F), 0);
        paramMsgView.setText(paramInt + "");
        continue;
      }
      localLayoutParams.width = -2;
      paramMsgView.setPadding((int)(localDisplayMetrics.density * 6.0F), 0, (int)(localDisplayMetrics.density * 6.0F), 0);
      paramMsgView.setText("99+");
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.tabLayout.b.b
 * JD-Core Version:    0.6.0
 */