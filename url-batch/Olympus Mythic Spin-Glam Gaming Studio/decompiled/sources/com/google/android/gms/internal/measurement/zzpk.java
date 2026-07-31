package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes15.dex */
public final class zzpk implements Supplier {
    private static final zzpk zza = new zzpk();
    private final Supplier zzb = Suppliers.ofInstance(new zzpm());

    public static boolean zzb() {
        return zza.get().zza();
    }

    public static boolean zzc() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpl get() {
        return (zzpl) this.zzb.get();
    }
}
