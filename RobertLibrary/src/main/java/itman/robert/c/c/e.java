package itman.robert.c.c;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import itman.robert.c.a;
import itman.robert.tabLayout.a.d;
import java.util.Random;

public class e
{
  private static final Random a = new Random();

  public static Drawable a(int paramInt)
  {
    return b(c(paramInt % 9));
  }

  public static Drawable b(int paramInt)
  {
    GradientDrawable localGradientDrawable = (GradientDrawable)b.a(a.d.shape_circle);
    localGradientDrawable.setColor(paramInt);
    return localGradientDrawable;
  }

  public static int c(int paramInt)
  {
    String str = String.format("random_color_%d", new Object[] { Integer.valueOf(paramInt + 1) });
    return b.b(a.a().getResources().getIdentifier(str, "color", a.a().getPackageName()));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.c.c.e
 * JD-Core Version:    0.6.0
 */