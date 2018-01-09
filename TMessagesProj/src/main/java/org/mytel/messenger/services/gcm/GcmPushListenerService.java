package itman.robert.groupchatwebrtc.services.gcm;

import android.os.Bundle;
import android.util.Log;
import itman.robert.c.a.b;
import itman.robert.c.c.c;
import itman.robert.groupchatwebrtc.services.CallService;

public class GcmPushListenerService extends com.google.android.gms.gcm.a
{
  private static final String a = b.class.getSimpleName();

  private void a(com.quickblox.e.b.a parama)
  {
    CallService.a(this, parama);
  }

  public void a(String paramString, Bundle paramBundle)
  {
    paramBundle = paramBundle.getString("message");
    Log.v(a, "From: " + paramString);
    Log.v(a, "Message: " + paramBundle);
    paramString = c.a();
    if (paramString.c())
    {
      Log.d(a, "App have logined user");
      a(paramString.b());
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.services.gcm.GcmPushListenerService
 * JD-Core Version:    0.6.0
 */