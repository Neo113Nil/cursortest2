package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbdr implements Runnable {
    final /* synthetic */ zzbds zza;

    zzbdr(zzbds zzbdsVar) {
        Objects.requireNonNull(zzbdsVar);
        this.zza = zzbdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
