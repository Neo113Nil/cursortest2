package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbjp {
    private final Map zza = new HashMap();
    private final zzbjr zzb;

    public zzbjp(zzbjr zzbjrVar) {
        this.zzb = zzbjrVar;
    }

    public final zzbjr zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbjo zzbjoVar) {
        this.zza.put(str, zzbjoVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbjr zzbjrVar = this.zzb;
        zzbjo zzbjoVar = (zzbjo) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbjoVar != null) {
            zzbjrVar.zze(zzbjoVar, j, strArr);
        }
        this.zza.put(str, new zzbjo(j, null, null));
    }
}
