package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzgxd {
    final LinkedHashMap zza;

    zzgxd(int i) {
        this.zza = zzgxf.zzb(i);
    }

    final zzgxd zza(Object obj, zzgxv zzgxvVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgxq.zza(obj, "key");
        zzgxq.zza(zzgxvVar, "provider");
        linkedHashMap.put(obj, zzgxvVar);
        return this;
    }
}
