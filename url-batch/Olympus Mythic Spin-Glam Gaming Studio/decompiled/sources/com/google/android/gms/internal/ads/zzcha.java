package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcha implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzchj zzb;

    zzcha(zzchj zzchjVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzchjVar);
        this.zzb = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zzb;
        zzchjVar.zzs(this.zza);
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zzb();
        }
    }
}
