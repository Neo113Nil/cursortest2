package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes13.dex */
public final class zzacr {

    @Nullable
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private final Handler zzc;

    @Nullable
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public final boolean zza() {
        return this.zza != null && this.zzb && zzc() && zzd();
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        boolean isAvailable;
        Spatializer spatializer = this.zza;
        if (spatializer == null) {
            return false;
        }
        isAvailable = spatializer.isAvailable();
        return isAvailable;
    }

    public final boolean zzd() {
        boolean isEnabled;
        Spatializer spatializer = this.zza;
        if (spatializer == null) {
            return false;
        }
        isEnabled = spatializer.isEnabled();
        return isEnabled;
    }

    public final boolean zze(zzd zzdVar, zzv zzvVar) {
        int i;
        boolean canBeSpatialized;
        if (!zza()) {
            return false;
        }
        String str = zzvVar.zzp;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i = zzvVar.zzI;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i = zzvVar.zzI;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i = zzvVar.zzI;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzvVar.zzI;
        }
        int i2 = zzvVar.zzJ;
        if (i2 == -1 || zzvVar.zzI != i) {
            i2 = zzfm.zzG(i);
        }
        if (i2 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i2);
        int i3 = zzvVar.zzK;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        canBeSpatialized = zzacr$$ExternalSyntheticApiModelOutline0.m(spatializer).canBeSpatialized(zzdVar.zza(), channelMask.build());
        return canBeSpatialized;
    }

    public final List zzf() {
        if (!zza()) {
            return zzgxm.zzi();
        }
        if (Build.VERSION.SDK_INT < 36) {
            return zzgxm.zzj(252);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return zzacr$$ExternalSyntheticApiModelOutline0.m(spatializer).getSpatializedChannelMasks();
    }

    public final void zzg() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public zzacr(@Nullable Context context, @Nullable Runnable runnable, @Nullable Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager zza = context == null ? null : zzcj.zza(context);
        if (zza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        spatializer = zza.getSpatializer();
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.zzb = immersiveAudioLevel != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        final Handler handler = new Handler(myLooper);
        this.zzc = handler;
        zzacp zzacpVar = new zzacp(this, runnable);
        this.zzd = zzacpVar;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzacq
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, zzacpVar);
    }
}
