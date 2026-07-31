package yads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda2;

/* loaded from: classes14.dex */
public final class kf0 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public jf0 d;

    public kf0(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.b = immersiveAudioLevel != 0;
    }

    public static kf0 a(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        spatializer = audioManager.getSpatializer();
        return new kf0(spatializer);
    }

    public final boolean b() {
        boolean isEnabled;
        isEnabled = this.a.isEnabled();
        return isEnabled;
    }

    public final void c() {
        jf0 jf0Var = this.d;
        if (jf0Var == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(jf0Var);
        Handler handler = this.c;
        int i = sb3.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final void a(pf0 pf0Var, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new jf0(pf0Var);
            Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda2(handler), this.d);
        }
    }

    public final boolean a() {
        boolean isAvailable;
        isAvailable = this.a.isAvailable();
        return isAvailable;
    }

    public final boolean a(nj njVar, jw0 jw0Var) {
        boolean canBeSpatialized;
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(sb3.a(("audio/eac3-joc".equals(jw0Var.m) && jw0Var.z == 16) ? 12 : jw0Var.z));
        int i = jw0Var.A;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        Spatializer spatializer = this.a;
        if (njVar.g == null) {
            njVar.g = new mj(njVar);
        }
        canBeSpatialized = spatializer.canBeSpatialized(njVar.g.a, channelMask.build());
        return canBeSpatialized;
    }
}
