package itman.robert.c.b.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.List;

public abstract class a<T> extends BaseAdapter
{
  protected LayoutInflater a;
  protected Context b;
  protected List<T> c;

  public a(Context paramContext, List<T> paramList)
  {
    this.b = paramContext;

    this.c = paramList;
    this.a = LayoutInflater.from(paramContext);
  }

  public int getCount()
  {
    return this.c.size();
  }

  public T getItem(int paramInt)
  {
    return this.c.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.b.b.a
 * JD-Core Version:    0.6.0
 */