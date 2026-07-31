package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
abstract class zzgwp implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgwt zze;

    /* synthetic */ zzgwp(zzgwt zzgwtVar, byte[] bArr) {
        Objects.requireNonNull(zzgwtVar);
        this.zze = zzgwtVar;
        this.zzb = zzgwtVar.zzs();
        this.zzc = zzgwtVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object zza = zza(i);
        this.zzc = this.zze.zzg(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzguk.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzgwt zzgwtVar = this.zze;
        zzgwtVar.remove(zzgwtVar.zzo(i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
