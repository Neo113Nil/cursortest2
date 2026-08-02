package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzblj {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    static zzblh zza() {
        return (zzblh) zzb.get();
    }

    static zzbli zzb() {
        return (zzbli) zzc.get();
    }

    public static void zzc(zzblh zzblhVar) {
        zzb.set(zzblhVar);
    }
}
