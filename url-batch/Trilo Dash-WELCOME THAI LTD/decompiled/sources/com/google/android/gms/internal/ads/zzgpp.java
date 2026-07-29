package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzgpp {
    final LinkedHashMap zza;

    zzgpp(int i) {
        this.zza = zzgpr.zzb(i);
    }

    final zzgpp zza(Object obj, zzgqh zzgqhVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgqc.zza(obj, "key");
        zzgqc.zza(zzgqhVar, "provider");
        linkedHashMap.put(obj, zzgqhVar);
        return this;
    }
}
