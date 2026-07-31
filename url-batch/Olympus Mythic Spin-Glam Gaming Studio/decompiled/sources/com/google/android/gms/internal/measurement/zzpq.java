package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes14.dex */
public final class zzpq implements Supplier {
    private static final zzpq zza = new zzpq();
    private final Supplier zzb = Suppliers.ofInstance(new zzps());

    public static boolean zzb() {
        zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return zza.get().zzb();
    }

    public static boolean zzd() {
        return zza.get().zzc();
    }

    public static boolean zze() {
        return zza.get().zzd();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpr get() {
        return (zzpr) this.zzb.get();
    }
}
