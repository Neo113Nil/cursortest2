package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzxs {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer.OnSpatializerStateChangedListener zzd;

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzd(zzc zzcVar, zzu zzuVar) {
        int i;
        String str = zzuVar.zzo;
        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            i = zzuVar.zzG;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, MimeTypes.AUDIO_IAMF)) {
            i = zzuVar.zzG;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, MimeTypes.AUDIO_AC4)) {
            i = zzuVar.zzG;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzuVar.zzG;
        }
        int zzB = zzeo.zzB(i);
        if (zzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzB);
        int i2 = zzuVar.zzH;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.canBeSpatialized(zzcVar.zza(), channelMask.build());
    }

    public final void zze() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (onSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public zzxs(Context context, zzyd zzydVar, Boolean bool) {
        AudioManager zza = context == null ? null : zzca.zza(context);
        if (zza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = zza.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        zzxq zzxqVar = new zzxq(this, zzydVar);
        this.zzd = zzxqVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        final Handler handler = new Handler(myLooper);
        this.zzc = handler;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzxr
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzxqVar);
    }

    public final boolean zzb() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.isEnabled();
    }
}
