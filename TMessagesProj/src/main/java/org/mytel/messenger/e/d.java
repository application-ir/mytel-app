package itman.robert.groupchatwebrtc.e;

import android.content.Context;
import android.support.v4.content.a;

public class d
{
  private final Context a;

  public d(Context paramContext)
  {
    this.a = paramContext;
  }

  private boolean a(String paramString)
  {
    return a.b(this.a, paramString) == -1;
  }

  public boolean a(String[] paramArrayOfString)
  {
    int m = 0;
    int j = paramArrayOfString.length;
    int i = 0;
    while (true)
    {
      int k = m;
      if (i < j)
      {
        if (a(paramArrayOfString[i]))
          k = 1;
      }
      else
        return k;
      i += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.d
 * JD-Core Version:    0.6.0
 */