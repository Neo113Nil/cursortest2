package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@Deprecated
/* loaded from: classes13.dex */
public final class zzbjt {
    private final Map zza = new HashMap();
    private final zzbjv zzb;

    public zzbjt(zzbjv zzbjvVar) {
        this.zzb = zzbjvVar;
    }

    public final void zza(String str, @Nullable zzbjs zzbjsVar) {
        this.zza.put(str, zzbjsVar);
    }

    public final void zzb(String str, String str2, long j) {
        Map map = this.zza;
        zzbjs zzbjsVar = (zzbjs) map.get(str2);
        String[] strArr = {str};
        if (zzbjsVar != null) {
            this.zzb.zzb(zzbjsVar, j, strArr);
        }
        map.put(str, new zzbjs(j, null, null));
    }

    public final zzbjv zzc() {
        return this.zzb;
    }
}
