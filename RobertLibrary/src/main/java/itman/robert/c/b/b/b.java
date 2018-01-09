package itman.robert.c.b.b;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class b<T> extends a<T>
{
  protected List<T> d = new ArrayList();

  public b(Context paramContext, List<T> paramList)
  {
    super(paramContext, paramList);
  }

  public Collection<T> a()
  {
    return this.d;
  }

  public void a(int paramInt)
  {
    a(getItem(paramInt));
  }

  public void a(T paramT)
  {
    if (this.d.contains(paramT))
      this.d.remove(paramT);
    while (true)
    {
      notifyDataSetChanged();
      return;
      this.d.add(paramT);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.b.b.b
 * JD-Core Version:    0.6.0
 */