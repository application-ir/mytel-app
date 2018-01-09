package itman.robert.groupchatwebrtc.e;

import android.content.Context;
import android.widget.EditText;
import itman.robert.tabLayout.a.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class l
{
  public static boolean a(Context paramContext, EditText paramEditText)
  {
    return a(paramContext, paramEditText, a.j.field_name_user_name, 20, true);
  }

  private static boolean a(Context paramContext, EditText paramEditText, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean);
    for (Pattern localPattern = Pattern.compile("^[a-zA-Z][a-zA-Z 0-9]{2," + (paramInt2 - 1) + "}+$"); !localPattern.matcher(paramEditText.getText().toString().trim()).matches(); localPattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]{2," + (paramInt2 - 1) + "}+$"))
    {
      paramEditText.setError(String.format(paramContext.getString(a.j.error_name_must_not_contain_special_characters_from_app), new Object[] { paramContext.getString(paramInt1), Integer.valueOf(paramInt2) }));
      return false;
    }
    return true;
  }

  public static boolean b(Context paramContext, EditText paramEditText)
  {
    return a(paramContext, paramEditText, a.j.field_name_chat_room_name, 15, false);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.l
 * JD-Core Version:    0.6.0
 */