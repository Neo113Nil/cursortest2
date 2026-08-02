package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgsw {
    private static final zzgsw zza = new zzgsw();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgti zzb = new zzgsg();

    private zzgsw() {
    }

    public static zzgsw zza() {
        return zza;
    }

    public final zzgth zzb(Class cls) {
        zzgro.zzf(cls, "messageType");
        zzgth zzgthVar = (zzgth) this.zzc.get(cls);
        if (zzgthVar == null) {
            zzgthVar = this.zzb.zza(cls);
            zzgro.zzf(cls, "messageType");
            zzgro.zzf(zzgthVar, "schema");
            zzgth zzgthVar2 = (zzgth) this.zzc.putIfAbsent(cls, zzgthVar);
            if (zzgthVar2 != null) {
                return zzgthVar2;
            }
        }
        return zzgthVar;
    }
}
