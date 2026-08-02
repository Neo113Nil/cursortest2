package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
class zzfue implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfuf zzc;

    zzfue(zzfuf zzfufVar) {
        this.zzc = zzfufVar;
        this.zzb = zzfufVar.zzb;
        Collection collection = zzfufVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    zzfue(zzfuf zzfufVar, Iterator it) {
        this.zzc = zzfufVar;
        this.zzb = zzfufVar.zzb;
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
        zzfui.zze(this.zzc.zze);
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
