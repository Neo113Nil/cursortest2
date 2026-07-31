package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticApiModelOutline6;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzch {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zzd zzd;

    @Nullable
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    zzch(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzd zzdVar, boolean z, boolean z2) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        this.zzc = handler;
        this.zzd = zzdVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.zzb = new zzcg(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            audioAttributes = AudioFocusManager$$ExternalSyntheticApiModelOutline6.m(1).setAudioAttributes(zzdVar.zza());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
            acceptsDelayedFocusGain = onAudioFocusChangeListener2.setAcceptsDelayedFocusGain(z2);
            audioFocusRequest = acceptsDelayedFocusGain.build();
        } else {
            audioFocusRequest = null;
        }
        this.zzf = audioFocusRequest;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        int i = zzchVar.zza;
        return Objects.equals(this.zzb, zzchVar.zzb) && Objects.equals(this.zzc, zzchVar.zzc) && Objects.equals(this.zzd, zzchVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, Boolean.FALSE);
    }

    public final zzd zza() {
        return this.zzd;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    @RequiresApi
    final AudioFocusRequest zzc() {
        Object obj = this.zzf;
        obj.getClass();
        return zzch$$ExternalSyntheticApiModelOutline2.m(obj);
    }
}
