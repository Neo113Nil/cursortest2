package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes14.dex */
public final class zzqx implements Supplier {
    private static final zzqx zza = new zzqx();
    private final Supplier zzb = Suppliers.ofInstance(new zzqz());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqy get() {
        return (zzqy) this.zzb.get();
    }
}
