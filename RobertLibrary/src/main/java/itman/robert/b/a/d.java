package itman.robert.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

public class d
{
  public static Shader a(int paramInt)
  {
    return new BitmapShader(b(Math.max(8, paramInt / 2 * 2)), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
  }

  public static a a()
  {
    return new a(null);
  }

  private static Bitmap b(int paramInt)
  {
    Paint localPaint = a().a();
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    int j = Math.round(paramInt / 2.0F);
    paramInt = 0;
    while (paramInt < 2)
    {
      int i = 0;
      if (i < 2)
      {
        if ((paramInt + i) % 2 == 0)
          localPaint.setColor(-1);
        while (true)
        {
          localCanvas.drawRect(paramInt * j, i * j, (paramInt + 1) * j, (i + 1) * j, localPaint);
          i += 1;
          break;
          localPaint.setColor(-3092272);
        }
      }
      paramInt += 1;
    }
    return localBitmap;
  }

  public static class a
  {
    private Paint a = new Paint(1);

    public Paint a()
    {
      return this.a;
    }

    public a a(float paramFloat)
    {
      this.a.setStrokeWidth(paramFloat);
      return this;
    }

    public a a(int paramInt)
    {
      this.a.setColor(paramInt);
      return this;
    }

    public a a(Paint.Style paramStyle)
    {
      this.a.setStyle(paramStyle);
      return this;
    }

    public a a(PorterDuff.Mode paramMode)
    {
      this.a.setXfermode(new PorterDuffXfermode(paramMode));
      return this;
    }

    public a a(Shader paramShader)
    {
      this.a.setShader(paramShader);
      return this;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.a.d
 * JD-Core Version:    0.6.0
 */