package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzglt {
    zzglt() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzgls zzglsVar = (zzgls) obj;
        if (zzglsVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzglsVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgls) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgls zzglsVar = (zzgls) obj;
        zzgls zzglsVar2 = (zzgls) obj2;
        if (!zzglsVar2.isEmpty()) {
            if (!zzglsVar.zze()) {
                zzglsVar = zzglsVar.zzb();
            }
            zzglsVar.zzd(zzglsVar2);
        }
        return zzglsVar;
    }
}
