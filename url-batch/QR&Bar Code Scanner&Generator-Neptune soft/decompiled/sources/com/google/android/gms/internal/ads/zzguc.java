package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzguc implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgud zzb;

    zzguc(zzgud zzgudVar) {
        zzgrw zzgrwVar;
        this.zzb = zzgudVar;
        zzgrwVar = zzgudVar.zza;
        this.zza = zzgrwVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
