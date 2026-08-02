package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfeo {
    private final zzfdk zza;
    private final zzfdn zzb;
    private final zzego zzc;
    private final zzfkm zzd;
    private final zzfju zze;

    public zzfeo(zzego zzegoVar, zzfkm zzfkmVar, zzfdk zzfdkVar, zzfdn zzfdnVar, zzfju zzfjuVar) {
        this.zza = zzfdkVar;
        this.zzb = zzfdnVar;
        this.zzc = zzegoVar;
        this.zzd = zzfkmVar;
        this.zze = zzfjuVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzegq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
        }
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
