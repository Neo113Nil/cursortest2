package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhnr {
    private static final zzhnr zza = new zzhnr();
    private static final zzhnq zzb = new zzhnq(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhnr zza() {
        return zza;
    }

    public final zzhnj zzb() {
        zzhnj zzhnjVar = (zzhnj) this.zzc.get();
        return zzhnjVar == null ? zzb : zzhnjVar;
    }
}
