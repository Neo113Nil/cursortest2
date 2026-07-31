package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgxr extends zzhaa {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgxu zzc;

    zzgxr(zzgxu zzgxuVar) {
        Objects.requireNonNull(zzgxuVar);
        this.zzc = zzgxuVar;
        this.zza = ((zzgxm) zzgxuVar.map.values()).listIterator(0);
        this.zzb = zzgyc.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgxi) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
