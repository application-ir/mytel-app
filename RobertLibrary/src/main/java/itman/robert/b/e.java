package itman.robert.b;

import android.graphics.Color;

public class e
{
  public static float a(int paramInt)
  {
    return Color.alpha(paramInt) / 255.0F;
  }

  public static int a(float paramFloat)
  {
    return Math.round(255.0F * paramFloat);
  }

  public static int a(float paramFloat, int paramInt)
  {
    return a(paramFloat) << 24 | 0xFFFFFF & paramInt;
  }

  public static int a(int paramInt, float paramFloat)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    arrayOfFloat[2] = paramFloat;
    return Color.HSVToColor(arrayOfFloat);
  }

  public static String a(int paramInt, boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
    {
      i = -1;
      if (!paramBoolean)
        break label40;
    }
    label40: for (String str = "#%08X"; ; str = "#%06X")
    {
      return String.format(str, new Object[] { Integer.valueOf(i & paramInt) }).toUpperCase();
      i = 16777215;
      break;
    }
  }

  public static float b(int paramInt)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    return arrayOfFloat[2];
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.e
 * JD-Core Version:    0.6.0
 */