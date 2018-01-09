package itman.robert.groupchatwebrtc.e;

import android.content.Context;
import android.text.TextUtils;
import com.quickblox.e.b.a;
import itman.robert.c.c.c;
import itman.robert.groupchatwebrtc.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class k
{
  private static c a;
  private static b b;

  private static a a(Integer paramInteger)
  {
    a locala = new a(paramInteger);
    locala.b(String.valueOf(paramInteger));
    return locala;
  }

  public static String a(a parama, Integer paramInteger)
  {
    if (parama == null)
      parama = String.valueOf(paramInteger);
    String str;
    do
    {
      return parama;
      str = parama.e();
      parama = str;
    }
    while (!TextUtils.isEmpty(str));
    return String.valueOf(paramInteger);
  }

  public static ArrayList<a> a(ArrayList<a> paramArrayList, List<Integer> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a locala = a((Integer)paramList.next());
      if (paramArrayList.contains(locala))
        continue;
      localArrayList.add(locala);
    }
    localArrayList.addAll(paramArrayList);
    return localArrayList;
  }

  public static void a(Context paramContext)
  {
    if (a == null)
      a = c.a();
    a.d();
    if (b == null)
      b = b.a(paramContext);
    b.b();
  }

  public static ArrayList<Integer> b(ArrayList<a> paramArrayList, List<Integer> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      if (paramArrayList.contains(a(localInteger)))
        continue;
      localArrayList.add(localInteger);
    }
    return localArrayList;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.k
 * JD-Core Version:    0.6.0
 */