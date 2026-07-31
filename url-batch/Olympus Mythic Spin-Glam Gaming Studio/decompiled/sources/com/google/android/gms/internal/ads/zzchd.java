package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzchd implements Runnable {
    final /* synthetic */ zzchj zza;

    zzchd(zzchj zzchjVar) {
        Objects.requireNonNull(zzchjVar);
        this.zza = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zza;
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zza();
        }
    }
}
