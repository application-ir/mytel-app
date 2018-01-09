package itman.robert.c.c;

import android.widget.Toast;
import itman.robert.c.a;

public class d
{
  private static Toast a(String paramString, int paramInt)
  {
    return Toast.makeText(a.a(), paramString, paramInt);
  }

  public static void a(int paramInt)
  {
    a(a.a().getString(paramInt));
  }

  public static void a(String paramString)
  {
    b(paramString, 0);
  }

  public static void b(int paramInt)
  {
    b(a.a().getString(paramInt));
  }

  public static void b(String paramString)
  {
    b(paramString, 1);
  }

  private static void b(String paramString, int paramInt)
  {
    a(paramString, paramInt).show();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.c.d
 * JD-Core Version:    0.6.0
 */