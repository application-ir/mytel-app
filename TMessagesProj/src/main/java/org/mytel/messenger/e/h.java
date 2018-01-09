package itman.robert.groupchatwebrtc.e;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.Log;

public class h
{
  private static final String a = h.class.getSimpleName();
  private MediaPlayer b;
  private Context c;

  public h(Context paramContext)
  {
    this.c = paramContext;
    Uri localUri = b();
    if (localUri != null)
      this.b = MediaPlayer.create(paramContext, localUri);
  }

  public h(Context paramContext, int paramInt)
  {
    this.c = paramContext;
    this.b = MediaPlayer.create(paramContext, paramInt);
  }

  private Uri b()
  {
    Uri localUri2 = RingtoneManager.getDefaultUri(1);
    Uri localUri1 = localUri2;
    if (localUri2 == null)
    {
      localUri2 = RingtoneManager.getDefaultUri(2);
      localUri1 = localUri2;
      if (localUri2 == null)
        localUri1 = RingtoneManager.getDefaultUri(4);
    }
    return localUri1;
  }

  public void a()
  {
    monitorenter;
    try
    {
      MediaPlayer localMediaPlayer = this.b;
      if (localMediaPlayer != null);
      try
      {
        this.b.stop();
        this.b.release();
        this.b = null;
        monitorexit;
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
          localIllegalStateException.printStackTrace();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void a(boolean paramBoolean)
  {
    Log.i(a, "play");
    if (this.b == null)
    {
      Log.i(a, "mediaPlayer isn't created ");
      return;
    }
    this.b.setLooping(paramBoolean);
    this.b.start();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.h
 * JD-Core Version:    0.6.0
 */