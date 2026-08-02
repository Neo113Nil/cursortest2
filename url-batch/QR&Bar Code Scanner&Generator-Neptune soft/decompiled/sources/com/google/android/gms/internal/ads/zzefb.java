package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzefb implements zzfii {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfiq zzc;

    public zzefb(Set set, zzfiq zzfiqVar) {
        zzfib zzfibVar;
        String str;
        zzfib zzfibVar2;
        String str2;
        this.zzc = zzfiqVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzefa zzefaVar = (zzefa) it.next();
            Map map = this.zza;
            zzfibVar = zzefaVar.zzb;
            str = zzefaVar.zza;
            map.put(zzfibVar, str);
            Map map2 = this.zzb;
            zzfibVar2 = zzefaVar.zzc;
            str2 = zzefaVar.zza;
            map2.put(zzfibVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbF(zzfib zzfibVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbG(zzfib zzfibVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfibVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfibVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzc(zzfib zzfibVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfibVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfibVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzd(zzfib zzfibVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfibVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfibVar))), "s.");
        }
    }
}
