package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbkf {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    static zzbkd zza() {
        return (zzbkd) zzb.get();
    }

    static zzbke zzb() {
        return (zzbke) zzc.get();
    }

    public static void zzc(zzbkd zzbkdVar) {
        zzb.set(zzbkdVar);
    }
}
