package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhgt extends zzhgu {
    final /* synthetic */ zzhhb zza;
    private int zzb;
    private final int zzc;

    zzhgt(zzhhb zzhhbVar) {
        Objects.requireNonNull(zzhhbVar);
        this.zza = zzhhbVar;
        this.zzb = 0;
        this.zzc = zzhhbVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhgw
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
