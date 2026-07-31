package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzche implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzchj zzc;

    zzche(zzchj zzchjVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        Objects.requireNonNull(zzchjVar);
        this.zzc = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zzc;
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
