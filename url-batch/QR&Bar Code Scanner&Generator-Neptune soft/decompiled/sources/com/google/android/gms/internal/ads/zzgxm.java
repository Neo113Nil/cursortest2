package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxm extends zzgxe {
    private static final zzgxv zza = zzgxj.zza(Collections.emptyMap());

    /* synthetic */ zzgxm(Map map, zzgxk zzgxkVar) {
        super(map);
    }

    public static zzgxl zzc(int i) {
        return new zzgxl(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzgxf.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgxv) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
