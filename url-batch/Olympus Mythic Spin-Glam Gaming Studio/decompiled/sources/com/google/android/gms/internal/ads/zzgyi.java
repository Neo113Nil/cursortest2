package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgyi extends zzgzz {
    final /* synthetic */ zzgyj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgyi(zzgyj zzgyjVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgyjVar);
        this.zza = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
