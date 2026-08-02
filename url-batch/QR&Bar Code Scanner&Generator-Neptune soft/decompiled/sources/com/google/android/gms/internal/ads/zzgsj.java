package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgsj {
    zzgsj() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzgsi zzgsiVar = (zzgsi) obj;
        if (zzgsiVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgsiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgsi) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgsi zzgsiVar = (zzgsi) obj;
        zzgsi zzgsiVar2 = (zzgsi) obj2;
        if (!zzgsiVar2.isEmpty()) {
            if (!zzgsiVar.zze()) {
                zzgsiVar = zzgsiVar.zzb();
            }
            zzgsiVar.zzd(zzgsiVar2);
        }
        return zzgsiVar;
    }
}
