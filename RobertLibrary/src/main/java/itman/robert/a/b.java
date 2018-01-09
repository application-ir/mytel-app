package itman.robert.a;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class b
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;

  public b()
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    c(localGregorianCalendar.get(1), localGregorianCalendar.get(2) + 1, localGregorianCalendar.get(5));
  }

  public b(Calendar paramCalendar)
  {
    c(paramCalendar.get(1), paramCalendar.get(2) + 1, paramCalendar.get(5));
  }

  private int d(int paramInt1, int paramInt2, int paramInt3)
  {
    return ((paramInt2 - 8) / 6 + paramInt1 + 100100) * 1461 / 4 + ((paramInt2 + 9) % 12 * 153 + 2) / 5 + paramInt3 - 34840408 - (paramInt1 + 100100 + (paramInt2 - 8) / 6) / 100 * 3 / 4 + 752;
  }

  private void i()
  {
    int[] arrayOfInt = new int[20];
    int[] tmp8_6 = arrayOfInt;
    tmp8_6[0] = -61;
    int[] tmp13_8 = tmp8_6;
    tmp13_8[1] = 9;
    int[] tmp18_13 = tmp13_8;
    tmp18_13[2] = 38;
    int[] tmp23_18 = tmp18_13;
    tmp23_18[3] = 'Ç';
    int[] tmp29_23 = tmp23_18;
    tmp29_23[4] = 426;
    int[] tmp35_29 = tmp29_23;
    tmp35_29[5] = 686;
    int[] tmp41_35 = tmp35_29;
    tmp41_35[6] = 756;
    int[] tmp48_41 = tmp41_35;
    tmp48_41[7] = 818;
    int[] tmp55_48 = tmp48_41;
    tmp55_48[8] = 1111;
    int[] tmp62_55 = tmp55_48;
    tmp62_55[9] = 1181;
    int[] tmp69_62 = tmp62_55;
    tmp69_62[10] = 1210;
    int[] tmp76_69 = tmp69_62;
    tmp76_69[11] = 1635;
    int[] tmp83_76 = tmp76_69;
    tmp83_76[12] = 2060;
    int[] tmp90_83 = tmp83_76;
    tmp90_83[13] = 2097;
    int[] tmp97_90 = tmp90_83;
    tmp97_90[14] = 2192;
    int[] tmp104_97 = tmp97_90;
    tmp104_97[15] = 2262;
    int[] tmp111_104 = tmp104_97;
    tmp111_104[16] = 2324;
    int[] tmp118_111 = tmp111_104;
    tmp118_111[17] = 2394;
    int[] tmp125_118 = tmp118_111;
    tmp125_118[18] = 2456;
    int[] tmp132_125 = tmp125_118;
    tmp132_125[19] = 3178;
    tmp132_125;
    this.d = (this.a + 621);
    int i1 = -14;
    int i2 = arrayOfInt[0];
    int n = 1;
    int i4;
    int i5;
    int i3;
    do
    {
      i4 = arrayOfInt[n];
      i5 = i4 - i2;
      i3 = i2;
      m = i1;
      if (this.a >= i4)
      {
        m = i1 + (i5 / 33 * 8 + i5 % 33 / 4);
        i3 = i4;
      }
      n += 1;
      if (n >= 20)
        break;
      i2 = i3;
      i1 = m;
    }
    while (this.a >= i4);
    n = this.a - i3;
    i1 = n / 33 * 8 + (n % 33 + 3) / 4 + m;
    int m = i1;
    if (i5 % 33 == 4)
    {
      m = i1;
      if (i5 - n == 4)
        m = i1 + 1;
    }
    this.l = (m + 20 - (this.d / 4 - (this.d / 100 + 1) * 3 / 4 - 150));
    if (i5 - n < 6);
    for (m = n - i5 + (i5 + 4) / 33 * 33; ; m = n)
    {
      this.j = (((m + 1) % 33 - 1) % 4);
      if (this.j == -1)
        this.j = 4;
      return;
    }
  }

  private int j()
  {
    i();
    return d(this.d, 3, this.l) + (this.b - 1) * 31 - this.b / 7 * (this.b - 7) + this.c - 1;
  }

  private void k()
  {
    m();
    this.a = (this.d - 621);
    i();
    int m = d(this.d, 3, this.l);
    m = this.k - m;
    if (m >= 0)
    {
      if (m <= 185)
      {
        this.b = (m / 31 + 1);
        this.c = (m % 31 + 1);
        return;
      }
      m -= 186;
    }
    while (true)
    {
      this.b = (m / 30 + 7);
      this.c = (m % 30 + 1);
      return;
      this.a -= 1;
      int n = m + 179;
      m = n;
      if (this.j != 1)
        continue;
      m = n + 1;
    }
  }

  private void l()
  {
    int m = this.k * 4 + 139361631;
    int n = m % 1461 / 4 * 5 + 308;
    this.i = (n % 153 / 5 + 1);
    this.h = (n / 153 % 12 + 1);
    this.g = (m / 1461 - 100100 + (8 - this.h) / 6);
  }

  private void m()
  {
    int m = this.k * 4 + 139361631 + ((this.k * 4 + 183187720) / 146097 * 3 / 4 * 4 - 3908);
    int n = m % 1461 / 4 * 5 + 308;
    this.f = (n % 153 / 5 + 1);
    this.e = (n / 153 % 12 + 1);
    this.d = (m / 1461 - 100100 + (8 - this.e) / 6);
  }

  public int a()
  {
    return this.a;
  }

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int m = 1;
    b(paramInt1, paramInt2, paramInt3);
    Date localDate = new SimpleDateFormat("yyyy/M/d", Locale.US).parse(e());
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(localDate);
    paramInt2 = localCalendar.get(7);
    if (7 == paramInt2)
      paramInt1 = 0;
    do
    {
      return paramInt1;
      paramInt1 = m;
    }
    while (1 == paramInt2);
    if (2 == paramInt2)
      return 2;
    if (3 == paramInt2)
      return 3;
    if (4 == paramInt2)
      return 4;
    if (5 == paramInt2)
      return 5;
    if (6 == paramInt2)
      return 6;
    return paramInt2;
  }

  public int b()
  {
    return this.b;
  }

  public void b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.k = j();
    k();
    l();
    m();
  }

  public int c()
  {
    return this.c;
  }

  public void c(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.k = d(paramInt1, paramInt2, paramInt3);
    k();
    l();
    m();
  }

  public String d()
  {
    return this.a + "/" + this.b + "/" + this.c;
  }

  public String e()
  {
    return this.d + "/" + this.e + "/" + this.f;
  }

  public String f()
  {
    return this.g + "/" + this.h + "/" + this.i;
  }

  public String g()
  {
    int m = h();
    return new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }[m];
  }

  public int h()
  {
    return this.k % 7;
  }

  public String toString()
  {
    return g() + ", Gregorian:[" + e() + "], Julian:[" + f() + "], Iranian:[" + d() + "]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.a.b
 * JD-Core Version:    0.6.0
 */