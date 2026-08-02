package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgrl extends AbstractList {
    private final List zza;
    private final zzgrk zzb;

    public zzgrl(List list, zzgrk zzgrkVar) {
        this.zza = list;
        this.zzb = zzgrkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzbfn zzb = zzbfn.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb == null ? zzbfn.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
