package itman.robert.tabLayout.b;

import android.support.v4.app.o;
import android.support.v4.app.t;
import android.support.v4.app.w;
import java.util.ArrayList;

public class a
{
  private t a;
  private ArrayList<o> b;
  private int c;

  public void a(int paramInt)
  {
    int i = 0;
    if (i < this.b.size())
    {
      w localw = this.a.a();
      o localo = (o)this.b.get(i);
      if (i == paramInt)
        localw.c(localo);
      while (true)
      {
        localw.a();
        i += 1;
        break;
        localw.b(localo);
      }
    }
    this.c = paramInt;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.tabLayout.b.a
 * JD-Core Version:    0.6.0
 */