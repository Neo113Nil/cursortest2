package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfsp implements Comparator {
    protected zzfsp() {
    }

    public static zzfsp zzb(Comparator comparator) {
        return comparator instanceof zzfsp ? (zzfsp) comparator : new zzfqt(comparator);
    }

    public static zzfsp zzc() {
        return zzfsn.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfsp zza() {
        return new zzfsy(this);
    }
}
