package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcax {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzW)).longValue());
    private boolean zzc = true;

    zzcax() {
    }

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, final zzcai zzcaiVar) {
        if (zzcaiVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcaiVar);
        zzfroVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcai.this.zzi();
            }
        });
    }
}
