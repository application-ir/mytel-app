package itman.robert.c.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import itman.robert.c.a;

public class f
{
  public static int a()
  {
    return b().versionCode;
  }

  private static PackageInfo b()
  {
    Object localObject = a.a();
    try
    {
      localObject = ((Context)localObject).getPackageManager().getPackageInfo(((Context)localObject).getPackageName(), 0);
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    throw new RuntimeException("Could not get package name: " + localNameNotFoundException);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.c.f
 * JD-Core Version:    0.6.0
 */