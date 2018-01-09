package itman.robert;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class a
{
  public void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getSharedPreferences("vidofilmSetting", 0).edit();
    paramContext.putInt("ThemeColor", paramInt);
    paramContext.commit();
  }

  public void a(Context paramContext, boolean paramBoolean)
  {
    paramContext = paramContext.getSharedPreferences("vidofilmSetting", 0).edit();
    paramContext.putBoolean("InvisibleMode", paramBoolean);
    paramContext.commit();
  }

  public boolean a(Context paramContext)
  {
    return paramContext.getSharedPreferences("Setting", 0).getBoolean("InvisibleMode", false);
  }

  public int b(Context paramContext)
  {
    return paramContext.getSharedPreferences("Setting", 0).getInt("ThemeColor", -11371101);
  }

  public void b(Context paramContext, boolean paramBoolean)
  {
    paramContext = paramContext.getSharedPreferences("Setting", 0).edit();
    paramContext.putBoolean("Language", paramBoolean);
    paramContext.commit();
  }

  public void c(Context paramContext, boolean paramBoolean)
  {
    paramContext = paramContext.getSharedPreferences("Setting", 0).edit();
    paramContext.putBoolean("PersionDate", paramBoolean);
    paramContext.commit();
  }

  public boolean c(Context paramContext)
  {
    return paramContext.getSharedPreferences("vidofilmSetting", 0).getBoolean("Language", false);
  }

  public boolean d(Context paramContext)
  {
    return paramContext.getSharedPreferences("vidofilmSetting", 0).getBoolean("PersionDate", false);
  }
  public boolean g(Context paramContext)
  {
    return paramContext.getSharedPreferences("Setting", 0).getBoolean("Send", false);
  }

  public boolean g(Context paramContext)
  {
    return paramContext.getSharedPreferences("Setting", 0).getBoolean("Send", false);
  }

}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.a
 * JD-Core Version:    0.6.0
 */