package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgpy extends zzgpq {
    private static final zzgqh zza = zzgpv.zza(Collections.emptyMap());

    /* synthetic */ zzgpy(Map map, zzgpw zzgpwVar) {
        super(map);
    }

    public static zzgpx zzc(int i) {
        return new zzgpx(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzgpr.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgqh) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
