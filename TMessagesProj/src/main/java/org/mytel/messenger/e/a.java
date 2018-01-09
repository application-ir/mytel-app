package itman.robert.groupchatwebrtc.e;

import com.quickblox.c.d.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a
{
  public static String a(ArrayList<com.quickblox.e.b.a> paramArrayList)
  {
    h localh = new h();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      com.quickblox.e.b.a locala = (com.quickblox.e.b.a)paramArrayList.next();
      if (locala.e() != null)
      {
        localh.add(locala.e());
        continue;
      }
      if (locala.b() == null)
        continue;
      localh.add(String.valueOf(locala.b()));
    }
    return localh.a().replace(",", ", ");
  }

  public static ArrayList<Integer> a(Collection<com.quickblox.e.b.a> paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    if (!paramCollection.isEmpty())
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
        localArrayList.add(((com.quickblox.e.b.a)paramCollection.next()).b());
    }
    return localArrayList;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.a
 * JD-Core Version:    0.6.0
 */