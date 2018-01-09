package itman.robert.a;

import android.content.Context;
import android.content.res.Resources;
import itman.robert.tabLayout.a.a;
import java.text.ParseException;
import java.util.Calendar;

public class a
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;

  public a()
  {
    a(new b());
  }

  public int a()
  {
    try
    {
      int i = new b().a(this.b, this.c, this.a);
      return i;
    }
    catch (ParseException localParseException)
    {
      localParseException.printStackTrace();
    }
    return 0;
  }

  public String a(Context paramContext)
  {
    paramContext = paramContext.getResources().getStringArray(a.a.persian_months);
    return this.a + " " + paramContext[(this.c - 1)];
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt3;
    this.c = paramInt2;
    if (this.e == 0)
    {
      this.e = new b().a();
      this.d = (this.e + 10);
    }
  }

  public void a(b paramb)
  {
    a(paramb.c(), paramb.b(), paramb.a());
  }

  public void a(Calendar paramCalendar)
  {
    paramCalendar = new b(paramCalendar);
    a(paramCalendar.c(), paramCalendar.b(), paramCalendar.a());
  }

  public String b(Context paramContext)
  {
    paramContext = paramContext.getResources().getStringArray(a.a.persian_months);
    return this.a + "," + this.b + " " + paramContext[(this.c - 1)];
  }

  public String c(Context paramContext)
  {
    return this.b + "/" + this.c + "/" + this.a;
  }

  public String d(Context paramContext)
  {
    return paramContext.getResources().getStringArray(a.a.persian_week_days)[a()];
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.a.a
 * JD-Core Version:    0.6.0
 */