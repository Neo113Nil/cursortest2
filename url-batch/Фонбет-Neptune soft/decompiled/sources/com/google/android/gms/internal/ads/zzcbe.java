package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcbe {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzx)).longValue());
    private boolean zzc = true;

    zzcbe() {
    }

    public final void zza(SurfaceTexture surfaceTexture, final zzcap zzcapVar) {
        if (zzcapVar == null) {
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
        zzfru zzfruVar = com.google.android.gms.ads.internal.util.zzt.zza;
        Objects.requireNonNull(zzcapVar);
        zzfruVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbd
            @Override // java.lang.Runnable
            public final void run() {
                zzcap.this.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
