package itman.robert.groupchatwebrtc.e;

import android.text.TextUtils;
import itman.robert.c.c.c;
import java.util.Date;

public class j
{
  public static boolean a()
  {
    String str = d();
    Date localDate = e();
    if (TextUtils.isEmpty(str));
    do
      return false;
    while ((localDate != null) && (System.currentTimeMillis() >= localDate.getTime()));
    return true;
  }

  public static void b()
  {
    try
    {
      String str = com.quickblox.a.a.p().r();
      Date localDate = com.quickblox.a.a.p().s();
      c.a().a("current_token", str);
      c.a().a("token_expiration_date", Long.valueOf(localDate.getTime()));
      return;
    }
    catch (com.quickblox.c.c.a locala)
    {
      locala.printStackTrace();
    }
  }

  public static boolean c()
  {
    if (a())
      try
      {
        com.quickblox.a.a.a(d(), e());
        return true;
      }
      catch (com.quickblox.c.c.a locala)
      {
        locala.printStackTrace();
      }
    return false;
  }

  private static String d()
  {
    return (String)c.a().b("current_token");
  }

  private static Date e()
  {
    long l = ((Long)c.a().b("token_expiration_date", Long.valueOf(0L))).longValue();
    if (l != 0L)
      return new Date(l);
    return null;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.j
 * JD-Core Version:    0.6.0
 */