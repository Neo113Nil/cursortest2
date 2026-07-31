package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
public final class n43 {
    public final Context a;
    public final Handler b;
    public final l43 c;
    public final AudioManager d;
    public m43 e;
    public HandlerThread f;
    public int g;
    public int h;
    public boolean i;

    public n43(Context context, Handler handler, l43 l43Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = l43Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        if (audioManager == null) {
            throw new IllegalStateException();
        }
        this.d = audioManager;
        this.g = 3;
        this.h = a(audioManager, 3);
        int i = this.g;
        this.i = sb3.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        m43 m43Var = new m43(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(m43Var, intentFilter, null, new Handler(this.f.getLooper()));
            this.e = m43Var;
        } catch (RuntimeException e) {
            gh1.d("StreamVolumeManager", gh1.a("Error registering stream volume receiver", e));
            HandlerThread handlerThread2 = this.f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f = null;
            }
        }
    }

    public final int a() {
        int streamMinVolume;
        if (sb3.a < 28) {
            return 0;
        }
        streamMinVolume = this.d.getStreamMinVolume(this.g);
        return streamMinVolume;
    }

    public final void b() {
        m43 m43Var = this.e;
        if (m43Var != null) {
            try {
                this.a.unregisterReceiver(m43Var);
            } catch (RuntimeException e) {
                gh1.d("StreamVolumeManager", gh1.a("Error unregistering stream volume receiver", e));
            }
            this.e = null;
        }
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f = null;
        }
    }

    public final void c() {
        int a = a(this.d, this.g);
        AudioManager audioManager = this.d;
        int i = this.g;
        boolean isStreamMute = sb3.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        if (this.h == a && this.i == isStreamMute) {
            return;
        }
        this.h = a;
        this.i = isStreamMute;
        ((un0) this.c).a(isStreamMute, a);
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            gh1.d("StreamVolumeManager", gh1.a("Could not retrieve stream volume for stream type " + i, e));
            return audioManager.getStreamMaxVolume(i);
        }
    }
}
