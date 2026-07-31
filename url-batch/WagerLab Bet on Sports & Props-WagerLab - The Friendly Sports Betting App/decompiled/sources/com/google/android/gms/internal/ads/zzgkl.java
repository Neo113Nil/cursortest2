package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgkl extends zzgmc {
    final /* synthetic */ zzgkm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgkl(zzgkm zzgkmVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgkmVar);
        this.zza = zzgkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmb
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
