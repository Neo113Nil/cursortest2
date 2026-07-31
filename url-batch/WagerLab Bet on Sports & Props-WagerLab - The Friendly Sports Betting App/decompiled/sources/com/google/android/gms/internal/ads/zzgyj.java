package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgyj {
    private static final zzgyj zza = new zzgyj();
    private static final zzgyi zzb = new zzgyi(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgyj zza() {
        return zza;
    }

    public final zzgya zzb() {
        zzgya zzgyaVar = (zzgya) this.zzc.get();
        return zzgyaVar == null ? zzb : zzgyaVar;
    }
}
