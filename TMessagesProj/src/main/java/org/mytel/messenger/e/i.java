package itman.robert.groupchatwebrtc.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.quickblox.videochat.webrtc.l;
import com.quickblox.videochat.webrtc.m;
import com.quickblox.videochat.webrtc.m.a;
import com.quickblox.videochat.webrtc.m.b;
import com.quickblox.videochat.webrtc.m.c;
import itman.robert.tabLayout.a.j;
import java.util.List;

public class i
{
  private static final String a = i.class.getSimpleName();

  public static int a(SharedPreferences paramSharedPreferences, Context paramContext, int paramInt1, int paramInt2)
  {
    return paramSharedPreferences.getInt(paramContext.getString(paramInt1), Integer.valueOf(paramContext.getString(paramInt2)).intValue());
  }

  private static String a(SharedPreferences paramSharedPreferences, Context paramContext, int paramInt, String paramString)
  {
    return paramSharedPreferences.getString(paramContext.getString(paramInt), paramString);
  }

  private static void a()
  {
    m.a(m.c.b.d);
    m.b(m.c.b.e);
  }

  private static void a(int paramInt)
  {
    if (paramInt != -1)
    {
      b(paramInt);
      return;
    }
    a();
  }

  public static void a(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    long l = a(localSharedPreferences, paramContext, a.j.pref_answer_time_interval_key, a.j.pref_answer_time_interval_default_value);
    l.b(l);
    Log.e(a, "answerTimeInterval = " + l);
    int i = a(localSharedPreferences, paramContext, a.j.pref_disconnect_time_interval_key, a.j.pref_disconnect_time_interval_default_value);
    l.b(Integer.valueOf(i));
    Log.e(a, "disconnectTimeInterval = " + i);
    l = a(localSharedPreferences, paramContext, a.j.pref_dialing_time_interval_key, a.j.pref_dialing_time_interval_default_value);
    l.a(l);
    Log.e(a, "dialingTimeInterval = " + l);
  }

  private static void a(SharedPreferences paramSharedPreferences, Context paramContext)
  {
    boolean bool2 = true;
    Object localObject = b(paramSharedPreferences, paramContext, a.j.pref_audiocodec_key, a.j.pref_audiocodec_def);
    if (m.a.b.a().equals(localObject))
    {
      localObject = m.a.b;
      Log.e(a, "audioCodec =: " + ((m.a)localObject).a());
      m.a((m.a)localObject);
      Log.v(a, "audioCodec = " + m.a());
      if (c(paramSharedPreferences, paramContext, a.j.pref_disable_built_in_aec_key, a.j.pref_disable_built_in_aec_default))
        break label244;
      bool1 = true;
      label113: m.c(bool1);
      Log.v(a, "setUseBuildInAEC = " + m.k());
      if (c(paramSharedPreferences, paramContext, a.j.pref_noaudioprocessing_key, a.j.pref_noaudioprocessing_default))
        break label249;
    }
    label244: label249: for (boolean bool1 = bool2; ; bool1 = false)
    {
      m.d(bool1);
      Log.v(a, "isAudioProcessingEnabled = " + m.o());
      m.b(c(paramSharedPreferences, paramContext, a.j.pref_opensles_key, a.j.pref_opensles_default));
      Log.v(a, "isUseOpenSLES = " + m.j());
      return;
      localObject = m.a.a;
      break;
      bool1 = false;
      break label113;
    }
  }

  private static void a(List<Integer> paramList)
  {
    if (paramList.size() <= 4)
    {
      if (m.c() > m.c.b.d)
        a();
      return;
    }
    m.a(m.c.c.d);
    m.b(m.c.c.e);
    m.a(false);
    m.a(null);
  }

  public static void a(List<Integer> paramList, SharedPreferences paramSharedPreferences, Context paramContext)
  {
    a(paramSharedPreferences, paramContext);
    if (paramList.size() == 1)
    {
      b(paramSharedPreferences, paramContext);
      return;
    }
    a(paramList);
  }

  private static String b(SharedPreferences paramSharedPreferences, Context paramContext, int paramInt1, int paramInt2)
  {
    return paramSharedPreferences.getString(paramContext.getString(paramInt1), paramContext.getString(paramInt2));
  }

  private static void b(int paramInt)
  {
    m.c[] arrayOfc = m.c.values();
    int j = arrayOfc.length;
    int i = 0;
    while (i < j)
    {
      m.c localc = arrayOfc[i];
      if (localc.ordinal() == paramInt)
      {
        Log.e(a, "resolution =: " + localc.e + ":" + localc.d);
        m.b(localc.e);
        m.a(localc.d);
      }
      i += 1;
    }
  }

  private static void b(SharedPreferences paramSharedPreferences, Context paramContext)
  {
    m.a(paramSharedPreferences.getBoolean(paramContext.getString(a.j.pref_hwcodec_key), Boolean.valueOf(paramContext.getString(a.j.pref_hwcodec_default)).booleanValue()));
    int i = Integer.parseInt(paramSharedPreferences.getString(paramContext.getString(a.j.pref_resolution_key), "0"));
    Log.e(a, "resolutionItem =: " + i);
    a(i);
    Log.v(a, "resolution = " + m.d() + "x" + m.c());
    i = a(paramSharedPreferences, paramContext, a.j.pref_startbitratevalue_key, a.j.pref_startbitratevalue_default);
    Log.e(a, "videoStartBitrate =: " + i);
    m.d(i);
    Log.v(a, "videoStartBitrate = " + m.f());
    int j = Integer.parseInt(a(paramSharedPreferences, paramContext, a.j.pref_videocodec_key, "0"));
    m.b[] arrayOfb = m.b.values();
    int k = arrayOfb.length;
    i = 0;
    while (true)
    {
      if (i < k)
      {
        m.b localb = arrayOfb[i];
        if (localb.ordinal() == j)
        {
          Log.e(a, "videoCodecItem =: " + localb.a());
          m.a(localb);
          Log.v(a, "videoCodecItem = " + m.b());
        }
      }
      else
      {
        i = a(paramSharedPreferences, paramContext, a.j.pref_frame_rate_key, a.j.pref_frame_rate_default);
        Log.e(a, "cameraFps = " + i);
        m.c(i);
        Log.v(a, "cameraFps = " + m.e());
        return;
      }
      i += 1;
    }
  }

  private static boolean c(SharedPreferences paramSharedPreferences, Context paramContext, int paramInt1, int paramInt2)
  {
    return paramSharedPreferences.getBoolean(paramContext.getString(paramInt1), Boolean.valueOf(paramContext.getString(paramInt2)).booleanValue());
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.groupchatwebrtc.e.i
 * JD-Core Version:    0.6.0
 */