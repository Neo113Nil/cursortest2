package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
class zzfpy implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfpz zzc;

    zzfpy(zzfpz zzfpzVar) {
        this.zzc = zzfpzVar;
        this.zzb = zzfpzVar.zzb;
        Collection collection = zzfpzVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    zzfpy(zzfpz zzfpzVar, Iterator it) {
        this.zzc = zzfpzVar;
        this.zzb = zzfpzVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzfqc.zze(this.zzc.zze);
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
