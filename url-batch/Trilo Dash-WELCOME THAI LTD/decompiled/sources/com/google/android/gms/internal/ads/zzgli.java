package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgli extends zzglm {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgli() {
        super(null);
    }

    /* synthetic */ zzgli(zzglh zzglhVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzglf zzglfVar;
        List list = (List) zzgns.zzh(obj, j);
        if (list.isEmpty()) {
            List zzglfVar2 = list instanceof zzglg ? new zzglf(i) : ((list instanceof zzgmf) && (list instanceof zzgkx)) ? ((zzgkx) list).zzd(i) : new ArrayList(i);
            zzgns.zzv(obj, j, zzglfVar2);
            return zzglfVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzgns.zzv(obj, j, arrayList);
            zzglfVar = arrayList;
        } else {
            if (!(list instanceof zzgnn)) {
                if (!(list instanceof zzgmf) || !(list instanceof zzgkx)) {
                    return list;
                }
                zzgkx zzgkxVar = (zzgkx) list;
                if (zzgkxVar.zzc()) {
                    return list;
                }
                zzgkx zzd = zzgkxVar.zzd(list.size() + i);
                zzgns.zzv(obj, j, zzd);
                return zzd;
            }
            zzglf zzglfVar3 = new zzglf(list.size() + i);
            zzglfVar3.addAll(zzglfVar3.size(), (zzgnn) list);
            zzgns.zzv(obj, j, zzglfVar3);
            zzglfVar = zzglfVar3;
        }
        return zzglfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgns.zzh(obj, j);
        if (list instanceof zzglg) {
            unmodifiableList = ((zzglg) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgmf) && (list instanceof zzgkx)) {
                zzgkx zzgkxVar = (zzgkx) list;
                if (zzgkxVar.zzc()) {
                    zzgkxVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgns.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgns.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgns.zzv(obj, j, list);
    }
}
