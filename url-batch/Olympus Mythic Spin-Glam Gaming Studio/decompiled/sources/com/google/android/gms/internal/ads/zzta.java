package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzta extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zztc zza;

    zzta(zztc zztcVar) {
        Objects.requireNonNull(zztcVar);
        this.zza = zztcVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzeg zzu = this.zza.zza.zzu();
        zzu.zze(-1, zzsz.zza);
        zzu.zzf();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzeg zzu = this.zza.zza.zzu();
        zzu.zze(-1, zzsx.zza);
        zzu.zzf();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzeg zzu = this.zza.zza.zzu();
        zzu.zze(-1, zzsy.zza);
        zzu.zzf();
    }
}
