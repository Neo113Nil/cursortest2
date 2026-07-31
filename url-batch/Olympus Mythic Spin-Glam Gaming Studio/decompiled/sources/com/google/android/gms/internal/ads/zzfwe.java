package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzfwe implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfwf zzb;

    zzfwe(zzfwf zzfwfVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfwfVar);
        this.zzb = zzfwfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
