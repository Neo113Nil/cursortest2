package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgvn extends zzgyp {
    final /* synthetic */ zzgvp zza;

    zzgvn(zzgvp zzgvpVar) {
        Objects.requireNonNull(zzgvpVar);
        this.zza = zzgvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgwk.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgvo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgyp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgvp zzgvpVar = this.zza;
        zzgvpVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    final Map zza() {
        return this.zza;
    }
}
