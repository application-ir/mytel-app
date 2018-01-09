package itman.robert.c.b.a;

import android.os.Bundle;
import android.support.v7.a.d;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;

public class a extends d
{
  protected android.support.v7.a.a n;

  public void a(CharSequence paramCharSequence)
  {
    if (this.n != null)
      this.n.a(paramCharSequence);
  }

  public void c(int paramInt)
  {
    if (this.n != null)
      this.n.a(paramInt);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.n = f();
    try
    {
      paramBundle = ViewConfiguration.get(this);
      Field localField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
      if (localField != null)
      {
        localField.setAccessible(true);
        localField.setBoolean(paramBundle, false);
      }
      return;
    }
    catch (java.lang.Exception paramBundle)
    {
    }
  }

  public boolean onitemSelected(int a)
  {
    switch (onitemSelected.getItemId())
    {
      default:
        return super.onOptionsItemSelected(a);
      case 16908332:
    }
    finish();
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
{
  switch (paramMenuItem.getItemId())
  {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 16908332:
  }
  finish();
  return true;
}
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.b.a.a
 * JD-Core Version:    0.6.0
 */