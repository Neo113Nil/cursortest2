package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes14.dex */
public final class zzrd implements Supplier {
    private static final zzrd zza = new zzrd();
    private final Supplier zzb = Suppliers.ofInstance(new zzrf());

    public static boolean zzb() {
        zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzre get() {
        return (zzre) this.zzb.get();
    }
}
