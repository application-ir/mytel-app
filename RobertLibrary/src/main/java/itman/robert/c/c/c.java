package itman.robert.c.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.quickblox.c.d.h;
import java.util.Map;

public class c
{
  private static c a;
  private SharedPreferences b;

  private c()
  {
    a = this;
    this.b = itman.robert.c.a.a().getSharedPreferences("qb", 0);
  }

  public static c a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new c();
      c localc = a;
      return localc;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private SharedPreferences.Editor e()
  {
    return this.b.edit();
  }

  public void a(com.quickblox.e.b.a parama)
  {
    a("qb_user_id", parama.b());
    a("qb_user_login", parama.g());
    a("qb_user_password", parama.a());
    a("qb_user_full_name", parama.e());
    a("qb_user_tags", parama.p().a());
    a("qb_user_tags", parama.p().f());
  }

  public void a(String paramString)
  {
    if (this.b.contains(paramString))
      e().remove(paramString).commit();
  }

  public void a(String paramString, Object paramObject)
  {
    SharedPreferences.Editor localEditor = e();
    if ((paramObject instanceof Boolean))
      localEditor.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
    do
      while (true)
      {
        localEditor.commit();
        return;
        if ((paramObject instanceof Integer))
        {
          localEditor.putInt(paramString, ((Integer)paramObject).intValue());
          continue;
        }
        if ((paramObject instanceof Float))
        {
          localEditor.putFloat(paramString, ((Float)paramObject).floatValue());
          continue;
        }
        if ((paramObject instanceof Long))
        {
          localEditor.putLong(paramString, ((Long)paramObject).longValue());
          continue;
        }
        if ((paramObject instanceof String))
        {
          localEditor.putString(paramString, (String)paramObject);
          continue;
        }
        if (!(paramObject instanceof Enum))
          break;
        localEditor.putString(paramString, paramObject.toString());
      }
    while (paramObject == null);
    throw new RuntimeException("Attempting to save non-supported preference");
  }

  public com.quickblox.e.b.a b()
  {
    Object localObject1 = null;
    Integer localInteger;
    Object localObject2;
    String str2;
    String str1;
    if (c())
    {
      localInteger = (Integer)b("qb_user_id");
      localObject2 = (String)b("qb_user_login");
      str2 = (String)b("qb_user_password");
      str1 = (String)b("qb_user_full_name");
      String str3 = (String)b("qb_user_tags");
      if (str3 == null)
        break label120;
      localObject1 = new h();
      ((h)localObject1).a(str3.split(","));
    }
    while (true)
    {
      localObject2 = new com.quickblox.e.b.a((String)localObject2, str2);
      ((com.quickblox.e.b.a)localObject2).b(localInteger.intValue());
      ((com.quickblox.e.b.a)localObject2).b(str1);
      ((com.quickblox.e.b.a)localObject2).a((h)localObject1);
      localObject1 = localObject2;
      return localObject1;
      label120: localObject1 = null;
    }
  }

  public <T> T b(String paramString)
  {
    return this.b.getAll().get(paramString);
  }

  public <T> T b(String paramString, T paramT)
  {
    paramString = this.b.getAll().get(paramString);
    if (paramString == null)
      return paramT;
    return paramString;
  }

  public boolean c()
  {
    return (c("qb_user_login")) && (c("qb_user_password"));
  }

  public boolean c(String paramString)
  {
    return this.b.contains(paramString);
  }

  public void d()
  {
    e().clear().commit();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.c.c
 * JD-Core Version:    0.6.0
 */