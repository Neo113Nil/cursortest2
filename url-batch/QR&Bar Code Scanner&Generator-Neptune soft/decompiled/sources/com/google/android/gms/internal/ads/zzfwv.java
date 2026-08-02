package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfwv implements Comparator {
    protected zzfwv() {
    }

    public static zzfwv zzb(Comparator comparator) {
        return comparator instanceof zzfwv ? (zzfwv) comparator : new zzfuz(comparator);
    }

    public static zzfwv zzc() {
        return zzfwt.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfwv zza() {
        return new zzfxe(this);
    }
}
