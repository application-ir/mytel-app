package itman.robert.groupchatwebrtc.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.quickblox.c.d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
  private static String a = b.class.getSimpleName();
  private static b b;
  private Context c;

  private b(Context paramContext)
  {
    this.c = paramContext;
  }

  public static b a(Context paramContext)
  {
    if (b == null)
      b = new b(paramContext);
    return b;
  }

  private String a(String paramString, ConcurrentHashMap<String, String> paramConcurrentHashMap)
  {
    if (paramConcurrentHashMap.get(paramString) != null)
      return (String)paramConcurrentHashMap.get(paramString);
    return "Unknown";
  }

  public com.quickblox.e.b.a a(Integer paramInteger)
  {
    Object localObject2 = null;
    a locala = new a(this.c);
    Cursor localCursor = locala.getWritableDatabase().query("users", null, null, null, null, null, null);
    Object localObject1 = localObject2;
    if (localCursor.moveToFirst())
    {
      int i = localCursor.getColumnIndex("userID");
      int j = localCursor.getColumnIndex("userLogin");
      int k = localCursor.getColumnIndex("userPass");
      int m = localCursor.getColumnIndex("userFullName");
      int n = localCursor.getColumnIndex("userTag");
      if (localCursor.getInt(i) != paramInteger.intValue())
        break label226;
      localObject1 = new com.quickblox.e.b.a();
      ((com.quickblox.e.b.a)localObject1).b(localCursor.getString(m));
      ((com.quickblox.e.b.a)localObject1).d(localCursor.getString(j));
      ((com.quickblox.e.b.a)localObject1).b(localCursor.getInt(i));
      ((com.quickblox.e.b.a)localObject1).a(localCursor.getString(k));
      paramInteger = new h();
      paramInteger.a(localCursor.getString(n).split(","));
      ((com.quickblox.e.b.a)localObject1).a(paramInteger);
    }
    while (true)
    {
      localCursor.close();
      locala.close();
      return localObject1;
      label226: if (localCursor.moveToNext())
        break;
      localObject1 = localObject2;
    }
  }

  public ArrayList<com.quickblox.e.b.a> a()
  {
    ArrayList localArrayList = new ArrayList();
    a locala = new a(this.c);
    Cursor localCursor = locala.getWritableDatabase().query("users", null, null, null, null, null, null);
    if (localCursor.moveToFirst())
    {
      int i = localCursor.getColumnIndex("userID");
      int j = localCursor.getColumnIndex("userLogin");
      int k = localCursor.getColumnIndex("userPass");
      int m = localCursor.getColumnIndex("userFullName");
      int n = localCursor.getColumnIndex("userTag");
      do
      {
        com.quickblox.e.b.a locala1 = new com.quickblox.e.b.a();
        locala1.b(localCursor.getString(m));
        locala1.d(localCursor.getString(j));
        locala1.b(localCursor.getInt(i));
        locala1.a(localCursor.getString(k));
        h localh = new h();
        localh.add(localCursor.getString(n));
        locala1.a(localh);
        localArrayList.add(locala1);
      }
      while (localCursor.moveToNext());
    }
    localCursor.close();
    locala.close();
    return localArrayList;
  }

  public ArrayList<com.quickblox.e.b.a> a(List<Integer> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      if (a(localInteger) == null)
        continue;
      localArrayList.add(a(localInteger));
    }
    return localArrayList;
  }

  public void a(com.quickblox.e.b.a parama)
  {
    ContentValues localContentValues = new ContentValues();
    a locala = new a(this.c);
    SQLiteDatabase localSQLiteDatabase = locala.getWritableDatabase();
    localContentValues.put("userFullName", parama.e());
    localContentValues.put("userLogin", parama.g());
    localContentValues.put("userID", parama.b());
    localContentValues.put("userPass", parama.a());
    localContentValues.put("userTag", parama.p().a());
    localSQLiteDatabase.insert("users", null, localContentValues);
    locala.close();
  }

  public void a(ArrayList<com.quickblox.e.b.a> paramArrayList, boolean paramBoolean, ConcurrentHashMap<String, String> paramConcurrentHashMap)
  {
    if (paramBoolean)
      b();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      com.quickblox.e.b.a locala = (com.quickblox.e.b.a)paramArrayList.next();
      locala.b(a(locala.g(), paramConcurrentHashMap));
      a(locala);
    }
    Log.d(a, "saveAllUsers");
  }

  public void b()
  {
    a locala = new a(this.c);
    locala.getWritableDatabase().delete("users", null, null);
    locala.close();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.b.b
 * JD-Core Version:    0.6.0
 */