package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
abstract class zzidc implements Iterator {
    zzidd zza;
    zzidd zzb;
    int zzc;
    final /* synthetic */ zzide zzd;

    zzidc(zzide zzideVar) {
        Objects.requireNonNull(zzideVar);
        this.zzd = zzideVar;
        this.zza = zzideVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzideVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzidd zziddVar = this.zzb;
        if (zziddVar == null) {
            throw new IllegalStateException();
        }
        zzide zzideVar = this.zzd;
        zzideVar.zzd(zziddVar, true);
        this.zzb = null;
        this.zzc = zzideVar.zzc;
    }

    final zzidd zza() {
        zzide zzideVar = this.zzd;
        zzidd zziddVar = this.zza;
        if (zziddVar == zzideVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzideVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zziddVar.zzd;
        this.zzb = zziddVar;
        return zziddVar;
    }
}
