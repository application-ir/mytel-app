package itman.robert.groupchatwebrtc.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class a extends SQLiteOpenHelper
{
  private String a = a.class.getSimpleName();

  public a(Context paramContext)
  {
    super(paramContext, "groupchatwebrtcDB", null, 1);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    Log.d(this.a, "--- onCreate database ---");
    paramSQLiteDatabase.execSQL("create table users (ID integer primary key autoincrement,userID integer,userLogin text,userPass text,userFullName text,userTag text);");
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.b.a
 * JD-Core Version:    0.6.0
 */