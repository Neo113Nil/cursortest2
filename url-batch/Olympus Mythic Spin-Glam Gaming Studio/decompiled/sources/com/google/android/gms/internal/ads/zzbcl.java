package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbcl implements Runnable {
    final /* synthetic */ zzbcn zza;

    zzbcl(zzbcn zzbcnVar) {
        Objects.requireNonNull(zzbcnVar);
        this.zza = zzbcnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
