package itman.robert.groupchatwebrtc.e;

import com.quickblox.d.b.c;
import itman.robert.tabLayout.a.j;
import java.util.ArrayList;

public class e
{
  public static void a(ArrayList<Integer> paramArrayList, String paramString)
  {
    paramString = String.format(String.valueOf(a.j.text_push_notification_message), new Object[] { paramString });
    c localc = new c();
    localc.a(com.quickblox.d.b.h.a);
    localc.a(com.quickblox.d.b.b.a);
    localc.a(paramString);
    localc.a(new com.quickblox.c.d.h(paramArrayList));
    com.quickblox.d.b.a(localc, null);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.e
 * JD-Core Version:    0.6.0
 */