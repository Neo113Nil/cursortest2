package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zziea extends zzieb {
    final /* synthetic */ zziei zza;
    private int zzb;
    private final int zzc;

    zziea(zziei zzieiVar) {
        Objects.requireNonNull(zzieiVar);
        this.zza = zzieiVar;
        this.zzb = 0;
        this.zzc = zzieiVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zza(i);
    }
}
