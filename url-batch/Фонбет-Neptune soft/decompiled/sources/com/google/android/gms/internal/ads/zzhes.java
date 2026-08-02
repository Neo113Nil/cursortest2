package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhes implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhet zzb;

    zzhes(zzhet zzhetVar) {
        this.zzb = zzhetVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhet zzhetVar = this.zzb;
            zzhetVar.zza.add(zzhetVar.zzb.next());
            return next();
        }
        zzhet zzhetVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzhetVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
