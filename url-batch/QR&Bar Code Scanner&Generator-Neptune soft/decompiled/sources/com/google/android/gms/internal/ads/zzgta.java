package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgta extends zzgpo {
    final zzgte zza;
    zzgpq zzb = zzb();
    final /* synthetic */ zzgtg zzc;

    zzgta(zzgtg zzgtgVar) {
        this.zzc = zzgtgVar;
        this.zza = new zzgte(zzgtgVar, null);
    }

    private final zzgpq zzb() {
        zzgte zzgteVar = this.zza;
        if (zzgteVar.hasNext()) {
            return zzgteVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final byte zza() {
        zzgpq zzgpqVar = this.zzb;
        if (zzgpqVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzgpqVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
