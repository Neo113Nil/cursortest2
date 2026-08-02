package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgry extends zzgsc {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgry() {
        super(null);
    }

    /* synthetic */ zzgry(zzgrx zzgrxVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzgrv zzgrvVar;
        List list = (List) zzgui.zzh(obj, j);
        if (list.isEmpty()) {
            List zzgrvVar2 = list instanceof zzgrw ? new zzgrv(i) : ((list instanceof zzgsv) && (list instanceof zzgrn)) ? ((zzgrn) list).zzd(i) : new ArrayList(i);
            zzgui.zzv(obj, j, zzgrvVar2);
            return zzgrvVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzgui.zzv(obj, j, arrayList);
            zzgrvVar = arrayList;
        } else {
            if (!(list instanceof zzgud)) {
                if (!(list instanceof zzgsv) || !(list instanceof zzgrn)) {
                    return list;
                }
                zzgrn zzgrnVar = (zzgrn) list;
                if (zzgrnVar.zzc()) {
                    return list;
                }
                zzgrn zzd = zzgrnVar.zzd(list.size() + i);
                zzgui.zzv(obj, j, zzd);
                return zzd;
            }
            zzgrv zzgrvVar3 = new zzgrv(list.size() + i);
            zzgrvVar3.addAll(zzgrvVar3.size(), (zzgud) list);
            zzgui.zzv(obj, j, zzgrvVar3);
            zzgrvVar = zzgrvVar3;
        }
        return zzgrvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgui.zzh(obj, j);
        if (list instanceof zzgrw) {
            unmodifiableList = ((zzgrw) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgsv) && (list instanceof zzgrn)) {
                zzgrn zzgrnVar = (zzgrn) list;
                if (zzgrnVar.zzc()) {
                    zzgrnVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgui.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgui.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgui.zzv(obj, j, list);
    }
}
