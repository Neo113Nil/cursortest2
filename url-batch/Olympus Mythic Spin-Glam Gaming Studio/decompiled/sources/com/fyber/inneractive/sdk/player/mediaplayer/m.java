package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes15.dex */
public final class m implements Runnable {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.a;
        String b = pVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) pVar.a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", pVar.b(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        pVar.setVolume(f, f);
        IAlog.e(b + "timelog: unmute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
