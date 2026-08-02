package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdxt implements zzfii {
    private final zzdxl zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdxt(zzdxl zzdxlVar, Set set, Clock clock) {
        zzfib zzfibVar;
        this.zzb = zzdxlVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdxs zzdxsVar = (zzdxs) it.next();
            Map map = this.zzd;
            zzfibVar = zzdxsVar.zzc;
            map.put(zzfibVar, zzdxsVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfib zzfibVar, boolean z) {
        zzfib zzfibVar2;
        String str;
        zzfibVar2 = ((zzdxs) this.zzd.get(zzfibVar)).zzb;
        String str2 = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzfibVar2)) {
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long longValue = ((Long) this.zza.get(zzfibVar2)).longValue();
            Map zza = this.zzb.zza();
            str = ((zzdxs) this.zzd.get(zzfibVar)).zza;
            zza.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime - longValue))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbF(zzfib zzfibVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbG(zzfib zzfibVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfibVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfibVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzfibVar)) {
            zze(zzfibVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzc(zzfib zzfibVar, String str) {
        this.zza.put(zzfibVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzd(zzfib zzfibVar, String str) {
        if (this.zza.containsKey(zzfibVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfibVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzfibVar)) {
            zze(zzfibVar, true);
        }
    }
}
