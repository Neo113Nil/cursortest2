package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfvc {
    private static final zzfvc zza = new zzfva();
    private static final zzfvc zzb = new zzfvb(-1);
    private static final zzfvc zzc = new zzfvb(1);

    /* synthetic */ zzfvc(zzfva zzfvaVar) {
    }

    public static zzfvc zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfvc zzb(int i, int i2);

    public abstract zzfvc zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfvc zzd(boolean z, boolean z2);

    public abstract zzfvc zze(boolean z, boolean z2);
}
