package itman.robert.c.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import itman.robert.c.a;

public class b
{
  public static Drawable a(int paramInt)
  {
    return a.a().getResources().getDrawable(paramInt);
  }

  public static int b(int paramInt)
  {
    if (paramInt == 0)
      return -16711936;
    try
    {
      localObject = ((Context)localObject).getPackageManager().getPackageInfo(((Context)localObject).getPackageName(), 0);
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return a.a().getResources().getColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.c.b
 * JD-Core Version:    0.6.0
 */