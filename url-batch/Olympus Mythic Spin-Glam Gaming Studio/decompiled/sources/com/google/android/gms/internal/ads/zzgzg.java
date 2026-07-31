package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgzg implements Comparator {
    protected zzgzg() {
    }

    public static zzgzg zzb() {
        return zzgze.zza;
    }

    public static zzgzg zzc(Comparator comparator) {
        return new zzgwv(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgzg zza() {
        return new zzgzp(this);
    }

    public final zzgzg zzd(zzgub zzgubVar) {
        return new zzgwh(zzgubVar, this);
    }
}
