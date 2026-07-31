package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbcf implements Runnable {
    final /* synthetic */ zzbcg zza;

    zzbcf(zzbcg zzbcgVar) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbjg.zza(this.zza.zza);
    }
}
